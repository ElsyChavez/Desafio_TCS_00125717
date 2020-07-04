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

public class Paso81 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paso81 frame = new Paso81();
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
	public Paso81() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Paso 8 parte 2");
		
		//boton para regresar a la pantalla del paso 8 parte 1
		JButton btnRCompC1 = new JButton("New button");
		btnRCompC1.setForeground(new Color(250, 235, 215));
		btnRCompC1.setBackground(new Color(205, 92, 92));
		btnRCompC1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRCompC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Paso8 paso8 = new Paso8();
				paso8.setVisible(true);
				Paso81.this.dispose();
				
			}
			
		});
		
		btnRCompC1.setBounds(50, 450, 130, 52);
		btnRCompC1.setText("REGRESAR");
		contentPane.add(btnRCompC1);
	
	//boton para ir a la pantalla del paso 8 parte 3
		
	JButton btnCompG = new JButton("New button");
	btnCompG.setForeground(new Color(250, 235, 215));
	btnCompG.setBackground(new Color(205, 92, 92));
	btnCompG.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnCompG.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Paso82 paso82 = new Paso82();
			paso82.setVisible(true);
			Paso81.this.dispose();
			
		}
		
	});
	
	btnCompG.setBounds(588, 450, 130, 52);
	btnCompG.setText("PASO 8");
	contentPane.add(btnCompG);
	
	//imagen del pre ensamblaje
	ImageIcon imgComp = new ImageIcon("src/ensamblaje/paso81Imagen.png");
	JLabel lComp = new JLabel();
	lComp.setBackground(new Color(219, 112, 147));
	lComp.setForeground(new Color(250, 240, 230));
	lComp.setBounds(0, 0, 770, 524);
	lComp.setIcon(new ImageIcon(imgComp.getImage().getScaledInstance(lComp.getWidth(), lComp.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lComp);
	
	}

}
