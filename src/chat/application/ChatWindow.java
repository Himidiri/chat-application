package chat.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatWindow extends JFrame {

    private JLabel lblTitle;
    private JButton btnSend, btnAddUser;
    private JTextArea chatArea;
    private JTextField messageField;

    ChatWindow(String userName) {
        
        setSize(650, 430);
        setTitle(userName);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Title and Add User Button 
        JPanel titlePanel = new JPanel(new BorderLayout());

        lblTitle = new JLabel(userName);
        lblTitle.setFont(new Font("", 1, 40));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setOpaque(true);
        lblTitle.setBackground(new Color(39, 73, 53));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        // Add User Button
        btnAddUser = new JButton("+");
        btnAddUser.setFont(new Font("", 1, 40));
        btnAddUser.setBackground(new Color(39, 73, 53));
        btnAddUser.setForeground(Color.WHITE);
        btnAddUser.setMargin(new Insets(2, 30, 2, 30));
        btnAddUser.setFocusPainted(false);
        btnAddUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addNewUser();
            }
        });
        titlePanel.add(lblTitle, BorderLayout.CENTER);
        titlePanel.add(btnAddUser, BorderLayout.EAST);
        add(titlePanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new BorderLayout(10, 10));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 10, 10));
        
        chatArea = new JTextArea();
        chatArea.setFont(new Font("", Font.PLAIN, 17));
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        centerPanel.add(scrollPane);
        add(centerPanel, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new FlowLayout());
        add(inputPanel, BorderLayout.SOUTH);

        messageField = new JTextField();
        messageField.setFont(new Font("", Font.PLAIN, 17));
        messageField.setPreferredSize(new Dimension(490, 30));
        inputPanel.add(messageField);

        btnSend = new JButton("Send >");
        btnSend.setFont(new Font("", 1, 17));
        btnSend.setMargin(new Insets(0, 30, 0, 30));
        inputPanel.add(btnSend);
        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
        }
    }

    public void displayMessage(String message) {
        
    }

    private void addNewUser() {
        JFrame addSenderFrame = new JFrame("Add Sender");
        addSenderFrame.setSize(600, 180);
        addSenderFrame.setResizable(false);
        addSenderFrame.setLocationRelativeTo(null);
        addSenderFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addSenderFrame.setVisible(true);

        JLabel lblTitle = new JLabel("Add Sender");
        lblTitle.setFont(new Font("", 1, 40));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setOpaque(true);
        lblTitle.setBackground(new Color(39, 73, 53));
        lblTitle.setForeground(Color.WHITE);
        addSenderFrame.add("North", lblTitle);

        JPanel addUserPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));
        addUserPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        addUserPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        addSenderFrame.add("Center", addUserPanel);

        JLabel lblName = new JLabel("Sender Name");
        lblName.setFont(new Font("", 1, 20));
        addUserPanel.add(lblName);

        JTextField newUserNameField = new JTextField(15);
        newUserNameField.setFont(new Font("", Font.PLAIN, 17));
        newUserNameField.setPreferredSize(new Dimension(490, 30));
        addUserPanel.add(newUserNameField);

        newUserNameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String userName = newUserNameField.getText();
                if (!userName.isEmpty()) {
                    
                }
            }
        });
    }
}
