package librarySystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBook extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtPosition;
    private DefaultTableModel tableModel;
    private LibrarySystem library;
    private JTable table_1;

    public SearchBook(LibrarySystem library) {
    	
        this.library = library; 
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 883, 560);
        getContentPane().setLayout(null);
        
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Book tr = new Book(library);
        		tr.setVisible(true);
        		dispose();
        	}
        });
        
        JButton btnBack_1 = new JButton("Back");
        btnBack_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Book tr = new Book(library);
        		tr.setVisible(true);
        		dispose();
        	}
        });
        btnBack_1.setFont(new Font("Georgia", Font.PLAIN, 16));
        btnBack_1.setBorder(UIManager.getBorder("ToolBar.border"));
        btnBack_1.setBackground(new Color(255, 255, 224));
        btnBack_1.setBounds(190, 332, 108, 25);
        btnBack_1.setForeground(new Color(255, 255, 255));
        btnBack_1.setBackground(new Color(0, 0, 128));
        btnBack_1.setFont(new Font("Monospaced", Font.BOLD, 15));
        btnBack_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        getContentPane().add(btnBack_1);
        
        

  
        JLabel lblNewLabel = new JLabel("Find Book:");
        lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
        lblNewLabel.setBounds(47, 167, 285, 43);
        getContentPane().add(lblNewLabel);


        JLabel lblPosition = new JLabel("Index position of the Book:");
        lblPosition.setFont(new Font("Javanese Text", Font.PLAIN, 20));
        lblPosition.setBounds(72, 240, 240, 25);
        getContentPane().add(lblPosition);


        txtPosition = new JTextField();
        txtPosition.setBounds(72, 285, 240, 25);
        getContentPane().add(txtPosition);
        txtPosition.setColumns(10);


        JButton btnFindBook = new JButton("Find Book");
        btnFindBook.setBackground(new Color(0, 0, 128));
        btnFindBook.setBorder(UIManager.getBorder("ToolBar.border"));
        btnFindBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnFindBook.setFont(new Font("Monospaced", Font.BOLD, 15));
        btnFindBook.setForeground(new Color(255, 255, 255));
        btnFindBook.setBounds(72, 332, 108, 25);
        getContentPane().add(btnFindBook);

        String[] columnNames = {"Position", "Name"};
		tableModel = new DefaultTableModel(columnNames, 0);
		JTable table = new JTable(tableModel);

		table.setFont(new Font("Arial", Font.PLAIN, 16));
		table.setRowHeight(30);
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
		
        JScrollPane scrollPane2 = new JScrollPane(table);
        scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane2.setBounds(408, 149, 400, 361);
        getContentPane().add(scrollPane2);
		
        btnFindBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {     
            	String positionText = txtPosition.getText();
                if (positionText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a position.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!isNumeric(positionText)) {
                    JOptionPane.showMessageDialog(null, "Invalid position. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    int position = Integer.parseInt(positionText);

                    if (position < 0 || position >= library.getTotalBooks()) {
                        JOptionPane.showMessageDialog(null, "Book Not Found.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String foundBook = library.getBook(position); 
                        updateTable();
                        tableModel.setRowCount(0); 
                        tableModel.addRow(new Object[]{position, foundBook,});                      
                        txtPosition.setText("");                    
                        table_1 = new JTable();
                        //updateTable();
                        table_1.setModel(new DefaultTableModel(
                        	new Object[][] {
                        	},
                        	new String[] {
                        		"Position", foundBook
                        	}
                        	
                        ));
                    }
            }
            }});

  
		
        JTextField textField = new JTextField();
        textField.setEnabled(false);
        textField.setBorder(UIManager.getBorder("ToolBar.border"));
        textField.setEditable(false);
        textField.setBackground(new Color(255, 255, 255));
        textField.setBounds(47, 221, 285, 147);
        getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblFoundBook = new JLabel("Found Book:");
        lblFoundBook.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 30));
        lblFoundBook.setBounds(408, 99, 177, 35);
        getContentPane().add(lblFoundBook);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(0, 128, 192));
        panel.setBounds(0, 0, 867, 89);
        getContentPane().add(panel);
        
        JLabel Logo = new JLabel("");
        Logo.setIcon(new ImageIcon("C:\\Users\\Visitor\\Downloads\\dsa_pics\\logo2.png"));
        Logo.setBounds(20, 9, 80, 73);
        panel.add(Logo);
        
        JLabel Title = new JLabel("BookWorm Library System");
        Title.setHorizontalAlignment(SwingConstants.CENTER);
        Title.setForeground(Color.WHITE);
        Title.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 35));
        Title.setBounds(150, 15, 595, 54);
        panel.add(Title);
    }


    protected void updateTable() {
    	 tableModel.setRowCount(0); 

         int totalBooks = library.getTotalBooks();
         for (int i = 0; i < totalBooks; i++) {
             String position = String.valueOf(i);
             String name = library.getBook(i);
             tableModel.addRow(new Object[]{position, name});}		
	}


	private boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }
}
