package pruebaExe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Paso5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paso5 frame = new Paso5();
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
	public Paso5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Paso 5 parte 1");
		
		//boton para regresar a la pantalla del paso 4
		JButton btnRPaso4 = new JButton("New button");
		btnRPaso4.setForeground(new Color(250, 235, 215));
		btnRPaso4.setBackground(new Color(205, 92, 92));
		btnRPaso4.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRPaso4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Paso4 paso4 = new Paso4();
				paso4.setVisible(true);
				Paso5.this.dispose();
				
			}
			
		});
		
		btnRPaso4.setBounds(50, 450, 130, 52);
		btnRPaso4.setText("REGRESAR");
		contentPane.add(btnRPaso4);
	
	//boton para ir a la pantalla del paso 5 parte 2
	JButton btnPaso51 = new JButton("New button");
	btnPaso51.setForeground(new Color(250, 235, 215));
	btnPaso51.setBackground(new Color(205, 92, 92));
	btnPaso51.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnPaso51.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Paso51 paso51 = new Paso51();
			paso51.setVisible(true);
			Paso5.this.dispose();
			
		}
		
	});
	
	btnPaso51.setBounds(582, 450, 136, 52);
	btnPaso51.setText("PASO 5");
	contentPane.add(btnPaso51);
	
	//imagen del paso 5 parte 1
	
	ImageIcon imgP5 = new ImageIcon("images/paso5Imagen.png");
	JLabel lP5 = new JLabel();
	lP5.setBackground(new Color(219, 112, 147));
	lP5.setForeground(new Color(250, 240, 230));
	lP5.setBounds(0, 0, 770, 524);
	lP5.setIcon(new ImageIcon(imgP5.getImage().getScaledInstance(lP5.getWidth(), lP5.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lP5);
	
	}

}
