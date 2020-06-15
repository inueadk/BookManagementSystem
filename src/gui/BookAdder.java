package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BookAdder extends JPanel {
	
	WindowFrame frame; //클래스마다 이것이 있어야 버튼 눌렀을 때 창 넘어가는 것이 가능
	
	public BookAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		//프레임에서 ID 입력 받는 부분
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		//프레임에서 제목 입력 받는 부분
		JLabel labelTitle = new JLabel("Title: ", JLabel.TRAILING);
		JTextField fieldTitle = new JTextField(10);
		labelTitle.setLabelFor(fieldTitle);
		panel.add(labelTitle);
		panel.add(fieldTitle);
		//프레임에서 작가 입력 받는 부분
		JLabel labelWriter = new JLabel("Writer: ", JLabel.TRAILING);
		JTextField fieldWriter = new JTextField(10);
		labelWriter.setLabelFor(fieldWriter);
		panel.add(labelWriter);
		panel.add(fieldWriter);
		//프레임에서 출판사 입력 받는 부분
		JLabel labelPublisher = new JLabel("Publisher: ", JLabel.TRAILING);
		JTextField fieldPublisher = new JTextField(10);
		labelPublisher.setLabelFor(fieldPublisher);
		panel.add(labelPublisher);
		panel.add(fieldPublisher);
		//패널에 버튼 추가
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		//프레임(창) 설정
		this.add(panel);
//		this.setVisible(true);	//보이게 하기
	}
}
