package chat.application;

import java.util.*;

public class ChatController {

    private ArrayList<ChatUser> usersArrayList;

    ChatController() {
        usersArrayList = new ArrayList<>();
    }

    public void addUser(ChatUser user) {
        usersArrayList.add(user);
        user.getChatWindow().setVisible(true);
    }

    public void broadcastMessage(String senderName, String message) {
        for (ChatUser user : usersArrayList) {
            user.receiveMessage(senderName, message);
        }
    }
}
