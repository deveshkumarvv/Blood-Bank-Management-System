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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class ConfMsgRec {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					ConfMsgRec window = new ConfMsgRec();
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
	public ConfMsgRec() {
		initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setBounds(270, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setSize(899, 899);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 51, 51));
		panel.setBounds(0, 0, 899, 71);
		frame.getContentPane().add(panel);
		
		
		
		JLabel lblNewLabel = new JLabel("Confirmation Window - Receiving");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Devanagari Sangam MN", Font.BOLD, 17));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(153, 204, 204));
		panel_1.setBounds(0, 72, 899, 867);
		panel_1.setSize(899, 899);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		
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
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/LDescp.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		lblNewLabel_3.setBounds(225, 362, 500, 274);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/NHM.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img2));
		lblNewLabel_4.setBounds(6, 6, 60, 37);
		panel_1.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		textField.setText("Slot Booking For Receiving Successfull");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBackground(new Color(153, 153, 153));
		textField.setBounds(319, 100, 286, 77);
		panel_1.add(textField);
		
		Image img3 = new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(459, 189, 60, 37);
		lblNewLabel_2.setIcon(new ImageIcon(img3));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Date :");
		lblNewLabel_1.setBounds(225, 276, 102, 29);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(272, 277, 130, 26);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Time Slot :");
		lblNewLabel_5.setBounds(196, 248, 85, 16);
		panel_1.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(272, 243, 130, 26);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Branch :");
		lblNewLabel_6.setBounds(211, 317, 61, 16);
		panel_1.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(272, 312, 130, 26);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("View Slot Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
try {
                	
                    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BloodBank", "postgres", "2580");

                    PreparedStatement st= connection.prepareStatement("select r.Time_slot,r.Date_Rec,r.branch from Receiving_details r , login l where l.user_id = r.user_id");
                    
                    ResultSet rs = st.executeQuery();
                 
                  
                    
                    if(rs.next()) { 
                    	
                       
                        String time = rs.getString("Time_slot");
                        textField_2.setText(time);
                        
                        String date = rs.getString("Date_Rec");
                        textField_1.setText(date);
                        
                        String branch = rs.getString("branch");
                        textField_3.setText(branch);
    
                    }
				 
                connection.close();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
				
				
			}
		});
		btnNewButton.setBounds(511, 277, 149, 29);
		panel_1.add(btnNewButton);

	}
}