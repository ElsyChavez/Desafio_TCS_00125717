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

public class Condiciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Condiciones frame = new Condiciones();
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
	public Condiciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Condiciones");
		
		//boton para regresar a la pantalla dominio
		JButton btnRDom = new JButton("New button");
		btnRDom.setForeground(Color.BLACK);
		btnRDom.setBackground(new Color(211, 211, 211));
		btnRDom.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRDom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Dominio dominio = new Dominio();
				dominio.setVisible(true);
				Condiciones.this.dispose();
				
			}
			
		});
		
		btnRDom.setBounds(50, 450, 130, 52);
		btnRDom.setText("REGRESAR");
		contentPane.add(btnRDom);
	
	//boton para ir a la pantalla de Malla
	JButton btnMa = new JButton("New button");
	btnMa.setForeground(Color.BLACK);
	btnMa.setBackground(new Color(211, 211, 211));
	btnMa.setFont(new Font("Century Gothic", Font.BOLD, 18));

	
	btnMa.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Malla malla = new Malla();
			malla.setVisible(true);
			Condiciones.this.dispose();
			
		}
		
	});
	
	btnMa.setBounds(555, 450, 163, 52);
	btnMa.setText("MALLA");
	contentPane.add(btnMa);
	
	//imagen de las condiciones
	
	ImageIcon imgCond = new ImageIcon("images/condicionesImagen.png");
	JLabel lCond = new JLabel();
	lCond.setBackground(new Color(219, 112, 147));
	lCond.setForeground(new Color(250, 240, 230));
	lCond.setBounds(0, 0, 770, 524);
	lCond.setIcon(new ImageIcon(imgCond.getImage().getScaledInstance(lCond.getWidth(), lCond.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lCond);
	
	}

}

