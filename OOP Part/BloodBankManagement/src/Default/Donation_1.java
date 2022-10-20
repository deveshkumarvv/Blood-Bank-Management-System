package Default;
import javax.swing.*;



import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class Donation_1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Donation_1 window = new Donation_1();
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
	public Donation_1() {
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setBounds(270, 100, 899, 899);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setSize(899, 899);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 51, 51));
		panel.setBounds(0, 0, 899, 71);
		frame.getContentPane().add(panel);
		
		JList list = new JList();
		panel.add(list);
		
		JLabel lblNewLabel = new JLabel("Donation");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Devanagari Sangam MN", Font.BOLD, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(153, 204, 204));
		panel_1.setBounds(0, 72, 899, 867);
		panel_1.setSize(899, 899);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.setBackground(new Color(204, 51, 102));
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/BloodBank",
                        "postgres", "2580");

         
          
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("delete from login;");
                    	int x = st.executeUpdate();
                    	new LoginPage();
                        frame.dispose();
                        
        			}
                    
				
				catch (Exception exception) {
                    exception.printStackTrace();
                }
			
		
			}
		});
		btnNewButton_1.setBounds(703, 6, 190, 29);
		panel_1.add(btnNewButton_1);
	
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/NHM.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img2));
		lblNewLabel_4.setBounds(6, 6, 60, 37);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Blood Group :");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_5.setBounds(317, 172, 108, 16);
		panel_1.add(lblNewLabel_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("A+");
		comboBox_1.addItem("A-");
		comboBox_1.addItem("B+");
		comboBox_1.addItem("B-");
		comboBox_1.addItem("O+");
		comboBox_1.addItem("O-");
		comboBox_1.addItem("AB+");
		comboBox_1.addItem("AB-");

		comboBox_1.setSelectedItem(null);
		
		comboBox_1.setBounds(432, 168, 165, 27);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Amount of Blood Donating(in ml) :");
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(178, 196, 246, 35);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch :");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_2.setBounds(356, 250, 68, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" Date :");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_3.setBounds(366, 299, 68, 16);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("Time slot :");
		lblNewLabel_4_1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblNewLabel_4_1.setBounds(341, 344, 73, 16);
		panel_1.add(lblNewLabel_4_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(432, 201, 165, 30);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(432, 243, 165, 30);
		panel_1.add(textField_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(432, 289, 165, 26);
		panel_1.add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("9:00 - 10:00");
		comboBox.addItem("10:00 - 11:00");
		comboBox.addItem("11:00 - 12:00");
		comboBox.addItem("3:00 - 4:00");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(426, 340, 171, 27);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewButton.setBounds(449, 369, 117, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Amount of Blood Donating is Empty");
					
				}
				
				else if(textField_1.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Branch is Empty");
					
				}
				else {
				new ConfMsgDon();
                frame.dispose();
				}
				
				int amt =Integer.parseInt(textField.getText());;
                String branch = textField_1.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String date = sdf.format(dateChooser.getDate());
                String time = comboBox.getSelectedItem().toString();
                String blood_grp = comboBox_1.getSelectedItem().toString();
                String userid = null;
        
                try {
                	
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BloodBank", "postgres", "2580");

                     PreparedStatement st1= connection.prepareStatement("select user_id from login where user_id like '_%' ");
                    
                    
                    ResultSet rs1= st1.executeQuery();
                    while (rs1.next())
                    {
                    	userid = rs1.getString("user_id"); 
                    }
                    
                    
                    String query = "INSERT INTO Donation_details values('" + blood_grp + "','" + amt + "' ,'" + branch + "' , '" + date + "' , '" + time + "' ,'" + userid + "')";
                    
                    
                    PreparedStatement st= connection.prepareStatement("select blood_grp,Amt_blood,Branch,Date_Don,Time_slot,User_id from Donation_details where blood_grp=? and Amt_blood=? and Branch=? and Date_Don=? and Time_slot=? and User_id=? ");
                  
                    st.setString(1,blood_grp);
                    st.setInt(2,amt);
                  
                    st.setString(3,branch);
                    st.setString(4,date);
                    st.setString(5,time);
                    st.setString(6,userid);
                    
                    ResultSet rs= st.executeQuery();
                    if (rs.next()) 
                    {
                        JOptionPane.showMessageDialog(btnNewButton, "already exist");
                    } 
                    else 
                    {
                    	Statement sta = connection.createStatement();
                        int x = sta.executeUpdate(query);
                   
                      
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
			
			}
		});
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/Purpose.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img3));

		lblNewLabel_1.setBounds(306, 463, 402, 130);
		panel_1.add(lblNewLabel_1);
		
		
	}
}