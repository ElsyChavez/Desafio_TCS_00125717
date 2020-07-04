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

public class Paso6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paso6 frame = new Paso6();
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
	public Paso6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Paso 6 parte 1");
		
		//boton para regresar a la pantalla del paso 5 parte 2
		JButton btnRPaso51 = new JButton("New button");
		btnRPaso51.setForeground(new Color(250, 235, 215));
		btnRPaso51.setBackground(new Color(205, 92, 92));
		btnRPaso51.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRPaso51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Paso51 paso51 = new Paso51();
				paso51.setVisible(true);
				Paso6.this.dispose();
				
			}
			
		});
		
		btnRPaso51.setBounds(50, 450, 130, 52);
		btnRPaso51.setText("REGRESAR");
		contentPane.add(btnRPaso51);
	
	//boton para ir a la pantalla del paso 6 parte 2
	JButton btnPaso61 = new JButton("New button");
	btnPaso61.setForeground(new Color(250, 235, 215));
	btnPaso61.setBackground(new Color(205, 92, 92));
	btnPaso61.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnPaso61.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Paso61 paso61 = new Paso61();
			paso61.setVisible(true);
			Paso6.this.dispose();
			
		}
		
	});
	
	btnPaso61.setBounds(582, 450, 136, 52);
	btnPaso61.setText("PASO 6");
	contentPane.add(btnPaso61);
	
	//imagen del paso 6 parte 1
	
	ImageIcon imgP6 = new ImageIcon("src/images/paso6Imagen.png");
	JLabel lP6 = new JLabel();
	lP6.setBackground(new Color(219, 112, 147));
	lP6.setForeground(new Color(250, 240, 230));
	lP6.setBounds(0, 0, 770, 524);
	lP6.setIcon(new ImageIcon(imgP6.getImage().getScaledInstance(lP6.getWidth(), lP6.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lP6);
	
	}

}
