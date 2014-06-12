package com.cybermint.prchecker.ui.adapters;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

import com.cybermint.prchecker.ui.PrCheckerMainWindow;
import com.cybermint.utils.FileChooserTextFileFilter;
import com.cybermint.utils.TextFileReaderUtils;

public class ButtonImportUrlsMouseAdapter extends MouseAdapter {

	public void mouseClicked(MouseEvent e) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileFilter(new FileChooserTextFileFilter());
		int returnVal = fileChooser.showOpenDialog(e.getComponent());
	    if (returnVal == JFileChooser.APPROVE_OPTION) {
	        File file = fileChooser.getSelectedFile();
	        // What to do with the file, e.g. display it in a TextArea
	        PrCheckerMainWindow.setUrls(TextFileReaderUtils.readLinesAsList(file.getAbsolutePath(), true));
	    } else {
	        System.out.println("File access cancelled by user.");
	    }
		//PrCheckerMainWindow.getUrlAndPrTableModel().addRow(new Object[] {"URL2",2});
	}
}
