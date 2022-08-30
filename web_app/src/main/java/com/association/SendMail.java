package com.association;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    private final String host="smtp.gmail.com";
    private Properties pr=System.getProperties();
    private String from;
    private String to;
    private  String pass;


    /**
     * Constructor
     */
    public SendMail(AssocInfo assocInfo,String to){
        this.from = assocInfo.getAssocMail();
        this.to = to;
        this.pass = assocInfo.getPass();

        pr.put("mail.smtp.host",host);
        pr.put("mail.smtp.post","587");
        pr.put("mail.smtp.starttls.enable","true");
        pr.put("mail.smtp.auth","true");
    }
    public void send(String sub,String msg){

        Session session=Session.getInstance(pr, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from,pass);
            }
        });
        Message message= new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        try {
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        SendMail mail = new SendMail("mswacou@gmail.com","mudabbirhashmi2000@gmail.com","giekfklvjjcbazan");
            //use this password - giekfklvjjcbazan
//        mail.send("verification","Your verification code is: 1234");
//    }

}
