package com.association;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public void mail(){
        String msg="Hello World!";
        String from="mswacou@gmail.com";
        String pass="giekfklvjjcbazan";
        String to="hnayeem520@gmail.com";
        String sub="confirmation";
        sendMail(from,to,sub,msg);
    }
    public void sendMail(String from,String to,String sub,String msg){
        String host="smtp.gmail.com";
        Properties pr=System.getProperties();
        pr.put("mail.smtp.host",host);
        pr.put("mail.smtp.post","587");
        pr.put("mail.smtp.starttls.enable","true");
        pr.put("mail.smtp.auth","true");

        Session session=Session.getInstance(pr, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from,"giekfklvjjcbazan");
//                return super.getPasswordAuthentication();
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

}
