package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookViewer extends JFrame {
	public BookViewer() {

		DefaultTableModel model = new DefaultTableModel();	
		//컬럼 추가
		model.addColumn("Id");
		model.addColumn("Title");
		model.addColumn("Writer");
		model.addColumn("Publisher");
		//테이블 생성
		JTable table = new JTable(model);	//테이블이 컬럼 포함한다
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);	//프레임에 생성한 테이블 추가
		this.setSize(300, 300); 	//프레임 크기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x누르면 프레임(창)끄고 실행 종료
		this.setVisible(true);	//보이게 하기
		
	}

}
