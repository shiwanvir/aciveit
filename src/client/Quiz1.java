package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javarmi.server.UserDetails;

public class Quiz1 extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
        public static Object userObj;
            
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz1 frame = new Quiz1();
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
	public Quiz1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 749, 428);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("What is your age ?");
		label_1.setForeground(new Color(51, 255, 153));
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_1.setBounds(40, 94, 248, 25);
		panel.add(label_1);
                
		
	
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Profession", "Government Section", "Private Section", "Personal Business"}));
		
                comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox.setBackground(new Color(0, 153, 102));
		comboBox.setBounds(50, 59, 180, 23);
		panel.add(comboBox);
                //comboBox.setSelectedItem(null);
                
                
                  
		
		JLabel lblWhatIsYour = new JLabel("What is your profession ?");
		lblWhatIsYour.setForeground(new Color(51, 255, 153));
		lblWhatIsYour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblWhatIsYour.setBounds(40, 23, 312, 25);
		panel.add(lblWhatIsYour);
               
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Age", "Below 20", "21 to 35", "36 to 50", "Above 50"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_1.setBackground(new Color(0, 153, 102));
		comboBox_1.setBounds(50, 130, 180, 23);
		panel.add(comboBox_1);
                //String age=comboBox_1.getSelectedItem().toString();
		
		JLabel lblWhatIsYour_1 = new JLabel("What is your Gender ?");
		lblWhatIsYour_1.setForeground(new Color(51, 255, 153));
		lblWhatIsYour_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblWhatIsYour_1.setBounds(40, 164, 312, 25);
		panel.add(lblWhatIsYour_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_2.setBackground(new Color(0, 153, 102));
		comboBox_2.setBounds(50, 200, 180, 23);
		panel.add(comboBox_2);
		//String gender=comboBox_2.getSelectedItem().toString();
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select Income", "Below Rs.25000", "Rs.25000 - Rs.100000", "Rs.100000 - Rs.300000", "Above Rs.300000"}));
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_3.setBackground(new Color(0, 153, 102));
		comboBox_3.setBounds(50, 270, 180, 23);
		panel.add(comboBox_3);
		//String income=comboBox_3.getSelectedItem().toString();
		JLabel lblWhatIsYour_2 = new JLabel("What is your monthly income ?");
		lblWhatIsYour_2.setForeground(new Color(51, 255, 153));
		lblWhatIsYour_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblWhatIsYour_2.setBounds(40, 234, 312, 25);
		panel.add(lblWhatIsYour_2);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select Expense Range", "Rs.10000 to Rs.20000", "Rs.20000 to Rs.50000", "Rs.50000 to Rs.200000", "Above Rs.200000"}));
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_4.setBackground(new Color(0, 153, 102));
		comboBox_4.setBounds(50, 340, 180, 23);
		panel.add(comboBox_4);
                //String expenceRange=comboBox_4.getSelectedItem().toString();
		
		JLabel lblWhatIsYour_3 = new JLabel("What is your monthly expense range ?");
		lblWhatIsYour_3.setForeground(new Color(51, 255, 153));
		lblWhatIsYour_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblWhatIsYour_3.setBounds(40, 304, 411, 25);
		panel.add(lblWhatIsYour_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\shiwantha\\Downloads\\New folder\\Webp.net-resizeimage (1).jpg"));
		lblNewLabel.setBounds(0, 0, 739, 428);
		panel.add(lblNewLabel);
                    
                    
            /*    UserDetails userdDetails=new UserDetails();
                userdDetails.setProfession(Profession);
                userdDetails.setAgeRange(age);
                userdDetails.setGender(gender);
                userdDetails.setIncomeRange(income);
                userdDetails.setExpenceRange(expenceRange);
                   userObj=userdDetails;
        
             ng ser*/        
            	JButton button = new JButton("NEXT");
		button.addActionListener(new ActionListener() {
                    
			public void actionPerformed(ActionEvent arg0) {
                            UserDetails user=new UserDetails();
                            user.setProfession(comboBox.getSelectedItem().toString());
                            user.setAgeRange(comboBox_1.getSelectedItem().toString());
                            user.setGender(comboBox_2.getSelectedItem().toString());
                            user.setIncomeRange(comboBox_3.getSelectedItem().toString());
                            user.setExpenceRange(comboBox_4.getSelectedItem().toString());   
                            InformationGatheredBundle.setUserdetails(user);
                                dispose();
				Quiz2 frame = new Quiz2();
				frame.setVisible(true);
                                
				
			}
		});
		button.setForeground(Color.GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		button.setBackground(new Color(51, 255, 153));
		button.setBounds(617, 384, 100, 33);
		panel.add(button);
        
        }
}
