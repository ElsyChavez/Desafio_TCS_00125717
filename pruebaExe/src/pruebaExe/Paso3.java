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

public class Paso3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paso3 frame = new Paso3();
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
	public Paso3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Paso 3");
		
		//boton para regresar a la pantalla del paso 2
		JButton btnRPaso2 = new JButton("New button");
		btnRPaso2.setForeground(new Color(250, 235, 215));
		btnRPaso2.setBackground(new Color(205, 92, 92));
		btnRPaso2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRPaso2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Paso2 paso2 = new Paso2();
				paso2.setVisible(true);
				Paso3.this.dispose();
				
			}
			
		});
		
		btnRPaso2.setBounds(50, 450, 130, 52);
		btnRPaso2.setText("REGRESAR");
		contentPane.add(btnRPaso2);
	
	//boton para ir a la pantalla del paso 4
	JButton btnPaso4 = new JButton("New button");
	btnPaso4.setForeground(new Color(250, 235, 215));
	btnPaso4.setBackground(new Color(205, 92, 92));
	btnPaso4.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnPaso4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Paso4 paso4 = new Paso4();
			paso4.setVisible(true);
			Paso3.this.dispose();
			
		}
		
	});
	
	btnPaso4.setBounds(582, 450, 136, 52);
	btnPaso4.setText("PASO 4");
	contentPane.add(btnPaso4);
	
	//imagen del paso 3
	
	ImageIcon imgP3 = new ImageIcon("src/images/paso3Imagen.png");
	JLabel lP3 = new JLabel();
	lP3.setBackground(new Color(219, 112, 147));
	lP3.setForeground(new Color(250, 240, 230));
	lP3.setBounds(0, 0, 770, 524);
	lP3.setIcon(new ImageIcon(imgP3.getImage().getScaledInstance(lP3.getWidth(), lP3.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lP3);
	
	}

}
