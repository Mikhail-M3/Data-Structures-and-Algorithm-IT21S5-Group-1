package librarySystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JEditorPane;
import javax.swing.JButton;

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
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(594, 401, 109, 116);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(247, 401, 109, 116);
		contentPane.add(btnNewButton_2);
		
		JButton RemoveBook = new JButton("");
		RemoveBook.setBounds(758, 146, 109, 116);
		contentPane.add(RemoveBook);
		
		JButton InsertBook = new JButton("");
		InsertBook.setBounds(420, 146, 109, 116);
		contentPane.add(InsertBook);
		
		JButton AddBook = new JButton("");
		AddBook.setBackground(new Color(255, 255, 255));
		AddBook.setToolTipText("");
		AddBook.setBounds(95, 146, 109, 116);
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
