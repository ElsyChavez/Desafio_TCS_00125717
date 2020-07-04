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

public class Malla extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Malla frame = new Malla();
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
	public Malla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Malla");
		
		//boton para regresar a la pantalla de condiciones
		JButton btnRCon = new JButton("New button");
		btnRCon.setForeground(Color.BLACK);
		btnRCon.setBackground(new Color(211, 211, 211));
		btnRCon.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Condiciones condiciones = new Condiciones();
				condiciones.setVisible(true);
				Malla.this.dispose();
				
			}
			
		});
		
		btnRCon.setBounds(50, 450, 130, 52);
		btnRCon.setText("REGRESAR");
		contentPane.add(btnRCon);
	
	//boton para ir a la pantalla de Pre Tabla
	JButton btnPrTa = new JButton("New button");
	btnPrTa.setForeground(Color.BLACK);
	btnPrTa.setBackground(new Color(211, 211, 211));
	btnPrTa.setFont(new Font("Century Gothic", Font.BOLD, 18));

	
	btnPrTa.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			PreTabla preTabla = new PreTabla();
			preTabla.setVisible(true);
			Malla.this.dispose();
			
		}
		
	});
	
	btnPrTa.setBounds(555, 450, 163, 52);
	btnPrTa.setText("TABLA 1");
	contentPane.add(btnPrTa);
	
	//imagen del dominio
	ImageIcon imgMa = new ImageIcon("src/images/mallaImagen.png");
	JLabel lMa = new JLabel();
	lMa.setBackground(new Color(219, 112, 147));
	lMa.setForeground(new Color(250, 240, 230));
	lMa.setBounds(0, 0, 770, 524);
	lMa.setIcon(new ImageIcon(imgMa.getImage().getScaledInstance(lMa.getWidth(), lMa.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lMa);
	
	}

}
