package pruebaExe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Modelo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modelo frame = new Modelo();
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
	public Modelo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Modelo");
		
		//boton para ir a la pantalla dominio
		JButton btnNewButton1 = new JButton("New button");
		btnNewButton1.setForeground(new Color(250, 235, 215));
		btnNewButton1.setBackground(new Color(205, 92, 92));
		btnNewButton1.setFont(new Font("Century Gothic", Font.BOLD, 18));

		
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Dominio dominio = new Dominio();
				dominio.setVisible(true);
				Modelo.this.dispose();
				
			}
			
		});
		
		btnNewButton1.setBounds(600, 450, 118, 52);
		btnNewButton1.setText("DOMINIO");
		contentPane.add(btnNewButton1);
		
		//imagen con el modelo a utilizar
		
		ImageIcon imgM = new ImageIcon("src/images/modeloImagen.png");
		JLabel lMo = new JLabel();
		lMo.setBackground(new Color(219, 112, 147));
		lMo.setForeground(new Color(250, 240, 230));
		lMo.setBounds(0, 0, 770, 553);
		lMo.setIcon(new ImageIcon(imgM.getImage().getScaledInstance(lMo.getWidth(), lMo.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(lMo);
		
	}
}

