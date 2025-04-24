package t3.messaging;

public class MMSManager {
    public static void main(String[] args) {
        MMS mms = new MMS();

        Message msg1 = new Message("Alice", "Bob", "Hello, Bob!", "2025-04-10 10:00");
        Message msg2 = new Message("Bob", "Alice", "Hi Alice, how are you?", "2025-04-10 10:05");
        mms.sendMessage(msg1);
        mms.sendMessage(msg2);

        System.out.println("message history:");
        mms.printMessages();

        //this is how the new function is used
        System.out.println("\nsearch result:");
        mms.searchMessages("Alice");

        mms.deleteMessage(msg1);

        System.out.println("\n newmessage history:");
        mms.printMessages();
    }
}
