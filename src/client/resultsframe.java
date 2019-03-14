package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class resultsframe {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resultsframe window = new resultsframe();
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
	public resultsframe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 976, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 204));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("This is what you have to do");
		lblNewLabel_1.setForeground(new Color(51, 255, 153));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(259, 37, 387, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Step 1");
		lblNewLabel_2.setForeground(new Color(51, 255, 153));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(44, 143, 85, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblStep = new JLabel("Step 2");
		lblStep.setForeground(new Color(51, 255, 153));
		lblStep.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblStep.setBounds(44, 179, 85, 25);
		panel.add(lblStep);
		
		JLabel lblStep_1 = new JLabel("Step 3");
		lblStep_1.setForeground(new Color(51, 255, 153));
		lblStep_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblStep_1.setBounds(44, 215, 85, 25);
		panel.add(lblStep_1);
		
		JLabel lblStep_2 = new JLabel("Step 4");
		lblStep_2.setForeground(new Color(51, 255, 153));
		lblStep_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblStep_2.setBounds(44, 251, 85, 25);
		panel.add(lblStep_2);
		
		JLabel lblStep_3 = new JLabel("Step 5");
		lblStep_3.setForeground(new Color(51, 255, 153));
		lblStep_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblStep_3.setBounds(44, 287, 85, 25);
		panel.add(lblStep_3);
		
		JLabel lblStep_4 = new JLabel("Step 6");
		lblStep_4.setForeground(new Color(51, 255, 153));
		lblStep_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblStep_4.setBounds(44, 323, 85, 25);
		panel.add(lblStep_4);
		
		JLabel lblStep_5 = new JLabel("Step 7");
		lblStep_5.setForeground(new Color(51, 255, 153));
		lblStep_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblStep_5.setBounds(44, 359, 85, 25);
		panel.add(lblStep_5);
		
		JLabel lblStep_6 = new JLabel("Step 8");
		lblStep_6.setForeground(new Color(51, 255, 153));
		lblStep_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblStep_6.setBounds(44, 396, 85, 25);
		panel.add(lblStep_6);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				mainFrame window = new mainFrame();
				window.frame.setVisible(true);
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnHome.setBackground(new Color(51, 255, 153));
		btnHome.setBounds(824, 522, 104, 23);
		panel.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shiwantha\\Downloads\\Webp.net-resizeimage.jpg"));
		lblNewLabel.setBounds(0, 0, 960, 571);
		panel.add(lblNewLabel);
	}
}
