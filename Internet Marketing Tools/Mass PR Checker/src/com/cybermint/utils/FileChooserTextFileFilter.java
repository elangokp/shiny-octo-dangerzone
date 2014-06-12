package com.cybermint.utils;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileChooserTextFileFilter extends FileFilter{

	@Override
	public boolean accept(File file) {
		// Allow  files with ".txt" extension
        return file.isDirectory() || (file.isFile() && file.getName().toLowerCase().endsWith(".txt"));
	}

	@Override
	public String getDescription() {
		return "Text Files Only";
	}

}
