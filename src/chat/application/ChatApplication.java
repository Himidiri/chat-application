package chat.application;

public class ChatApplication {
  public static void main(String[] args) {
        ChatController chatController = new ChatController();
        ChatUser sender1 = new ChatUser("Sender 01", chatController);
        chatController.addUser(sender1);
    } 
}
