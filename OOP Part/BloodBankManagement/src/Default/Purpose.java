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
import java.awt.event.ActionEvent;


public class Purpose {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Purpose window = new Purpose();
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
	public Purpose() {
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
		
		
		JLabel lblNewLabel = new JLabel("Purpose");
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
		
		JButton btnNewButton = new JButton("Donate");
		btnNewButton.setForeground(new Color(0, 204, 102));
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnNewButton.setBounds(363, 173, 200, 85);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Donation_1();
                frame.dispose();
			}
		});

		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/Purpose.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img3));
		lblNewLabel_1.setBounds(285, 463, 402, 130);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("Receive");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnNewButton_2.setForeground(new Color(204, 0, 51));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Receiving_1();
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(363, 303, 200, 85);
		panel_1.add(btnNewButton_2);
	}
}

