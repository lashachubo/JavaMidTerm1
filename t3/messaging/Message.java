package t3.messaging;

public class Message {
    private String sender;
    private String receiver;
    private String content;
    private String timestamp;

    public Message(String sender, String receiver, String content, String timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "From: " + sender + "\nTo: " + receiver + "\nMessage: " + content + "\nTime: " + timestamp;
    }
}
