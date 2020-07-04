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

public class Paso4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paso4 frame = new Paso4();
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
	public Paso4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Paso 4");
		
		//boton para regresar a la pantalla del paso 3
		JButton btnRPaso3 = new JButton("New button");
		btnRPaso3.setForeground(new Color(250, 235, 215));
		btnRPaso3.setBackground(new Color(205, 92, 92));
		btnRPaso3.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRPaso3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Paso3 paso3 = new Paso3();
				paso3.setVisible(true);
				Paso4.this.dispose();
				
			}
			
		});
		
		btnRPaso3.setBounds(50, 450, 130, 52);
		btnRPaso3.setText("REGRESAR");
		contentPane.add(btnRPaso3);
	
	//boton para ir a la pantalla del paso 5
	JButton btnPaso5 = new JButton("New button");
	btnPaso5.setForeground(new Color(250, 235, 215));
	btnPaso5.setBackground(new Color(205, 92, 92));
	btnPaso5.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnPaso5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Paso5 paso5 = new Paso5();
			paso5.setVisible(true);
			Paso4.this.dispose();
			
		}
		
	});
	
	btnPaso5.setBounds(582, 450, 136, 52);
	btnPaso5.setText("PASO 5");
	contentPane.add(btnPaso5);
	
	//imagen del paso 4
	
	ImageIcon imgP4 = new ImageIcon("images/paso4Imagen.png");
	JLabel lP4 = new JLabel();
	lP4.setBackground(new Color(219, 112, 147));
	lP4.setForeground(new Color(250, 240, 230));
	lP4.setBounds(0, 0, 770, 524);
	lP4.setIcon(new ImageIcon(imgP4.getImage().getScaledInstance(lP4.getWidth(), lP4.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lP4);
	
	}

}
