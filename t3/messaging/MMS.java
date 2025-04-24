package t3.messaging;

import java.util.ArrayList;
import java.util.List;

public class MMS {
    private List<Message> messages = new ArrayList<>();

    public void sendMessage(Message message) {
        messages.add(message);
    }

    public boolean deleteMessage(Message message) {
        return messages.remove(message);
    }

    public void printMessages() {
        if (messages.isEmpty()) {
            System.out.println("message cant be empty");
        } else {
            for (Message msg : messages) {
                System.out.println(msg);
            }
        }
    }

    // new feature - searching message by keyword
    // it gives the ability to search for any message containing a keyword that you are looking for
    
    public void searchMessages(String keyword) {
        boolean found = false;
        for (Message msg : messages) {
            if (msg.getContent().contains(keyword)) {
                System.out.println(msg);
                found = true;
            }
        }
        if (!found) {
            System.out.println("no message found");
        }
    }
}
