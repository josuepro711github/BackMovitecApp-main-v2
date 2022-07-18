package com.movitec.app.entity;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.movitec.app.security.entity.Usuario;

public class EnviarGmail {
	
	// Recipient's email ID needs to be mentioned.
    private String to = "alberthlevisalazarverde1@gmail.com";

    // Sender's email ID needs to be mentioned
    private String from = "alberthlevisalazarverde1@gmail.com";

    // Assuming you are sending email from through gmails smtp
    private String host = "smtp.gmail.com";

    // Get system properties
    private Properties properties = System.getProperties();

    // Get the Session object.// and pass username and password
    private Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

        protected PasswordAuthentication getPasswordAuthentication() {

            return new PasswordAuthentication("alberthlevisalazarverde1@gmail.com", "ztxrkoauqjuqipdk");

        }

    });

    public EnviarGmail() {
        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
        // Used to debug SMTP issues
        session.setDebug(true);
    }


    public boolean enviar(List<Usuario> lista) {
    	Date fecha = new Date();
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(fecha);
    	if(calendar.DAY_OF_MONTH == 20/* && calendar.DAY_OF_MONTH >= 5*/) {
    		return false;
    	} else {
			try {
				calendar.set(Calendar.DAY_OF_MONTH, 5);
				if (calendar.get(Calendar.DAY_OF_MONTH) > 5)
					calendar.set(Calendar.MONTH, calendar.get(Calendar.MONDAY)+1);
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				for(Usuario u : lista) {
					to = u.getEmail();
	                // Create a default MimeMessage object.
	                MimeMessage message = new MimeMessage(session);

	                // Set From: header field of the header.
	                message.setFrom(new InternetAddress(from));

	                // Set To: header field of the header.
	                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	                // Set Subject: header field
	                message.setSubject("PROGRAMADOR");

	                // Now set the actual message
	                System.out.println("<h1 style=\"color:red; font-size:40px\">Aviso de Movitec</h1> <p>Hola "+u.getNombre()+" "+u.getApellidos()+", Movitec le recuerda que debe cancelar su deuda hasta la fecha: "+sdf.format(calendar.getTime())+"</p>");
	                message.setText("<h1 style=\"color:red; font-size:40px\">Aviso de Movitec</h1> <p>Hola "+u.getNombre()+" "+u.getApellidos()+", Movitec le recuerda que debe cancelar su deuda hasta la fecha: "+sdf.format(calendar.getTime())+"</p>","UTF8", "html");

	                // System.out.println("sending...");
	                // Send message
	                Transport.send(message);
	                // System.out.println("Sent message successfully....");
				}
			} catch (MessagingException mex) {
                return false;
            }
    	}
    	return true;        
    }
}

