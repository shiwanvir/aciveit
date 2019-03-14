package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javarmi.server.UserInfo;
import javax.swing.JOptionPane;

public class mainFrame {

	public JFrame frame,frame1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame window = new mainFrame();
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
	public mainFrame() {
		initialize();
	}

	/**
 try {
            String luckupString="rmi://localhost:1212/MyServer";
            si=(RemoteInterface) Naming.lookup(luckupString);
         
        } catch (NotBoundException ex) {
            Logger.getLogger(RemoteClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RemoteClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RemoteClient.class.getName()).log(Level.SEVERE, null, ex);
        }	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 153, 153));
		frame.setBounds(100, 100, 979, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 693, 433);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shiwantha\\Downloads\\night_city_top_view_legs_new_re_z.jpg"));
		lblNewLabel.setBounds(0, 0, 693, 433);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(798, 130, 153, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(51, 255, 153));
		lblNewLabel_1.setBackground(new Color(51, 255, 153));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(703, 130, 89, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(51, 255, 153));
		lblNewLabel_2.setBackground(new Color(51, 255, 153));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(703, 174, 89, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(798, 172, 153, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setBackground(new Color(51, 255, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            try {
                                String usernameme= textField.getText();
                                String password=textField_1.getText();
                                UserInfo uInfo=new UserInfo();
                                uInfo.setUserName(usernameme);
                                uInfo.setPassword(password);
                                String result=RemoteClient.getSi().login(uInfo);
                                if(result.equalsIgnoreCase("Success")){
                                    frame.setVisible(false);
                                    welcome window = new welcome();
                                    window.frame.setVisible(true);
                                }else{
                                    JOptionPane.showMessageDialog(null, result);
                                }
                            } catch (RemoteException ex) {
                                Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
					
					
				
				
			}
		});
		btnNewButton.setBounds(715, 216, 104, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBackground(new Color(51, 255, 153));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(847, 216, 104, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Don't have an account?");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_3.setBounds(701, 255, 156, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Sign up");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_2.setBackground(new Color(0, 153, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				mainFrame_signup window = new mainFrame_signup();
				window.frame.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(857, 250, 104, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
