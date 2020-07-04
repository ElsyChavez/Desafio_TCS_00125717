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

public class Paso1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paso1 frame = new Paso1();
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
	public Paso1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Paso 1");
		
		//boton para regresar a la pantalla de tabla de conectividades
		JButton btnRTabla = new JButton("New button");
		btnRTabla.setForeground(new Color(250, 235, 215));
		btnRTabla.setBackground(new Color(205, 92, 92));
		btnRTabla.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Tabla tabla = new Tabla();
				tabla.setVisible(true);
				Paso1.this.dispose();
				
			}
			
		});
		
		btnRTabla.setBounds(50, 450, 130, 52);
		btnRTabla.setText("REGRESAR");
		contentPane.add(btnRTabla);
	
	//boton para ir a la pantalla del paso 2
	JButton btnPaso2 = new JButton("New button");
	btnPaso2.setForeground(new Color(250, 235, 215));
	btnPaso2.setBackground(new Color(205, 92, 92));
	btnPaso2.setFont(new Font("Century Gothic", Font.BOLD, 18));

	
	btnPaso2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Paso2 paso2 = new Paso2();
			paso2.setVisible(true);
			Paso1.this.dispose();
			
		}
		
	});
	
	btnPaso2.setBounds(582, 450, 136, 52);
	btnPaso2.setText("PASO 2");
	contentPane.add(btnPaso2);
	
	//imagen del paso 1
	
	ImageIcon imgP1 = new ImageIcon("src/images/paso1Imagen.png");
	JLabel lP1 = new JLabel();
	lP1.setBackground(new Color(219, 112, 147));
	lP1.setForeground(new Color(250, 240, 230));
	lP1.setBounds(0, 0, 770, 524);
	lP1.setIcon(new ImageIcon(imgP1.getImage().getScaledInstance(lP1.getWidth(), lP1.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lP1);
	
	}

}
