package com.cybermint.mail;

import java.io.InputStream;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class ReadMail {
	public static void main(String args[]) throws Exception {
		String host = "mail.thesingorama.info";
		String user = "Kylie@thesingorama.info";
		String password = "Pwd1234";
		Properties properties = System.getProperties();
		Session session = Session.getDefaultInstance(properties);
		Store store = session.getStore("pop3");
		store.connect(host, user, password);
		Folder folder = store.getFolder("inbox");
		folder.open(Folder.READ_ONLY);

		Message[] messages = folder.getMessages();

		for (int i = 0; i < messages.length; i++) {
			System.out.println("------------ Message " + (i + 1)
					+ " ------------");
			System.out.println("SentDate : " + messages[i].getSentDate());
			System.out.println("From : " + messages[i].getFrom()[0]);
			System.out.println("Subject : " + messages[i].getSubject());
			System.out.print("Message : ");
			InputStream stream = messages[i].getInputStream();
			while (stream.available() != 0) {
				System.out.print((char) stream.read());
			}
		}
		folder.close(true);
		store.close();

		/*
		 * Connection conn = null; String url = "jdbc:mysql://localhost:3306/";
		 * String dbName = "test"; String driver = "com.mysql.jdbc.Driver";
		 * String username = "root"; String userPassword = "root";
		 * 
		 * try { Class.forName(driver).newInstance(); conn =
		 * DriverManager.getConnection(url+dbName,username,userPassword);
		 * Statement st = conn.createStatement(); ResultSet rs =
		 * st.executeQuery("select message from message"); while (rs.next()){
		 * String msg = rs.getString("message"); System.out.println(msg); }
		 * System.out.println("Query Executed Successfully..."); } catch
		 * (Exception e) { System.out.println(e.getMessage()); } finally {
		 * conn.close(); }
		 */
	}
}