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

public class PreTabla extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreTabla frame = new PreTabla();
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
	public PreTabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Pre Tabla 1");
		
		//boton para regresar a la pantalla de la malla
		JButton btnRMa = new JButton("New button");
		btnRMa.setForeground(new Color(250, 235, 215));
		btnRMa.setBackground(new Color(205, 92, 92));
		btnRMa.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRMa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Malla malla = new Malla();
				malla.setVisible(true);
				PreTabla.this.dispose();
				
			}
			
		});
		
		btnRMa.setBounds(50, 450, 130, 52);
		btnRMa.setText("REGRESAR");
		contentPane.add(btnRMa);
	
	//boton para ir a la pantalla de tabla de conectividades
		JButton btnTabla = new JButton("New button");
		btnTabla.setForeground(new Color(250, 235, 215));
		btnTabla.setBackground(new Color(205, 92, 92));
		btnTabla.setFont(new Font("Century Gothic", Font.BOLD, 18));

		
		btnTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Tabla tabla = new Tabla();
				tabla.setVisible(true);
				PreTabla.this.dispose();
				
			}
			
		});
		
		btnTabla.setBounds(470, 450, 248, 52);
		btnTabla.setText("TABLA CONECTIVIDADES");
		contentPane.add(btnTabla);
		
		//imagen de la pre tabla
		
		ImageIcon imgPTa = new ImageIcon("images/preTablaImagen.png");
		JLabel lPta = new JLabel();
		lPta.setBackground(new Color(219, 112, 147));
		lPta.setForeground(new Color(250, 240, 230));
		lPta.setBounds(0, 0, 770, 524);
		lPta.setIcon(new ImageIcon(imgPTa.getImage().getScaledInstance(lPta.getWidth(), lPta.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(lPta);
	
	}

}
