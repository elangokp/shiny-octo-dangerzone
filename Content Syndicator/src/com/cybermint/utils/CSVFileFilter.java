package com.cybermint.utils;

import java.io.File;
import java.io.FilenameFilter;

public class CSVFileFilter  implements FilenameFilter {

	@Override
	public boolean accept(File givenFile, String fileName) {
		return fileName.endsWith(".csv");
	}

}
