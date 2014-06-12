package com.cybermint.prchecker.ui;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import com.cybermint.prchecker.ui.adapters.ButtonImportUrlsMouseAdapter;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

public class PrCheckerMainWindow {

	private JFrame mainFrame;
	private static DefaultTableModel urlAndPrTableModel = new DefaultTableModel(); 
	private static List<String> urls = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrCheckerMainWindow window = new PrCheckerMainWindow();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrCheckerMainWindow() {
		initialize();
	}
	
	private void initializeUrlAndPRTableModel() {
		urlAndPrTableModel.addColumn("URL");
		urlAndPrTableModel.addColumn("PR");
		urlAndPrTableModel.addRow(new Object[]{"URL 11111111111111111111111111111111111111111111111", "10"});
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setBounds(100, 100, 450, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel upperLeftPanel = new JPanel();
		upperLeftPanel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		
		JPanel upperRightPanel = new JPanel();
		upperRightPanel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		
		GroupLayout mainFrameGroupLayout = new GroupLayout(mainFrame.getContentPane());
		mainFrameGroupLayout.setHorizontalGroup(
			mainFrameGroupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(mainFrameGroupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(mainFrameGroupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(mainFrameGroupLayout.createSequentialGroup()
							.addComponent(upperLeftPanel, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(upperRightPanel, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
						.addComponent(bottomPanel, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
					.addGap(12))
		);
		mainFrameGroupLayout.setVerticalGroup(
			mainFrameGroupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(mainFrameGroupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(mainFrameGroupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(upperLeftPanel, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
						.addComponent(upperRightPanel, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bottomPanel, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
					.addGap(8))
		);
		GridBagLayout upperRightPanelGridBagLayout = new GridBagLayout();
		upperRightPanelGridBagLayout.columnWidths = new int[]{0, 0};
		upperRightPanelGridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		upperRightPanelGridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		upperRightPanelGridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		upperRightPanel.setLayout(upperRightPanelGridBagLayout);
		
		JButton buttonCheckPr = new JButton("Check PR");
		GridBagConstraints gbc_buttonCheckPr = new GridBagConstraints();
		gbc_buttonCheckPr.insets = new Insets(0, 0, 5, 0);
		gbc_buttonCheckPr.fill = GridBagConstraints.BOTH;
		gbc_buttonCheckPr.gridx = 0;
		gbc_buttonCheckPr.gridy = 0;
		upperRightPanel.add(buttonCheckPr, gbc_buttonCheckPr);
		
		JButton buttonAddUrls = new JButton("Import URLs");
		buttonAddUrls.addMouseListener(new ButtonImportUrlsMouseAdapter());
		GridBagConstraints gbc_buttonAddUrls = new GridBagConstraints();
		gbc_buttonAddUrls.insets = new Insets(0, 0, 5, 0);
		gbc_buttonAddUrls.fill = GridBagConstraints.BOTH;
		gbc_buttonAddUrls.gridx = 0;
		gbc_buttonAddUrls.gridy = 1;
		upperRightPanel.add(buttonAddUrls, gbc_buttonAddUrls);
		
		JButton btnExportUrlsWith = new JButton("Export URLs with PR");
		GridBagConstraints gbc_btnExportUrlsWith = new GridBagConstraints();
		gbc_btnExportUrlsWith.gridx = 0;
		gbc_btnExportUrlsWith.gridy = 2;
		upperRightPanel.add(btnExportUrlsWith, gbc_btnExportUrlsWith);
		upperLeftPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		initializeUrlAndPRTableModel();
		JTable urlAndPrTable = new JTable(urlAndPrTableModel);
		urlAndPrTable.setFillsViewportHeight(true);
		urlAndPrTable.getColumnModel().getColumn(1).setPreferredWidth(5);
		
		JScrollPane urlAndPrTableScrollPane = new JScrollPane(urlAndPrTable);
		upperLeftPanel.add(urlAndPrTableScrollPane);
		mainFrame.getContentPane().setLayout(mainFrameGroupLayout);
		
		
	}

	public static DefaultTableModel getUrlAndPrTableModel() {
		return urlAndPrTableModel;
	}

	public static void setUrlAndPrTableModel(DefaultTableModel urlAndPrTableModel) {
		PrCheckerMainWindow.urlAndPrTableModel = urlAndPrTableModel;
	}

	public static List<String> getUrls() {
		return urls;
	}

	public static void setUrls(List<String> urls) {
		PrCheckerMainWindow.urls = urls;
		for(String url:urls) {
			System.out.println(url);
		}
	}
}
