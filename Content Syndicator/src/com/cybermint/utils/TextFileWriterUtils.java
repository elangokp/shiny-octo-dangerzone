/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybermint.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elango
 */
public class TextFileWriterUtils {
	
	File givenFileForClass = null;
	BufferedWriter writerForClass = null;
	
	public TextFileWriterUtils(String givenFileLocation) {
		try {
			givenFileForClass = new File(givenFileLocation);
			if (!givenFileForClass.exists()) {
				givenFileForClass.getParentFile().mkdirs();
				givenFileForClass.createNewFile();
			}
			writerForClass = new BufferedWriter(new FileWriter(givenFileForClass, true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void closeWriter() throws IOException {
		writerForClass.close();
	}
	
	public synchronized void writeContentToFile (String content) {
		try {
			writerForClass.newLine();
			writerForClass.append(content);			
			writerForClass.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized static boolean doesFileExist(String fileLocation) {
		File givenFile = null;
		givenFile = new File(fileLocation);
		return givenFile.exists();
	}

    public synchronized static void writeListAsLines(Collection<String> givenList, String fileLocation) {
        BufferedWriter writer = null;
        File givenFile = null;
        try {
            givenFile = new File(fileLocation);
            if (!givenFile.exists()) {
            	givenFile.getParentFile().mkdirs();
                givenFile.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter(givenFile));
            for(String aLine:givenList) {
                writer.append(aLine);
                writer.newLine();
            }
            writer.close();
        } catch (IOException ex) {
            try {
                writer.close();
                Logger.getLogger(TextFileWriterUtils.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex1) {
                Logger.getLogger(TextFileWriterUtils.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }
    
    public synchronized static void writeString(String givenString, String fileLocation, Boolean isAppend, Boolean isAppendInNewLine) {
        BufferedWriter writer = null;
        File givenFile = null;
        try {
            givenFile = new File(fileLocation);
            if (!givenFile.exists()) {
            	givenFile.getParentFile().mkdirs();
                givenFile.createNewFile();                
            }
            writer = new BufferedWriter(new FileWriter(givenFile, isAppend));
            if(isAppendInNewLine) {
            	writer.newLine();
            }
            writer.append(givenString);
            writer.close();
        } catch (IOException ex) {
            try {
            	Logger.getLogger(TextFileWriterUtils.class.getName()).log(Level.SEVERE, null, ex);
                writer.close();
            } catch (IOException ex1) {
                Logger.getLogger(TextFileWriterUtils.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }
    
    public synchronized static void writeString(String givenString, String fileLocation, Boolean isAppend, Boolean isAppendInNewLine, String characterEncoding, Boolean includeBOM) {
        BufferedWriter writer = null;
        File givenFile = null;
        try {
            givenFile = new File(fileLocation);
            if (!givenFile.exists()) {
            	givenFile.getParentFile().mkdirs();
                givenFile.createNewFile();                
            }            
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(givenFile, isAppend), characterEncoding));
            if(includeBOM) {
            	writer.write("\uFEFF");
            }
            if(isAppendInNewLine) {
            	writer.newLine();
            }
            writer.append(givenString);
            writer.close();
        } catch (IOException ex) {
            try {
            	Logger.getLogger(TextFileWriterUtils.class.getName()).log(Level.SEVERE, null, ex);
                writer.close();
            } catch (IOException ex1) {
                Logger.getLogger(TextFileWriterUtils.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }
    
}
