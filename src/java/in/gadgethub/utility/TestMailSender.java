/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.gadgethub.utility;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.eclipse.jdt.internal.compiler.batch.Main;

class MyAuthenticator1 extends Authenticator {

    private String username, password;

    public MyAuthenticator1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth = new PasswordAuthentication(this.username, this.password);
        return pwdAuth;
    }

}
 
public class TestMailSender {
    public static void main(String[] args) {
    
        final String username=AppInfo.appEmail;
        final  String password=AppInfo.appPassword;
        Properties properties= new Properties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.host", host);
        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");
        
        MyAuthenticator myAuth = new MyAuthenticator(AppInfo.appEmail, AppInfo.appPassword);
        Session session = Session.getInstance(properties, myAuth);
        
         try {

            Message message = new MimeMessage(session);
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("raj24kush@gmail.com")
            );
            message.setSubject("Email from GadgetHub");
            //message.setText("Good Morning!!");
            message.setContent("<h1>Good Morning</h1>", "text/html");

            Transport.send(message);

            System.out.println("Mail Sent Successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }

}
