package trig;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class testGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testGUI window = new testGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 54, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		String input;
		JButton btnNewButton = new JButton("Sine Law Side");
		btnNewButton.setBounds(243, 53, 162, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sine Law Angle");
		btnNewButton_1.setBounds(243, 100, 162, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cosine Law Side");
		btnNewButton_2.setBounds(243, 142, 162, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cosine Law Angle");
		btnNewButton_3.setBounds(243, 191, 162, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JTextPane txtpnInput = new JTextPane();
		txtpnInput.setText("Input");
		txtpnInput.setBounds(21, 37, 86, 20);
		frame.getContentPane().add(txtpnInput);
	}
}
