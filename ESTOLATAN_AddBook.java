package librarySystem;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class AddBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultTableModel tableModel;
	private LibrarySystem library;
	
	public AddBook(LibrarySystem library) {
		this.library = library;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Visitor\\Downloads\\logo2.png"));
		setTitle("BOOKWORM LIBRARY SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 846, 89);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel Logo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logo2.png")) .getImage();
		Logo.setIcon(new ImageIcon(img));
		Logo.setBounds(20, 9, 80, 73);
		panel.add(Logo);

		JLabel Title = new JLabel("BookWorm Library System");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 35));
		Title.setBounds(150, 15, 595, 54);
		panel.add(Title);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 88, 846, 537);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JTextArea txtBookName = new JTextArea();
		txtBookName.setWrapStyleWord(true);
		txtBookName.setLineWrap(true);
		txtBookName.setBounds(22, 177, 406, 72);
		txtBookName.setColumns(10);
		panel_1.add(txtBookName);

		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(24, 177, 407, 75);
		panel_1.add(textArea);

		
		JButton btnNewButton = new JButton("Add Book");
		btnNewButton.setBorder(UIManager.getBorder("ToolBar.border"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookName = txtBookName.getText().trim();

				if (bookName.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Book name must be filled.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					library.addBook(bookName);
					updateTable();
					JOptionPane.showMessageDialog(null, "Book '" + bookName + "' has been added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
					txtBookName.setText("");

				}
			}

		});

		String[] columnNames = {"Position", "Name"};
		tableModel = new DefaultTableModel(columnNames, 0);
		JTable table = new JTable(tableModel);

		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setRowHeight(30);
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));

		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 15));
		btnNewButton.setBounds(22, 276, 124, 23);
		panel_1.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Enter the name of the New Book:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel_1.setBounds(22, 141, 278, 14);
		panel_1.add(lblNewLabel_1);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBorder(UIManager.getBorder("ToolBar.border"));
		scrollPane.setBounds(456, 66, 374, 431);
		panel_1.add(scrollPane);


		JLabel lblUpdatedListOf = new JLabel("Updated List of Books: ");
		lblUpdatedListOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdatedListOf.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblUpdatedListOf.setBounds(470, 11, 207, 44);
		panel_1.add(lblUpdatedListOf);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book tr = new Book(library);
                tr.setVisible(true);
                dispose();
			}
		});
		backButton.setForeground(Color.WHITE);
		backButton.setFont(new Font("Monospaced", Font.BOLD, 15));
		backButton.setBorder(UIManager.getBorder("ToolBar.border"));
		backButton.setBackground(new Color(0, 0, 128));
		backButton.setBounds(156, 276, 124, 23);
		panel_1.add(backButton);


	}

	private void updateTable() {
		tableModel.setRowCount(0); 

		int totalBooks = library.getTotalBooks();
		for (int i = 0; i < totalBooks; i++) {
			String position = String.valueOf(i);
			String name = library.getBook(i);
			tableModel.addRow(new Object[]{position, name});

		}

	}
}
