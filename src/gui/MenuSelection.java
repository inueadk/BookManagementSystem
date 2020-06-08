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
		
		JPanel panel1 = new JPanel();	//�г� ����
		JPanel panel2 = new JPanel();	//�г� ����
		JLabel label = new JLabel("Menu Selection");	//��(���̺�)����(����: Menu Selection)
		//��ư ����
		JButton button1 = new JButton("Add Book");
		JButton button2 = new JButton("Delete Book");
		JButton button3 = new JButton("Edit Book");
		JButton button4 = new JButton("View Book");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAddListener(frame));	//��ư1 ������ �� �׼� 
		button4.addActionListener(new ButtonViewListener(frame));	//��ư4 ������ �� �׼� 
		
		//�г�1�� ��(���̺�) �߰�
		panel1.add(label);
		//�г�2�� ��ư 1,2,3,4,5 �߰�
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);	//������ ���̾ƿ� ���ʿ� label�߰�
		this.add(panel2, BorderLayout.CENTER);	//�г��� ������ ���̾ƿ� ���Ϳ� ���̱�
	}

}
