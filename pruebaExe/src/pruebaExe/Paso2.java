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

public class Paso2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paso2 frame = new Paso2();
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
	public Paso2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Paso 2");
		
		//boton para regresar a la pantalla del paso 1
		JButton btnRPaso1 = new JButton("New button");
		btnRPaso1.setForeground(new Color(250, 235, 215));
		btnRPaso1.setBackground(new Color(205, 92, 92));
		btnRPaso1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRPaso1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Paso1 paso1 = new Paso1();
				paso1.setVisible(true);
				Paso2.this.dispose();
				
			}
			
		});
		
		btnRPaso1.setBounds(50, 450, 130, 52);
		btnRPaso1.setText("REGRESAR");
		contentPane.add(btnRPaso1);
	
	//boton para ir a la pantalla del paso 3
	JButton btnPaso3 = new JButton("New button");
	btnPaso3.setForeground(new Color(250, 235, 215));
	btnPaso3.setBackground(new Color(205, 92, 92));
	btnPaso3.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnPaso3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Paso3 paso3 = new Paso3();
			paso3.setVisible(true);
			Paso2.this.dispose();
			
		}
		
	});
	
	btnPaso3.setBounds(582, 450, 136, 52);
	btnPaso3.setText("PASO 3");
	contentPane.add(btnPaso3);
	
	//imagen del paso 2
	
	ImageIcon imgP2 = new ImageIcon("images/paso2Imagen.png");
	JLabel lP2 = new JLabel();
	lP2.setBackground(new Color(219, 112, 147));
	lP2.setForeground(new Color(250, 240, 230));
	lP2.setBounds(0, 0, 770, 524);
	lP2.setIcon(new ImageIcon(imgP2.getImage().getScaledInstance(lP2.getWidth(), lP2.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lP2);
	
	}

}
