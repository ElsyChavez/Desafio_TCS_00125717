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

public class Dominio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dominio frame = new Dominio();
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
	public Dominio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Dominio");
		
		//boton para regresar a la pantalla modelo
		JButton btnNewButton1 = new JButton("New button");
		btnNewButton1.setForeground(Color.BLACK);
		btnNewButton1.setBackground(new Color(211, 211, 211));
		btnNewButton1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Modelo modelo = new Modelo();
				modelo.setVisible(true);
				Dominio.this.dispose();
				
			}
			
		});
		
		btnNewButton1.setBounds(50, 450, 130, 52);
		btnNewButton1.setText("REGRESAR");
		contentPane.add(btnNewButton1);
	
	//boton para ir a la pantalla de condiciones
	JButton btnCon = new JButton("New button");
	btnCon.setForeground(Color.BLACK);
	btnCon.setBackground(new Color(211, 211, 211));
	btnCon.setFont(new Font("Century Gothic", Font.BOLD, 18));

	
	btnCon.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Condiciones condiciones = new Condiciones();
			condiciones.setVisible(true);
			Dominio.this.dispose();
			
		}
		
	});
	
	btnCon.setBounds(545, 450, 163, 52);
	btnCon.setText("CONDICIONES");
	contentPane.add(btnCon);
	
	//imagen del dominio
	ImageIcon imgDom = new ImageIcon("src/images/dominioImagen.png");
	JLabel lDom = new JLabel();
	lDom.setBackground(new Color(219, 112, 147));
	lDom.setForeground(new Color(250, 240, 230));
	lDom.setBounds(0, 0, 770, 524);
	lDom.setIcon(new ImageIcon(imgDom.getImage().getScaledInstance(lDom.getWidth(), lDom.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lDom);
	
	}

}
