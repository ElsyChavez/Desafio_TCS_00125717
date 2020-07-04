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

public class Paso51 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paso51 frame = new Paso51();
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
	public Paso51() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Paso 5 parte 2");
		
		//boton para regresar a la pantalla del paso 5 parte 1
		JButton btnRPaso5 = new JButton("New button");
		btnRPaso5.setForeground(new Color(250, 235, 215));
		btnRPaso5.setBackground(new Color(205, 92, 92));
		btnRPaso5.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRPaso5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Paso5 paso5 = new Paso5();
				paso5.setVisible(true);
				Paso51.this.dispose();
				
			}
			
		});
		
		btnRPaso5.setBounds(50, 450, 130, 52);
		btnRPaso5.setText("REGRESAR");
		contentPane.add(btnRPaso5);
	
	//boton para ir a la pantalla del paso 6 parte 1
	JButton btnPaso51 = new JButton("New button");
	btnPaso51.setForeground(new Color(250, 235, 215));
	btnPaso51.setBackground(new Color(205, 92, 92));
	btnPaso51.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnPaso51.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Paso6 paso6 = new Paso6();
			paso6.setVisible(true);
			Paso51.this.dispose();
			
		}
		
	});
	
	btnPaso51.setBounds(582, 450, 136, 52);
	btnPaso51.setText("PASO 6");
	contentPane.add(btnPaso51);
	
	//imagen del paso 5 parte 2
	
	ImageIcon imgP51 = new ImageIcon("src/images/paso51Imagen.png");
	JLabel lP51 = new JLabel();
	lP51.setBackground(new Color(219, 112, 147));
	lP51.setForeground(new Color(250, 240, 230));
	lP51.setBounds(0, 0, 770, 524);
	lP51.setIcon(new ImageIcon(imgP51.getImage().getScaledInstance(lP51.getWidth(), lP51.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lP51);
	
	}

}
