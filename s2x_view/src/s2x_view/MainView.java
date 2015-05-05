package s2x_view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import utility.*;
import frame.*;

import java.awt.Toolkit;


public class MainView {

	private JFrame frmSqlToXlsx;
	private String outputDirectory;
	private File sqlInput;
	private File xlsxInput;
	
	//variabili di controllo dei file per lanciare l'update
	private boolean sqlLoaded;
	private boolean xlsxLoaded;
	
	//frame credits
	private Credits creditsFrame;
	
	/**
	 * metodo per ricavare il timestamp attuale, serve per i log
	 * @return stringa con il timestamp
	 */
	public String getCurrentTime()
	{
		DateFormat dateFormat = new SimpleDateFormat("[HH:mm:ss] ");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
					window.frmSqlToXlsx.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//LOOK PRESO DAL S.O.
		try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch(Exception e) {
	        e.printStackTrace();
	    }		
		
		///inizializzazione variabili
		outputDirectory = "C:";
		sqlInput = null;
		xlsxInput = null;
		sqlLoaded = false;
		xlsxLoaded = false;
		
		//inizializzazione componenti		
		frmSqlToXlsx = new JFrame();
		frmSqlToXlsx.setTitle("SQL to XLSX");
		frmSqlToXlsx.setIconImage(Toolkit.getDefaultToolkit().getImage(MainView.class.getResource("/graph/logo.png")));
		frmSqlToXlsx.setResizable(false);
		
		//dimensione dello schermo per centrare la finestra
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Double width = screenSize.getWidth();
		Double height = screenSize.getHeight();		
		frmSqlToXlsx.setBounds((width.intValue()/2)-215, (height.intValue()/2)-300, 430, 600);		
		
		frmSqlToXlsx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSqlToXlsx.getContentPane().setLayout(null);
		
		JLabel lblSqlToXlsx = new JLabel("SQL to XLSX");
		lblSqlToXlsx.setBounds(31, 11, 222, 27);
		lblSqlToXlsx.setFont(new Font("Tahoma", Font.PLAIN, 22));
		frmSqlToXlsx.getContentPane().add(lblSqlToXlsx);
		
		JButton btnOutputFolder = new JButton("Output folder");
		btnOutputFolder.setBounds(31, 62, 113, 23);
		frmSqlToXlsx.getContentPane().add(btnOutputFolder);
		
		JButton btnSqlFile = new JButton("SQL file");
		btnSqlFile.setBounds(154, 62, 113, 23);
		frmSqlToXlsx.getContentPane().add(btnSqlFile);
		
		JButton btnXlsxFile = new JButton("XLSX file");
		btnXlsxFile.setBounds(277, 62, 113, 23);
		frmSqlToXlsx.getContentPane().add(btnXlsxFile);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(31, 96, 359, 78);
		frmSqlToXlsx.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSqlFileStatus = new JLabel("SQL file status:");
		lblSqlFileStatus.setBounds(10, 11, 100, 14);
		panel.add(lblSqlFileStatus);
		
		final JButton btnCreate = new JButton("Create");
		btnCreate.setEnabled(false);
		btnCreate.setBounds(236, 44, 113, 23);
		panel.add(btnCreate);
		
		final JLabel lblCreateSql = new JLabel("No input");
		lblCreateSql.setBounds(120, 11, 229, 14);
		panel.add(lblCreateSql);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(31, 185, 359, 93);
		frmSqlToXlsx.getContentPane().add(panel_1);
		
		JLabel label = new JLabel("SQL file status:");
		label.setBounds(10, 11, 100, 14);
		panel_1.add(label);
		
		final JButton btnUpdate = new JButton("Update");
		btnUpdate.setEnabled(false);
		btnUpdate.setBounds(236, 59, 113, 23);
		panel_1.add(btnUpdate);
		
		JLabel lblXlsxFileStatus = new JLabel("XLSX file status:");
		lblXlsxFileStatus.setBounds(10, 36, 100, 14);
		panel_1.add(lblXlsxFileStatus);
		
		final JLabel lblUpdateSql = new JLabel("No input");
		lblUpdateSql.setBounds(120, 11, 229, 14);
		panel_1.add(lblUpdateSql);
		
		final JLabel lblUpdateXlsx = new JLabel("No input");
		lblUpdateXlsx.setBounds(120, 36, 229, 14);
		panel_1.add(lblUpdateXlsx);
		
		final JTextPane logPane = new JTextPane();
		logPane.setEditable(false);
		logPane.setBounds(31, 331, 359, 195);
		frmSqlToXlsx.getContentPane().add(logPane);
		
		final JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(31, 289, 359, 14);
		frmSqlToXlsx.getContentPane().add(progressBar);
		
		JButton btnNewButton = new JButton("Credits");
		btnNewButton.setBounds(323, 11, 67, 24);
		frmSqlToXlsx.getContentPane().add(btnNewButton);
		
		JLabel lblLog = new JLabel("Log");
		lblLog.setBounds(31, 314, 46, 14);
		frmSqlToXlsx.getContentPane().add(lblLog);
		
		JLabel lblCurrentOutputFolder = new JLabel("Current output folder:");
		lblCurrentOutputFolder.setBounds(31, 542, 113, 14);
		frmSqlToXlsx.getContentPane().add(lblCurrentOutputFolder);
		
		final JLabel lblOutputFolder = new JLabel(outputDirectory);
		lblOutputFolder.setBounds(145, 542, 245, 14);
		frmSqlToXlsx.getContentPane().add(lblOutputFolder);
		
		
		////EVENTS
		
		//SELEZIONE CARTELLA DI DESTINAZIONE
		btnOutputFolder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				Integer returnAction = fileChooser.showOpenDialog(frmSqlToXlsx);
				
				/* valori di ritorno di show open dialog
				 *  0 -> selezione, 1-> annulla o chiudi finestra
				 */
				
				if(returnAction == 0)
				{
					//selezionata la directory
					File currentDirectory = fileChooser.getSelectedFile();
					outputDirectory = currentDirectory.getPath();
					lblOutputFolder.setText(outputDirectory);
					logPane.setText(logPane.getText()+getCurrentTime()+"Changed output folder to: "+outputDirectory+"\n");
				}
			}
		});
		
		//SELEZIONE FILE SQL PER IL PARSING
		btnSqlFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileFilter(new SqlFileFilter()); //filtro sui file solo di tipo sql
				Integer returnAction = fileChooser.showOpenDialog(frmSqlToXlsx);				
				if(returnAction == 0)
				{
					sqlInput = fileChooser.getSelectedFile();
					
					//verifico l'estensione
					Boolean correctExt = false;					
					String fileName = sqlInput.getName();
					int extPos = fileName.lastIndexOf(".");
					if(extPos != -1) {
					   String ext = fileName.substring(extPos,fileName.length());
					   if(ext.toLowerCase().compareTo(".sql") == 0) //comparazione estensione
						   correctExt = true;
					}
					
					
					if(correctExt)
					{
						
						lblCreateSql.setText(fileName);
						lblUpdateSql.setText(fileName);
						logPane.setText(logPane.getText()+getCurrentTime()+"SQL input file loaded: "+fileName+"\n");
						btnCreate.setEnabled(true); //abilito il parsing per la create;
						sqlLoaded = true;
						if(sqlLoaded && xlsxLoaded)
							btnUpdate.setEnabled(true); //abilito il parsing per la create;
						
					}
					else
					{
						lblCreateSql.setText("No input");
						lblUpdateSql.setText("No input");
						logPane.setText(logPane.getText()+getCurrentTime()+"Not valid input file: "+fileName+"\n");
						sqlLoaded = false;
						btnCreate.setEnabled(false); //senza l'sql non posso fare nessun parsing
						btnUpdate.setEnabled(false);						
					}
					
				}				
			}
		});
		
		//SELEZIONE FILE XLS PER IL PARSING UPDATE
		btnXlsxFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileFilter(new XlsxFileFilter()); //filtro sui file solo di tipo sql
				Integer returnAction = fileChooser.showOpenDialog(frmSqlToXlsx);
				
				if(returnAction == 0)
				{
					xlsxInput = fileChooser.getSelectedFile();
					
					//verifico l'estensione
					Boolean correctExt = false;					
					String fileName = xlsxInput.getName();
					int extPos = fileName.lastIndexOf(".");
					if(extPos != -1) {
					   String ext = fileName.substring(extPos,fileName.length());
					   if(ext.toLowerCase().compareTo(".xlsx") == 0) //comparazione estensione
						   correctExt = true;
					}
					
					
					if(correctExt)
					{						
						lblUpdateXlsx.setText(fileName);
						logPane.setText(logPane.getText()+getCurrentTime()+"XLSX input file loaded: "+fileName+"\n");
						xlsxLoaded = true;
						if(sqlLoaded && xlsxLoaded)
							btnUpdate.setEnabled(true); //abilito il parsing per l'update;
					}
					else
					{
						lblUpdateXlsx.setText("No input");
						logPane.setText(logPane.getText()+getCurrentTime()+"Not valid input file: "+fileName+"\n");
						xlsxLoaded = false;
						btnUpdate.setEnabled(false);
					}
					
				}				
				
			}
		});
		
		//PARSING DEL FILE CON AZIONE CREATE (INSERT)
		btnCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				logPane.setText(logPane.getText()+getCurrentTime()+"Start CREATE parsing\n");
				progressBar.setValue(100);
				
			}
		});
		
		//PARSING DEL FILE CON AZIONE UPDATE
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				logPane.setText(logPane.getText()+getCurrentTime()+"Start UPDATE parsing\n");
				progressBar.setValue(100);
				
			}
		});
		
		//MOSTRA FRAME DEI CREDITS
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				creditsFrame = new Credits();
				creditsFrame.setVisible(true);
				
			}
		});
		
		
	}
}
