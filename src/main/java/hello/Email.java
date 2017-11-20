package hello;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Email {

    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");

    private String to;
    private String body;
    private Date date = new Date();

    public Email() {
    }

    public Email(String to, String body) {
        this.to = to;
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return FORMATTER.format(date);
    }

    @Override
    public String toString() {
        return String.format("Email{to=%s, body=%s, date=%s}", getTo(), getBody(), getDate());
    }

}
