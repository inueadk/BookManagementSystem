package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	BookAdder bookadder;
	BookViewer bookviewer;

	public WindowFrame() { //JFrame을 여러번 extends 안하려고 만든 클래스 대신 다른 클래스들은 JPanel 상속
		//여러 gui 클래스들에서 겹치는것 설정 여기서 다 함
		this.menuselection = new MenuSelection(this);
		this.bookadder = new BookAdder(this);
		this.bookviewer = new BookViewer(this);
		
		this.setSize(500,300);	//프레임 사이즈 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//프레임에서 x누르면 실행 종료

		this.setupPanel(menuselection);
		
		this.setVisible(true);	//프레임 보이게 하기
	}

	public void setupPanel(JPanel panel) {	//panel설정 함수
		this.getContentPane().removeAll();	// 창 내용 다 지우기
		this.getContentPane().add(panel);	
		this.revalidate();
		this.repaint();
	} 
	
	//getter, setter함수
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public BookAdder getBookadder() {
		return bookadder;
	}

	public void setBookadder(BookAdder bookadder) {
		this.bookadder = bookadder;
	}

	public BookViewer getBookviewer() {
		return bookviewer;
	}

	public void setBookviewer(BookViewer bookviewer) {
		this.bookviewer = bookviewer;
	}
}
