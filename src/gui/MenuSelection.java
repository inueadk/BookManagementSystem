package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame){
		
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();	//패널 생성
		JPanel panel2 = new JPanel();	//패널 생성
		JLabel label = new JLabel("Menu Selection");	//라벨(레이블)생성(내용: Menu Selection)
		//버튼 생성
		JButton button1 = new JButton("Add Book");
		JButton button2 = new JButton("Delete Book");
		JButton button3 = new JButton("Edit Book");
		JButton button4 = new JButton("View Book");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));	//버튼1 눌렀을 때 액션 
		button4.addActionListener(new ButtonViewListener(frame));	//버튼4 눌렀을 때 액션 
		
		//패널1에 라벨(레이블) 추가
		panel1.add(label);
		//패널2에 버튼 1,2,3,4,5 추가
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);	//프레임 레이아웃 북쪽에 label추가
		this.add(panel2, BorderLayout.CENTER);	//패널을 프레임 레이아웃 센터에 붙이기
	}

}
