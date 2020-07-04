package pruebaExe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;

public class Bienvenida {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida window = new Bienvenida();
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
	public Bienvenida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Bienvenidos");
		frame.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(new Color(255, 255, 240));
		btnNewButton.setBackground(new Color(205, 92, 92));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				Modelo modelo = new Modelo();
				modelo.setVisible(true);
				
			}
		});
		
		btnNewButton.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		btnNewButton.setBounds(298, 275, 118, 52);
		btnNewButton.setText("Begin here");
		frame.getContentPane().add(btnNewButton);
		
		ImageIcon img1 = new ImageIcon("src/images/bienvenida.png");
		JLabel label2 = new JLabel();
		label2.setBounds(0, 0, 500, 502);
		label2.setIcon(new ImageIcon(img1.getImage().getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_SMOOTH)));
		frame.getContentPane().add(label2);
		
	}
}