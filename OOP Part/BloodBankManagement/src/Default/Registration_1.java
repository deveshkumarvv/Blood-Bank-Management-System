package Default;
import javax.swing.*;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

import javax.swing.JOptionPane;


public class Registration_1 {
	
	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JTextField textField_9;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Registration_1 window = new Registration_1();
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
	public Registration_1() {
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setBounds(400, 100, 700, 899);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setSize(899, 899);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 51, 51));
		panel.setBounds(0, 0, 899, 71);
		frame.getContentPane().add(panel);
		
		
		
		JLabel lblNewLabel = new JLabel("Registration");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Devanagari Sangam MN", Font.BOLD, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(153, 204, 204));
		panel_1.setBounds(0, 72, 899, 812);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("First Name :");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(173, 83, 99, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name :");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setBounds(173, 124, 99, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_i = new JLabel("");
		lblNewLabel_i.setBounds(6, 6, 60, 37);
		panel_1.add(lblNewLabel_i);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile No :");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_3.setBounds(173, 167, 99, 16);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("     User ID :");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_4.setBounds(173, 209, 99, 16);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DOB :");
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_5.setBounds(221, 249, 51, 16);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gender :");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_6.setBounds(197, 289, 72, 16);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Weight :");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_7.setBounds(200, 329, 72, 16);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Blood Group :");
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_8.setBounds(159, 372, 113, 16);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Password :");
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_9.setBounds(184, 419, 89, 16);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Confirm Password :");
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_10.setBounds(115, 457, 152, 16);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Address :");
		lblNewLabel_11.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_11.setBounds(197, 504, 113, 16);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Physically Disabled :");
		lblNewLabel_12.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_12.setBounds(106, 605, 166, 16);
		panel_1.add(lblNewLabel_12);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(281, 71, 186, 34);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(281, 116, 186, 34);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(281, 159, 186, 34);
		panel_1.add(textField_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(281, 201, 186, 34);
		panel_1.add(textField_7);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(284, 241, 180, 34);
		panel_1.add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Male");
		comboBox.addItem("Female");
		comboBox.addItem("Other");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(283, 279, 184, 34);
		panel_1.add(comboBox);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(281, 325, 186, 34);
		panel_1.add(textField_8);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(285, 407, 182, 34);
		panel_1.add(passwordField_2);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(285, 453, 182, 34);
		panel_1.add(passwordField_3);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(281, 504, 186, 84);
		panel_1.add(textField_9);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("A+");
		comboBox_1.addItem("A-");
		comboBox_1.addItem("B+");
		comboBox_1.addItem("B-");
		comboBox_1.addItem("O+");
		comboBox_1.addItem("O-");
		comboBox_1.addItem("AB+");
		comboBox_1.addItem("AB-");

		comboBox_1.setSelectedItem(null);
		comboBox_1.setBounds(284, 369, 186, 27);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItem("No");
		comboBox_2.addItem("Yes");
		comboBox_2.setBounds(284, 602, 183, 27);
		panel_1.add(comboBox_2);
		
		JButton btnNewButton = new JButton("Submit");
		
		
		btnNewButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
            	
            	if(textField.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "First Name is Empty");
					
				}
				else if(textField_1.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Last Name is Empty");
				
					
				}
				
				else if(textField_2.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Moblie No is Empty");
				
					
				}
				
				
				else if(textField_7.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "User ID is Empty");
					
				}
				else if(textField_8.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Weight is Empty");
					
				}
				else if(passwordField_2.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Password is Empty");
					
				}
				else if(passwordField_3.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Password is Empty");
					
				}
				
				else if (!( new String (passwordField_2.getPassword() ).equals( new String( passwordField_3.getPassword () ) ) ) ) {
					JOptionPane.showMessageDialog(null, "Your passwords do not match!");
				}
				
				else if(textField_9.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Address is Empty");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "you have successfully registered");
					new LoginPage();
					frame.dispose();
					
					
				}
            	
                String fname = textField.getText();
                String lname = textField_1.getText();
                String mobno = textField_2.getText();
                String userid = textField_7.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String dob = sdf.format(dateChooser.getDate());
                String gender = comboBox.getSelectedItem().toString();
                int weight = Integer.parseInt(textField_8.getText());;
                String blood_grp = comboBox_1.getSelectedItem().toString();
                String pass = passwordField_2.getText();
                String con_pass = passwordField_3.getText();
                String address = textField_9.getText();
                String phy_dis = comboBox_2.getSelectedItem().toString();
        
                try {
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BloodBank", "postgres", "2580");

                    String query = "INSERT INTO register values('" + fname + "' ,'" + lname + "' , '" + mobno + "' , '" + userid + "' ,'" + dob + "' , '" + gender + "' , '" + weight + "' , '" + blood_grp + "' , '" + pass + "' , '" + con_pass + "' , '" + address + "' , '" + phy_dis + "')";
                    
                    
                    PreparedStatement st= connection.prepareStatement("select fName,lName,Mobile_no,User_id,Dob,Gender,Weight,Blood_grp,Pass_word,Conf_password,Address,Phy_dis from register where fName=? and lName=? and Mobile_no=? and User_id=? and Dob=? and Gender=? and Weight=? and Blood_grp=? and Pass_word=? and Conf_password=? and Address=? and Phy_dis=? ");
                  
                    
                    st.setString(1,fname);
                  
                    st.setString(2,lname);
                    st.setString(3,mobno);
                    st.setString(4,userid);
                    st.setString(5,dob);
                    st.setString(6,gender);
                    st.setInt(7,weight);
                    st.setString(8,blood_grp);
                    st.setString(9,pass);
                    st.setString(10,con_pass);
                    st.setString(11,address);
                    st.setString(12,phy_dis);
                    
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
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnNewButton.setBounds(319, 666, 117, 29);
		
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_13 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/RegImage.jpg")).getImage();
		lblNewLabel_13.setIcon(new ImageIcon(img2));

		lblNewLabel_13.setBounds(504, 224, 389, 264);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/NHM.jpg")).getImage();
		lblNewLabel_i.setIcon(new ImageIcon(img4));
		lblNewLabel_14.setBounds(6, 6, 60, 37);
		panel_1.add(lblNewLabel_14);
		
		
		
	}
}