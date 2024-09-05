package librarySystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import java.awt.Color;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class BookTotal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private LibrarySystem library;
	
	
	
	
	public BookTotal(LibrarySystem library) {
		 this.library = library; 	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		 String[] columnNames = {"Postion", "Title"};
	        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	        JTable table_1 = new JTable(model);
		
	        int totalBooks = library.getTotalBooks();
	        for (int i = 0; i < totalBooks; i++) {
	            String Position = String.valueOf(i);
	            String Title = library.getBook(i);
	            model.addRow(new Object[]{ Position, Title, });
	        }
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setForeground(Color.BLACK);
		panel_1_1.setBackground(new Color(0, 128, 192));
		panel_1_1.setBounds(32, 123, 847, 499);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		

		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(39, 34, 765, 406);
		panel_1_1.add(scrollPane);
		
		table_1.setRowHeight(30);
		table_1.setFont(new Font("Arial", Font.PLAIN, 16));
		scrollPane.setViewportView(table_1);
		
		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book home = new Book(null);
				home.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_1.setForeground(Color.BLACK);
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setBounds(657, 450, 147, 39);
		panel_1_1.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 85, 690, 576);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 128, 192));
		panel_1.setBounds(0, 0, 910, 89);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Anton Patrick\\Desktop\\BookJframe\\logo2.png"));
		lblNewLabel_3.setBounds(20, 9, 80, 73);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("BookWorm Library System");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1_1.setBounds(213, 9, 480, 54);
		panel_1.add(lblNewLabel_1_1);
	}
}
