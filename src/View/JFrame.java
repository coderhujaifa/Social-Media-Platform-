package View;

public class JFrame extends javax.swing.JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JFrame() {
		super("Social Media Platform");
		getContentPane().setBackground(GUIConstants.background);
		setSize(900,625);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
 