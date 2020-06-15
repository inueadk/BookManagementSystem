package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import book.BookInput;
import manager.BookManager;

public class BookViewer extends JPanel {
	
	WindowFrame frame;
	BookManager bookManager;	//12주차 추가
	
	public BookViewer(WindowFrame frame, BookManager bookManager) {
		this.frame = frame;
		this.bookManager = bookManager;	//12주차 추가 viwer에서 bookManager의 내용을 받아들임.

		System.out.println("***" + bookManager.size() + "***");	//12주차 추가 - 책 사이즈 출력
		DefaultTableModel model = new DefaultTableModel();	
		//컬럼 추가
		model.addColumn("Id");
		model.addColumn("Title");
		model.addColumn("Writer");
		model.addColumn("Publisher");
		//12주차 추가 -->인덱스 정보 받아서 gui에서 인덱스 별 정보 출력
		for(int i = 0; i<bookManager.size(); i++) {
			Vector row = new Vector();
			BookInput bi = bookManager.get(i);
			row.add(bi.getId());
			row.add(bi.getTitle());
			row.add(bi.getWriter());
			row.add(bi.getPublisher());
			model.addRow(row);
		}
		//테이블 생성
		JTable table = new JTable(model);	//테이블이 컬럼 포함한다
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);	//프레임에 생성한 테이블 추가		
	}
}
