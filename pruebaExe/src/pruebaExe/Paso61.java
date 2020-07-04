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

public class Paso61 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paso61 frame = new Paso61();
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
	public Paso61() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Paso 6 parte 2");
		
		//boton para regresar a la pantalla del paso 6 parte 1
		JButton btnRPaso6 = new JButton("New button");
		btnRPaso6.setForeground(new Color(250, 235, 215));
		btnRPaso6.setBackground(new Color(205, 92, 92));
		btnRPaso6.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRPaso6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Paso6 paso6 = new Paso6();
				paso6.setVisible(true);
				Paso61.this.dispose();
				
			}
			
		});
		
		btnRPaso6.setBounds(50, 450, 130, 52);
		btnRPaso6.setText("REGRESAR");
		contentPane.add(btnRPaso6);
	
	//boton para ir a la pantalla de los componentes
	JButton btnComp = new JButton("New button");
	btnComp.setForeground(new Color(250, 235, 215));
	btnComp.setBackground(new Color(205, 92, 92));
	btnComp.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnComp.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Componentes componentes = new Componentes();
			componentes.setVisible(true);
			Paso61.this.dispose();
			
		}
		
	});
	
	btnComp.setBounds(549, 450, 169, 52);
	btnComp.setText("COMPONENTES");
	contentPane.add(btnComp);
	
	//imagen del paso 6 parte 2
	
	ImageIcon imgP61 = new ImageIcon("images/paso61Imagen.png");
	JLabel lP61 = new JLabel();
	lP61.setBackground(new Color(219, 112, 147));
	lP61.setForeground(new Color(250, 240, 230));
	lP61.setBounds(0, 0, 770, 524);
	lP61.setIcon(new ImageIcon(imgP61.getImage().getScaledInstance(lP61.getWidth(), lP61.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lP61);
	
	}

}
