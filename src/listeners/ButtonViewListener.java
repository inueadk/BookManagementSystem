package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.BookViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();	//버튼 누른 동작
		BookViewer viewer = frame.getBookviewer();	
		frame.setupPanel(viewer);	//BookViewer에 있는 것으로 패널을 다시 설정

	}

}
