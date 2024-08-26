package Prelim;

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
import javax.swing.border.LineBorder;

public class LibraryMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibraryMain frame = new LibraryMain();
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
	public LibraryMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(215, 206, 211));
		panel_1.setBounds(164, 138, 646, 464);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton AddBook = new JButton("Add Books");
		AddBook.setFont(new Font("Centaur", Font.BOLD, 20));
	    
		AddBook.setBounds(71, 110, 238, 125);
		panel_1.add(AddBook);
		AddBook.setHorizontalAlignment(SwingConstants.LEFT);
		AddBook.setForeground(new Color(0, 0, 0));
		AddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AddBook.setBackground(new Color(255, 128, 128));
		AddBook.setToolTipText("");
		AddBook.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\IT21S5\\IT21S5_DSA\\img\\addBook.png"));
		
		JButton RemoveBook = new JButton("List of Books");
		RemoveBook.setFont(new Font("Centaur", Font.BOLD, 18));
		RemoveBook.setBackground(new Color(255, 128, 128));
		RemoveBook.setBounds(344, 269, 238, 125);
		panel_1.add(RemoveBook);
		RemoveBook.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\IT21S5\\IT21S5_DSA\\img\\listofBooks.png"));
		RemoveBook.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton InsertBook = new JButton("Remove Books");
		InsertBook.setFont(new Font("Centaur", Font.BOLD, 15));
		InsertBook.setBackground(new Color(255, 128, 128));
		InsertBook.setBounds(344, 110, 238, 125);
		panel_1.add(InsertBook);
		InsertBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		InsertBook.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\IT21S5\\IT21S5_DSA\\img\\removeBook.png")) ;
		InsertBook.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnNewButton_3 = new JButton("Search Books");
		btnNewButton_3.setFont(new Font("Centaur", Font.BOLD, 17));
		btnNewButton_3.setBackground(new Color(255, 128, 128));
		btnNewButton_3.setBounds(71, 269, 238, 125);
		panel_1.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\IT21S5\\IT21S5_DSA\\img\\searchBook.png"));
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_4 = new JLabel("Services");
		lblNewLabel_4.setForeground(new Color(0, 0, 255));
		lblNewLabel_4.setBackground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Centaur", Font.BOLD, 50));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(125, 23, 386, 65);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(200, 23, 231, 65);
		panel_1.add(panel_2);
		RemoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(0, 89, 0, 0);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 979, 89);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\IT21S5\\IT21S5_DSA\\img\\logo2.png"));
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
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\IT21S5\\IT21S5_DSA\\img\\bgimg.jpg"));
		lblNewLabel_2.setBounds(-45, 89, 1071, 576);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
