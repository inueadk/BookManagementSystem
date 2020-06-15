package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class BookAdder extends JPanel {
	
	WindowFrame frame; //Ŭ�������� �̰��� �־�� ��ư ������ �� â �Ѿ�� ���� ����
	
	public BookAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		//�����ӿ��� ID �Է� �޴� �κ�
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		//�����ӿ��� ���� �Է� �޴� �κ�
		JLabel labelTitle = new JLabel("Title: ", JLabel.TRAILING);
		JTextField fieldTitle = new JTextField(10);
		labelTitle.setLabelFor(fieldTitle);
		panel.add(labelTitle);
		panel.add(fieldTitle);
		//�����ӿ��� �۰� �Է� �޴� �κ�
		JLabel labelWriter = new JLabel("Writer: ", JLabel.TRAILING);
		JTextField fieldWriter = new JTextField(10);
		labelWriter.setLabelFor(fieldWriter);
		panel.add(labelWriter);
		panel.add(fieldWriter);
		//�����ӿ��� ���ǻ� �Է� �޴� �κ�
		JLabel labelPublisher = new JLabel("Publisher: ", JLabel.TRAILING);
		JTextField fieldPublisher = new JTextField(10);
		labelPublisher.setLabelFor(fieldPublisher);
		panel.add(labelPublisher);
		panel.add(fieldPublisher);
		//�гο� ��ư �߰�
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		//������(â) ����
		this.add(panel);
//		this.setVisible(true);	//���̰� �ϱ�
	}
}
