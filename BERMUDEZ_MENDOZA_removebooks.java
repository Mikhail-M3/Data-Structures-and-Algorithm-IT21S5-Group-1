package Prelim;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BERMUDEZ_MENDOZA_removebooks extends JFrame {

    private ArrayList<String> bname;
    private DefaultListModel<String> bookListModel;
    private JList<String> bookList;
    private JTextField bookInputField;
    private JTextField removeIndexField;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
    public BERMUDEZ_MENDOZA_removebooks() {
        
        bname = new ArrayList<>();
        bname.add("The Adventures of Tom Sawyer");
        bname.add("Indiana Jones");
        bname.add("Warhammer 400");
        bname.add("The Tales of Albert");


        setTitle("Library Management System");
        setSize(871, 592);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
        bookListModel = new DefaultListModel<>();
        updateBookListModel();
        getContentPane().setLayout(null);
        bookList = new JList<>(bookListModel);
        bookList.setBounds(205, 207, 473, 193);
        getContentPane().add(bookList);
        
        panel = new JPanel();
        panel.setBackground(new Color(0, 128, 192));
        panel.setBounds(0, 0, 860, 90);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Junel\\Downloads\\IT21S5_Group1\\IT21S5\\IT21S5_DSA\\img\\logo2.png"));
        lblNewLabel_1.setBounds(10, 11, 93, 68);
        panel.add(lblNewLabel_1);
        
        panel_1 = new JPanel();
        panel_1.setBounds(179, 424, 512, 77);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JButton addBookButton = new JButton("Add Book");
        addBookButton.setBounds(10, 11, 115, 23);
        panel_1.add(addBookButton);
        addBookButton.setBackground(new Color(245, 222, 179));
        bookInputField = new JTextField();
        bookInputField.setBounds(154, 11, 348, 23);
        panel_1.add(bookInputField);
        
        JButton removeBookButton = new JButton("Remove Book");
        removeBookButton.setBounds(10, 45, 115, 23);
        panel_1.add(removeBookButton);
        removeBookButton.setBackground(new Color(255, 245, 238));
        removeIndexField = new JTextField();
        removeIndexField.setBounds(154, 45, 348, 23);
        panel_1.add(removeIndexField);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Junel\\Downloads\\IT21S5_Group1\\IT21S5\\IT21S5_DSA\\img\\bgimg.jpg"));
        lblNewLabel.setBounds(0, 81, 860, 479);
        getContentPane().add(lblNewLabel);
        
        removeBookButton.addActionListener(new RemoveBookListener());
        addBookButton.addActionListener(new AddBookListener());
    }

    private void updateBookListModel() {
        bookListModel.clear();
        for (String book : bname) {
            bookListModel.addElement(book);
        }
    }

    private class AddBookListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String newBook = bookInputField.getText().trim();
            if (!newBook.isEmpty()) {
                bname.add(newBook);
                updateBookListModel();
                bookInputField.setText("");
            }
        }
    }

    private class RemoveBookListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int index = Integer.parseInt(removeIndexField.getText().trim()) - 1;
                if (index >= 0 && index < bname.size()) {
                    bname.remove(index);
                    updateBookListModel();
                    removeIndexField.setText("");
                } else {
                    JOptionPane.showMessageDialog(BERMUDEZ_MENDOZA_removebooks.this, "Invalid index", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(BERMUDEZ_MENDOZA_removebooks.this, "Invalid number format", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {       	
        	BERMUDEZ_MENDOZA_removebooks removebooks = new BERMUDEZ_MENDOZA_removebooks();
        	BERMUDEZ_MENDOZA_removebooks bermudez_MENDOZA_removebooks = new BERMUDEZ_MENDOZA_removebooks();
			bermudez_MENDOZA_removebooks.setVisible(true);
        });
    }
}

