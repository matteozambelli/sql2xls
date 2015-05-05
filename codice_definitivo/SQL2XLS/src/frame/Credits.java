package frame;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextPane;

import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Credits extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8492987621634472466L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credits frame = new Credits();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Credits() {
		setTitle("Credits");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Credits.class.getResource("/graph/logo.png")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //chiude tutti i frame, anche quello principale
		
		//dimensione dello schermo per centrare la finestra
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Double width = screenSize.getWidth();
		Double height = screenSize.getHeight();	
		setBounds((width.intValue()/2)-187, (height.intValue()/2)-100, 375, 200);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("SQL to XLSX");
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label.setBounds(10, 11, 142, 27);
		contentPane.add(label);
		
		JLabel lblTeam = new JLabel("Team");
		lblTeam.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTeam.setBounds(10, 60, 46, 14);
		contentPane.add(lblTeam);
		
		JTextPane txtpnGambirasioMatteoServalli = new JTextPane();
		txtpnGambirasioMatteoServalli.setEditable(false);
		txtpnGambirasioMatteoServalli.setBackground(SystemColor.menu);
		txtpnGambirasioMatteoServalli.setText("Gambirasio Matteo\r\nServalli Denis\r\nTerzi Fabio\r\nZambelli Matteo");
		txtpnGambirasioMatteoServalli.setBounds(10, 74, 142, 77);
		contentPane.add(txtpnGambirasioMatteoServalli);
		
		ImageIcon img_unibg = new ImageIcon(Credits.class.getResource("/graph/logo_unibg.png"));
		JLabel logo_unibg = new JLabel("");
		logo_unibg.setIcon(img_unibg);
		logo_unibg.setBounds(175, 11, 80, 80);
		contentPane.add(logo_unibg);
		
		ImageIcon img_medium = new ImageIcon(Credits.class.getResource("/graph/logo_medium.png"));
		JLabel logo_medium = new JLabel("");
		logo_medium.setIcon(img_medium);
		logo_medium.setBounds(265, 11, 80, 80);
		contentPane.add(logo_medium);
	}
}
