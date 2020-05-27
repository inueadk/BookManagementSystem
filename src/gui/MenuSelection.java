package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	
	public MenuSelection(){
		this.setSize(300,300);	//프레임 사이즈 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//프레임에서 x누르면 실행 종료
		
		JPanel panel1 = new JPanel();	//패널 생성
		JPanel panel2 = new JPanel();	//패널 생성
		JLabel label = new JLabel("Menu Selection");	//라벨(레이블)생성(내용: Menu Selection)
		//버튼 생성
		JButton button1 = new JButton("Add Book");
		JButton button2 = new JButton("Delete Book");
		JButton button3 = new JButton("Edit Book");
		JButton button4 = new JButton("View Book");
		JButton button5 = new JButton("Exit Program");
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
		this.setVisible(true);	//프레임 보이게 하기
	}

}
