package chat.application;

import javax.swing.*;

public class ChatUser {

    private String name;
    private JTextArea chatArea;
    private ChatWindow chatWindow;
    private ChatController chatController;

    ChatUser(String name, ChatController chatController) {
        this.name = name;
        this.chatController = chatController;
        this.chatArea = new JTextArea();
        this.chatArea.setEditable(false);
        this.chatWindow = new ChatWindow(this, chatController);
    }

    public String getName() {
        return name;
    }

    public JTextArea getChatArea() {
        return chatArea;
    }

    public ChatWindow getChatWindow() {
        return chatWindow;
    }

    public void receiveMessage(String senderName, String message) {
        if (senderName.equals(this.name)) {
            chatArea.append("Me : " + message + "\n");
        } else {
            chatArea.append(senderName + " : " + message + "\n");
        }
    }
}
