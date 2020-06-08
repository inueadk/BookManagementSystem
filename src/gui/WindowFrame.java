package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	BookAdder bookadder;
	BookViewer bookviewer;

	public WindowFrame() { //JFrame�� ������ extends ���Ϸ��� ���� Ŭ���� ��� �ٸ� Ŭ�������� JPanel ���
		//���� gui Ŭ�����鿡�� ��ġ�°� ���� ���⼭ �� ��
		this.menuselection = new MenuSelection(this);
		this.bookadder = new BookAdder(this);
		this.bookviewer = new BookViewer(this);
		
		this.setSize(500,300);	//������ ������ ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//�����ӿ��� x������ ���� ����

		this.setupPanel(menuselection);
		
		this.setVisible(true);	//������ ���̰� �ϱ�
	}

	public void setupPanel(JPanel panel) {	//panel���� �Լ�
		this.getContentPane().removeAll();	// â ���� �� �����
		this.getContentPane().add(panel);	
		this.revalidate();
		this.repaint();
	} 
	
	//getter, setter�Լ�
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
