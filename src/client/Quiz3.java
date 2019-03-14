package client;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javarmi.server.GoalSteps;
import javarmi.server.UserDetails;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Quiz3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz3 frame = new Quiz3();
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
	public Quiz3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 741, 422);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHowManyDependents = new JLabel("How many dependents do you have ?");
		lblHowManyDependents.setForeground(new Color(51, 255, 153));
		lblHowManyDependents.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblHowManyDependents.setBounds(38, 17, 428, 25);
		panel.add(lblHowManyDependents);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "No dependents", "1 dependent", "2 dependents", "Above 3 dependents"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox.setBackground(new Color(0, 153, 102));
		comboBox.setBounds(48, 53, 180, 23);
		panel.add(comboBox);
		
		JLabel lblByWhenDo = new JLabel("By when do you want to achieve this goal ?");
		lblByWhenDo.setForeground(new Color(51, 255, 153));
		lblByWhenDo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblByWhenDo.setBounds(38, 88, 463, 25);
		panel.add(lblByWhenDo);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "In 3 months", "3 months to 1 year", "1 year to 5 years"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_1.setBackground(new Color(0, 153, 102));
		comboBox_1.setBounds(48, 124, 180, 23);
		panel.add(comboBox_1);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		         UserDetails UserDetails=InformationGatheredBundle.getUserdetails();
                            UserDetails.setNoofDependent(comboBox.getSelectedItem().toString());
                            UserDetails.setExpectedAchivingdDuration(comboBox_1.getSelectedItem().toString());
                            
                           
                             System.out.println(UserDetails.getAgeRange());
                            try {
                                 //GoalSteps steps=new GoalSteps();
                                GoalSteps steps;
                                steps=RemoteClient.getSi().analyseData(UserDetails);
                                //System.out.println(usd.profession);
                                
                                System.out.println(steps.step1);
                                
                                
                            } catch (RemoteException ex) {
                                Logger.getLogger(Quiz3.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            dispose();
				resultsframe window = new resultsframe();
				window.frame.setVisible(true);
			
				
			}
		});
		btnSubmit.setForeground(Color.GRAY);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnSubmit.setBackground(new Color(51, 255, 153));
		btnSubmit.setBounds(602, 378, 113, 33);
		panel.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shiwantha\\Downloads\\New folder\\Webp.net-resizeimage (1).jpg"));
		lblNewLabel.setBounds(0, 0, 741, 422);
		panel.add(lblNewLabel);
	}

}
