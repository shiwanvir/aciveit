package client;


import static client.Quiz1.userObj;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javarmi.server.UserDetails;

public class Quiz2 extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 frame = new Quiz2();
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
	public Quiz2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 748, 429);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblWhatIsYour = new JLabel("What is your Goal ?");
		lblWhatIsYour.setForeground(new Color(51, 255, 153));
		lblWhatIsYour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblWhatIsYour.setBounds(28, 11, 312, 25);
		panel.add(lblWhatIsYour);
                
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Goal", "Money Saving", "Vehicle", "House"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox.setBackground(new Color(0, 153, 102));
		comboBox.setBounds(38, 47, 180, 23);
		panel.add(comboBox);
                String goal=comboBox.getSelectedItem().toString();
		
		JLabel lblWhatIsThe = new JLabel("What is the value your goal?");
		lblWhatIsThe.setForeground(new Color(51, 255, 153));
		lblWhatIsThe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblWhatIsThe.setBounds(28, 82, 312, 25);
		panel.add(lblWhatIsThe);
                
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Value", "Below Rs.500000", "Rs.500000 to Rs.2 Million", "Rs.2 Million to Rs.10 Million", "Above Rs.10 Million"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		comboBox_1.setBackground(new Color(0, 153, 102));
		comboBox_1.setBounds(38, 118, 180, 23);
		panel.add(comboBox_1);
                String goalValue=comboBox_1.getSelectedItem().toString();
		
		JLabel lblHowLuckyAre = new JLabel("How lucky are you ? (Generally)");
		lblHowLuckyAre.setForeground(new Color(51, 255, 153));
		lblHowLuckyAre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblHowLuckyAre.setBounds(28, 152, 354, 25);
		panel.add(lblHowLuckyAre);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Below 15%", "15% to 40%", "40% to 70%", "Above 70%"}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_2.setBackground(new Color(0, 153, 102));
		comboBox_2.setBounds(38, 188, 180, 23);
		panel.add(comboBox_2);
		String luckyPersentage=comboBox_2.getSelectedItem().toString();
		JLabel lblHowManyHours = new JLabel("How many hours do you work a day ?");
		lblHowManyHours.setForeground(new Color(51, 255, 153));
		lblHowManyHours.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblHowManyHours.setBounds(28, 222, 387, 25);
		panel.add(lblHowManyHours);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select", "Below 5 hours", "5 hours to 10 hours", "Above 10 hours"}));
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_3.setBackground(new Color(0, 153, 102));
		comboBox_3.setBounds(38, 258, 180, 23);
		panel.add(comboBox_3);
                String workHours=comboBox_3.getSelectedItem().toString();
		
		JLabel lblHowManyHours_1 = new JLabel("How many hours do you sleep a day ?");
		lblHowManyHours_1.setForeground(new Color(51, 255, 153));
		lblHowManyHours_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblHowManyHours_1.setBounds(28, 292, 411, 25);
		panel.add(lblHowManyHours_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select", "Above 10 hours", "10 hours to 6 hours", "Below 6 hours"}));
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_4.setBackground(new Color(0, 153, 102));
		comboBox_4.setBounds(38, 328, 180, 23);
		panel.add(comboBox_4);
		String sleepHours=comboBox_4.getSelectedItem().toString();
	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shiwantha\\Downloads\\New folder\\Webp.net-resizeimage (1).jpg"));
		lblNewLabel.setBounds(0, 0, 758, 429);
		panel.add(lblNewLabel);
                
                /* UserDetails userdDetails=new UserDetails();
                 userdDetails=(UserDetails) userObj;
                 userdDetails.setGaolType(goal);
                 userdDetails.setGaolValueRange(goalValue);
                 userdDetails.setLuckyPersentage(luckyPersentage);
                 userdDetails.setWorkHourRange(workHours);
                 userdDetails.setSleapHourRange(sleepHours);
                 System.out.println(userdDetails.getAgeRange());*/
                	JButton button = new JButton("NEXT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                            UserDetails UserDetails=InformationGatheredBundle.getUserdetails();
			UserDetails.setGaolType(comboBox.getSelectedItem().toString());
                        UserDetails.setGaolValueRange(comboBox_1.getSelectedItem().toString());
                        UserDetails.setLuckyPersentage(comboBox_2.getSelectedItem().toString());
                        UserDetails.setWorkHourRange(comboBox_3.getSelectedItem().toString());
                        UserDetails.setSleapHourRange(comboBox_4.getSelectedItem().toString());
                                
                                
                                
                            
                            dispose();
				Quiz3 frame = new Quiz3();
				frame.setVisible(true);
			}
		});
		button.setForeground(Color.GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		button.setBackground(new Color(51, 255, 153));
		button.setBounds(605, 372, 100, 33);
		panel.add(button);
                 
                  
                 
                
        }
}
