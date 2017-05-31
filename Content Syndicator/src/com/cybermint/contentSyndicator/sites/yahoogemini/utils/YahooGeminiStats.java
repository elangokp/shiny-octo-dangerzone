package com.cybermint.contentSyndicator.sites.yahoogemini.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeBodyPart;
import javax.mail.search.FlagTerm;

import org.apache.commons.io.FileUtils;

import com.cybermint.contentSyndicator.sites.yahoogemini.objects.AdStat;
import com.cybermint.utils.CSVFileFilter;
import com.cybermint.utils.TextFileReaderUtils;
import com.cybermint.utils.TextFileWriterUtils;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.sun.mail.imap.IMAPFolder;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class YahooGeminiStats {

	public YahooGeminiStats() {
		// TODO Auto-generated constructor stub
	}
	
	public static void getReportsFromGmailUsingImap(String username, String password, String folderPathToSave) throws MessagingException {
		IMAPFolder folder = null;
        Store store = null;
        String subject = null;
        Flag flag = null;
        try 
        {
          Properties props = System.getProperties();
          props.setProperty("mail.store.protocol", "imaps");

          Session session = Session.getDefaultInstance(props, null);

          store = session.getStore("imaps");
          store.connect("imap.googlemail.com", username, password);

          //folder = (IMAPFolder) store.getFolder("[Gmail]/Spam"); // This doesn't work for other email account
          folder = (IMAPFolder) store.getFolder("inbox"); //This works for both email account


          if(!folder.isOpen())
          folder.open(Folder.READ_WRITE);
          //Message[] messages = folder.getMessages();
          FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
          Message messages[] = folder.search(ft);
          System.out.println("No of Messages : " + folder.getMessageCount());
          System.out.println("No of Unread Messages : " + folder.getUnreadMessageCount());
          System.out.println(messages.length);
          for (int i=0; i < messages.length;i++) 
          {
        	  //System.out.println("*****************************************************************************");
              //System.out.println("MESSAGE " + (i + 1) + ":");
              Message msg =  messages[i];
              //System.out.println(msg.getMessageNumber());
              //Object String;
              //System.out.println(folder.getUID(msg)
              
        	  if(msg.getSubject().toString().contains("Gemini Report") && msg.getFrom()[0].toString().contains("yahoo")) {
	        	  System.out.println("---------------------------------");
		          System.out.println("Email Number " + (i + 1));
		          System.out.println("Subject: " + msg.getSubject());
		          System.out.println("From: " + msg.getFrom()[0]);
		          System.out.println("Text: " + msg.getContent().toString());
		          String contentType = msg.getContentType();
		          
		          if (contentType.contains("multipart")) {
		        	  Multipart multiPart = (Multipart) msg.getContent();
		        	  
		        	  for (int j = 0; j < multiPart.getCount(); j++) {
		        	      MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(j);
		        	      if (Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
		        	          // this part is attachment
		        	          // code to save attachment...
		        	    	  part.saveFile(folderPathToSave + part.getFileName());
		        	      }
		        	  }
		          }
	          }
        	  
        	  msg.setFlag(Flags.Flag.SEEN, true);
/*
            subject = msg.getSubject();

            System.out.println("Subject: " + subject);
            System.out.println("From: " + msg.getFrom()[0]);
           System.out.println("To: "+msg.getAllRecipients()[0]);
            System.out.println("Date: "+msg.getReceivedDate());
            System.out.println("Size: "+msg.getSize());
            System.out.println(msg.getFlags());
            System.out.println("Body: \n"+ msg.getContent());
            System.out.println(msg.getContentType());
*/
          }
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally 
        {
          if (folder != null && folder.isOpen()) { folder.close(true); }
          if (store != null) { store.close(); }
        }

	}
	
	public static void getReportsFromGmail(String username, String password, String folderPathToSave) {
		try {
			
			  String host = "pop.gmail.com";// change accordingly
		      //String mailStoreType = "pop3";
		      //String username = "ramon.goings56@gmail.com";// change accordingly
		      //String password = "123gemini!@#";// change accordingly
		      Properties properties = new Properties();
		      
		      properties.put("mail.store.protocol", "pop3");
		      properties.put("mail.pop3.host", host);
		      properties.put("mail.pop3.port", "995");
		      properties.put("mail.pop3.starttls.enable", "true");
		      Session emailSession = Session.getDefaultInstance(properties);
		  
		      //create the POP3 store object and connect with the pop server
		      Store store = emailSession.getStore("pop3s");

		      store.connect(host, username, password);

		      //create the folder object and open it
		      Folder emailFolder = (IMAPFolder) store.getFolder("INBOX");
		      emailFolder.open(Folder.READ_WRITE);

		      // retrieve the messages from the folder in an array and print it
		      Message[] messages = emailFolder.getMessages();
		      for (int i = 0, n = messages.length; i < n; i++) {
		          Message message = messages[i];
		          System.out.println("---------------------------------");
		          System.out.println("Email Number " + (i + 1));
		          System.out.println("Subject: " + message.getSubject());
		          System.out.println("From: " + message.getFrom()[0]);
		          System.out.println("Text: " + message.getContent().toString());
		          
		          if(message.getSubject().toString().contains("Gemini Report") && message.getFrom()[0].toString().contains("yahoo")) {
		        	  System.out.println("---------------------------------");
			          System.out.println("Email Number " + (i + 1));
			          System.out.println("Subject: " + message.getSubject());
			          System.out.println("From: " + message.getFrom()[0]);
			          System.out.println("Text: " + message.getContent().toString());
			          String contentType = message.getContentType();
			          
			          if (contentType.contains("multipart")) {
			        	  Multipart multiPart = (Multipart) message.getContent();
			        	  
			        	  for (int j = 0; j < multiPart.getCount(); j++) {
			        	      MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(j);
			        	      if (Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
			        	          // this part is attachment
			        	          // code to save attachment...
			        	    	  part.saveFile(folderPathToSave + part.getFileName());
			        	      }
			        	  }
			          }
		          }
		          //message.setFlag(Flags.Flag.DELETED, true);
		       }

		       //close the store and folder objects
		       emailFolder.close(true);
		       store.close();

		       } catch (NoSuchProviderException e) {
		          e.printStackTrace();
		       } catch (MessagingException e) {
		          e.printStackTrace();
		       } catch (Exception e) {
		          e.printStackTrace();
		       }
	}

	public static void unzip(File sourceFile, File destinationFolder){
	    //String source = "some/compressed/file.zip";
	    //String destination = "some/destination/folder";
	    String password = "password";

	    try {
	         ZipFile zipFile = new ZipFile(sourceFile.getAbsolutePath());
	         if (zipFile.isEncrypted()) {
	            zipFile.setPassword(password);
	         }
	         zipFile.extractAll(destinationFolder.getAbsolutePath());
	    } catch (ZipException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void combineCSVFiles(String folderPath, String combinedFilePath) {
		List<String> records = new ArrayList<String>();
		Boolean isFirstFile = true;
		File dir = new File(folderPath);
		File[] directoryListing = dir.listFiles(new CSVFileFilter());
		  if (directoryListing != null) {
		    for (File child : directoryListing) {
		    	if(isFirstFile) {
		    		records.addAll(TextFileReaderUtils.readLinesAsList(child.getAbsolutePath(), true));
		    	} else {
		    		List<String> thisFileRecords = TextFileReaderUtils.readLinesAsList(child.getAbsolutePath(), true);
		    		thisFileRecords.remove(0);
		    		records.addAll(thisFileRecords);
		    	}
		    	isFirstFile = false;
		    }
		  }
		TextFileWriterUtils.writeListAsLines(records, combinedFilePath, true);
	}
	
	public static void updateDB(String folderPath, String archivalPath) throws ClassNotFoundException, SQLException, IOException {
		
		File dir = new File(folderPath);
		Connection connection = YahooGeminiUtils.getCampaignStatsSQLConnection();
    	PreparedStatement ps = AdStat.getPreparedStatement(connection);
		File[] directoryListing = dir.listFiles(new CSVFileFilter());
		if (directoryListing != null) {
		  for (File child : directoryListing) {
		   List<AdStat> adStats = YahooGeminiStats.createAdStatBeans(child);
		   for (AdStat adStat: adStats) {
		    	adStat.setPreparedStatementValues(ps);
		    	ps.addBatch();
		   }
		   ps.executeBatch();
		   FileUtils.moveFileToDirectory(child, new File(archivalPath), true);
		  }
		}
		ps.close();
	    connection.close();	
	}
	
	/*public static Connection getSQLConnection () throws ClassNotFoundException, SQLException {
		String connectionString = "jdbc:sqlserver://cybermint.database.windows.net:1433;"
				+ "database=CampaignStats;user=ca@cybermint;password=123CyberAdmin!@#;"
				+ "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;"
				+ "loginTimeout=30;";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection(connectionString);
		return connection;
	}*/
	
	public static List<AdStat> createAdStatBeans(File child) throws IOException {
		List<AdStat> adStats = new ArrayList<AdStat>();
    	CSVReader reader = new CSVReader(new FileReader(child));
    	HeaderColumnNameMappingStrategy<AdStat> strategy = new HeaderColumnNameMappingStrategy<>();
        strategy.setType(AdStat.class);
        
        CsvToBean<AdStat> csvToBean = new CsvToBean<AdStat>();
        adStats.addAll(csvToBean.parse(strategy, reader));
        reader.close();
        return adStats;
	}
	
	public static void unzipAndDeleteFilesInFolder(String sourceFolderPath, String destinationFolderPath) {
		  File dir = new File(sourceFolderPath);
		  File[] directoryListing = dir.listFiles();
		  if (directoryListing != null) {
		    for (File child : directoryListing) {
		    	YahooGeminiStats.unzip(child, new File(destinationFolderPath));
		    	child.delete();
		    }
		  }
	}
	
	/*
	public static void main(String[] args) throws MessagingException {
		// TODO Auto-generated method stub
		String downloadsFolderPath = "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Reports/Gemini/";
		String extractsFolderPath = "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Reports/Gemini/extracts/";
		String combinedFileFolderPath = "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Reports/Gemini/combined/";
		
		Date date = new Date();
		String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
		
		String combinedFilePath = combinedFileFolderPath + modifiedDate+".csv";
		
		//YahooGeminiStats.getReportsFromGmail("ramon.goings56@gmail.com", "123gemini!@#", downloadsFolderPath);
		
		YahooGeminiStats.getReportsFromGmailUsingImap("ramon.goings56@gmail.com", "123gemini!@#", downloadsFolderPath);
		System.out.println("ramon.goings56@gmail.com - Done");
		YahooGeminiStats.getReportsFromGmailUsingImap("josephcornell28@gmail.com", "123gemini!@#", downloadsFolderPath);
		System.out.println("josephcornell28@gmail.com - Done");
		YahooGeminiStats.getReportsFromGmailUsingImap("nicker.ruby@gmail.com", "123gemini!@#", downloadsFolderPath);
		System.out.println("nicker.ruby@gmail.com - Done");
		YahooGeminiStats.getReportsFromGmailUsingImap("elango@cybermint.com", "123cybermint!@#", downloadsFolderPath);
		System.out.println("elango@cybermint.com - Done");
		
		YahooGeminiStats.unzipAndDeleteFilesInFolder(downloadsFolderPath, extractsFolderPath);
		YahooGeminiStats.combineCSVFiles(extractsFolderPath, combinedFilePath);
	}*/
	
	public static void main(String[] args) throws MessagingException, ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		String downloadsFolderPath = "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Reports/Gemini/";
		String extractsFolderPath = "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Reports/Gemini/extracts/";
		String archiveFolderPath = "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Reports/Gemini/extracts/Done/";
		String combinedFileFolderPath = "C:/Users/elangokp.AHC.000/Google Drive/Analysis/Reports/Gemini/combined/";
		
		
		
		//Date date = new Date();
		//String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
		
		//String combinedFilePath = combinedFileFolderPath + modifiedDate+".csv";
		
		//YahooGeminiStats.getReportsFromGmail("ramon.goings56@gmail.com", "123gemini!@#", downloadsFolderPath);
		
		YahooGeminiStats.getReportsFromGmailUsingImap("ramon.goings56@gmail.com", "123gemini!@#", downloadsFolderPath);
		System.out.println("ramon.goings56@gmail.com - Done");
		YahooGeminiStats.getReportsFromGmailUsingImap("josephcornell28@gmail.com", "123gemini!@#", downloadsFolderPath);
		System.out.println("josephcornell28@gmail.com - Done");
		YahooGeminiStats.getReportsFromGmailUsingImap("nicker.ruby@gmail.com", "123gemini!@#", downloadsFolderPath);
		System.out.println("nicker.ruby@gmail.com - Done");
		YahooGeminiStats.getReportsFromGmailUsingImap("elango@cybermint.com", "123cybermint!@#", downloadsFolderPath);
		System.out.println("elango@cybermint.com - Done");
		
		YahooGeminiStats.unzipAndDeleteFilesInFolder(downloadsFolderPath, extractsFolderPath);
		YahooGeminiStats.updateDB(extractsFolderPath, archiveFolderPath);
		//YahooGeminiStats.combineCSVFiles(extractsFolderPath, combinedFilePath);
	}

}
