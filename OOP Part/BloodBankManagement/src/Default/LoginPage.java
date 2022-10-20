package Default;
import javax.swing.*;



import java.sql.*;
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
import java.awt.event.ActionEvent;

public class LoginPage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		String jdbcURL = "jdbc:postgresql://localhost:5432/BloodBank";
		String user = "postgres";
		String pass = "2580";
		try {
			Connection connnection = DriverManager.getConnection(jdbcURL, user, pass);
			System.out.println("Connected");
			connnection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
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
		
		
		
		JLabel lblNewLabel = new JLabel("Login");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Devanagari Sangam MN", Font.BOLD, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(153, 204, 204));
		panel_1.setBounds(0, 72, 899, 867);
		panel_1.setSize(899, 899);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User ID     :");
		lblNewLabel_1.setFont(new Font("Devanagari Sangam MN", Font.BOLD, 35));
		lblNewLabel_1.setBounds(195, 142, 167, 45);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setFont(new Font("Devanagari Sangam MN", Font.BOLD, 35));
		lblNewLabel_2.setBounds(195, 210, 167, 51);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(new Color(153, 153, 153));
		textField.setBounds(391, 148, 222, 37);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(153, 153, 153));
		passwordField.setBounds(391, 217, 222, 40);
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		Image img = new ImageIcon(this.getClass().getResource("/Ok.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(51, 51, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
                String password = passwordField.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/BloodBank",
                        "postgres", "2580");

                    String query = "INSERT INTO login values('" + userName + "')";
          
                    PreparedStatement st = (PreparedStatement) connection
                        .prepareStatement("Select User_id, Pass_word from register where User_id=? and Pass_word=?");
                    PreparedStatement st1 = (PreparedStatement) connection
                            .prepareStatement("Select User_id from login where User_id=? ");

                    st.setString(1, userName);
                    st.setString(2, password);
                    
                    st1.setString(1, userName);
                    
                    ResultSet rs = st.executeQuery();
                   
                    if (rs.next()) {
                        
                        JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
                        Statement sta = connection.createStatement();
                        int x = sta.executeUpdate(query);
                        new Purpose();
        				frame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
				
				
			}
		});
		btnNewButton.setBounds(440, 285, 133, 45);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Not a User? Register Here!");
		btnNewButton_1.setBackground(new Color(204, 51, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Registration_1();
                frame.dispose();
				
			}
		});

		btnNewButton_1.setBounds(703, 6, 190, 29);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/LDescp.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		lblNewLabel_3.setBounds(197, 362, 500, 274);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/NHM.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img2));
		lblNewLabel_4.setBounds(6, 6, 60, 37);
		panel_1.add(lblNewLabel_4);
		
			}
}