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

public class Tabla extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla frame = new Tabla();
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
	public Tabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Tabla de conectividades");
		
		//boton para regresar a la pantalla de la pre tabla 1
		JButton btnRPTa1 = new JButton("New button");
		btnRPTa1.setForeground(new Color(250, 235, 215));
		btnRPTa1.setBackground(new Color(205, 92, 92));
		btnRPTa1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRPTa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PreTabla preTa = new PreTabla();
				preTa.setVisible(true);
				Tabla.this.dispose();
				
			}
			
		});
		
		btnRPTa1.setBounds(50, 450, 130, 52);
		btnRPTa1.setText("REGRESAR");
		contentPane.add(btnRPTa1);
	
	//boton para ir a la pantalla del paso 1
	JButton btnPaso1 = new JButton("New button");
	btnPaso1.setForeground(new Color(250, 235, 215));
	btnPaso1.setBackground(new Color(205, 92, 92));
	btnPaso1.setFont(new Font("Century Gothic", Font.BOLD, 18));

	
	btnPaso1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Paso1 paso1 = new Paso1();
			paso1.setVisible(true);
			Tabla.this.dispose();
			
		}
		
	});
	
	btnPaso1.setBounds(582, 450, 136, 52);
	btnPaso1.setText("PASO 1");
	contentPane.add(btnPaso1);
	
	//imagen de la tabla de conectividades
	
	ImageIcon imgTab = new ImageIcon("images/tablaConectividadesImagen.png");
	JLabel lTab = new JLabel();
	lTab.setBackground(new Color(219, 112, 147));
	lTab.setForeground(new Color(250, 240, 230));
	lTab.setBounds(0, 0, 770, 524);
	lTab.setIcon(new ImageIcon(imgTab.getImage().getScaledInstance(lTab.getWidth(), lTab.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lTab);
	
	}

}
