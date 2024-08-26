package librarySystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class BookJframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookJframe frame = new BookJframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BookJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ListOfBooks = new JButton("List of Books");
		ListOfBooks.setForeground(Color.WHITE);
		ListOfBooks.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		ListOfBooks.setBackground(new Color(128, 64, 6));
		Image img5 = new ImageIcon(this.getClass().getResource("/listofBooks.png")) .getImage();
		ListOfBooks.setIcon(new ImageIcon(img5));
		ListOfBooks.setBounds(551, 374, 250, 143);
		contentPane.add(ListOfBooks);
		
		JButton RemoveBook = new JButton("Remove Book");
		RemoveBook.setForeground(Color.WHITE);
		RemoveBook.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		RemoveBook.setBackground(new Color(128, 64, 6));
		Image img3 = new ImageIcon(this.getClass().getResource("/removeBook.png")) .getImage();
		RemoveBook.setIcon(new ImageIcon(img3));
		RemoveBook.setBounds(670, 146, 250, 143);
		contentPane.add(RemoveBook);
		
		JButton SearchBook = new JButton("   Search Book");
		SearchBook.setForeground(Color.WHITE);
		SearchBook.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		SearchBook.setBackground(new Color(128, 64, 6));
		Image img4 = new ImageIcon(this.getClass().getResource("/searchBook.png")) .getImage();
		SearchBook.setIcon(new ImageIcon(img4));
		SearchBook.setBounds(157, 374, 250, 143);
		contentPane.add(SearchBook);
		
		JButton AddBook = new JButton("Add New Book");
		AddBook.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		AddBook.setForeground(new Color(255, 255, 255));
		AddBook.setBackground(new Color(128, 64, 6));
		Image img2 = new ImageIcon(this.getClass().getResource("/addBook.png")) .getImage();
		AddBook.setIcon(new ImageIcon(img2));
		AddBook.setBounds(47, 146, 250, 143);
		contentPane.add(AddBook);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 89, 0, 0);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 64, 0));
		panel.setBounds(0, 0, 979, 89);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logo2.png")) .getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(20, 9, 80, 73);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BookWorm Library System");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(198, 15, 595, 54);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Visitor\\Downloads\\bgimg.jpg"));
		lblNewLabel_2.setBounds(0, 89, 979, 576);
		contentPane.add(lblNewLabel_2);
	}
}
