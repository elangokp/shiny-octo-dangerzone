package com.cybermint.prchecker.ui.adapters;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.cybermint.prchecker.ui.PrCheckerMainWindow;

public class ButtonExportUrlsPrMouseAdapter extends MouseAdapter {

	public void mouseClicked(MouseEvent e) {
		PrCheckerMainWindow.getUrlAndPrTableModel().addRow(new Object[] {"URL2",2});
	}
}
