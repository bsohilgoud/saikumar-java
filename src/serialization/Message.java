package serialization;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = 123L;

    String sender;
    String receiver;
    String messageContent;
    private transient int secret;
    int newField;
    int description;


    public Message(String sender, String receiver, String messageContent, int secret) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageContent = messageContent;
        this.secret = secret;
    }

    public Message(String sender, String receiver, String messageContent, int secret, int newField) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageContent = messageContent;
        this.secret = secret;
        this.newField = newField;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public int getSecret() {
        return secret;
    }

    public void setSecret(int secret) {
        this.secret = secret;
    }


}
