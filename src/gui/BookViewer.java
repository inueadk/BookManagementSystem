package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookViewer extends JPanel {
	
	WindowFrame frame;
	
	public BookViewer(WindowFrame frame) {
		this.frame = frame;

		DefaultTableModel model = new DefaultTableModel();	
		//�÷� �߰�
		model.addColumn("Id");
		model.addColumn("Title");
		model.addColumn("Writer");
		model.addColumn("Publisher");
		//���̺� ����
		JTable table = new JTable(model);	//���̺��� �÷� �����Ѵ�
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);	//�����ӿ� ������ ���̺� �߰�		
	}
}