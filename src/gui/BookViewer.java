package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookViewer extends JFrame {
	public BookViewer() {

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
		this.setSize(300, 300); 	//������ ũ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//x������ ������(â)���� ���� ����
		this.setVisible(true);	//���̰� �ϱ�
		
	}

}
