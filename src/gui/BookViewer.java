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
	BookManager bookManager;	//12���� �߰�
	
	public BookViewer(WindowFrame frame, BookManager bookManager) {
		this.frame = frame;
		this.bookManager = bookManager;	//12���� �߰� viwer���� bookManager�� ������ �޾Ƶ���.

		System.out.println("***" + bookManager.size() + "***");	//12���� �߰� - å ������ ���
		DefaultTableModel model = new DefaultTableModel();	
		//�÷� �߰�
		model.addColumn("Id");
		model.addColumn("Title");
		model.addColumn("Writer");
		model.addColumn("Publisher");
		//12���� �߰� -->�ε��� ���� �޾Ƽ� gui���� �ε��� �� ���� ���
		for(int i = 0; i<bookManager.size(); i++) {
			Vector row = new Vector();
			BookInput bi = bookManager.get(i);
			row.add(bi.getId());
			row.add(bi.getTitle());
			row.add(bi.getWriter());
			row.add(bi.getPublisher());
			model.addRow(row);
		}
		//���̺� ����
		JTable table = new JTable(model);	//���̺��� �÷� �����Ѵ�
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);	//�����ӿ� ������ ���̺� �߰�		
	}
}
