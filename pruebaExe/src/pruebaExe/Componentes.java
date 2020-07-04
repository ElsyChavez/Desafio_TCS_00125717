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

public class Componentes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Componentes frame = new Componentes();
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
	public Componentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Definicion Componentes");
		
		//boton para regresar a la pantalla del paso 6 parte 2
		JButton btnRPaso61 = new JButton("New button");
		btnRPaso61.setForeground(new Color(250, 235, 215));
		btnRPaso61.setBackground(new Color(205, 92, 92));
		btnRPaso61.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRPaso61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Paso61 paso61 = new Paso61();
				paso61.setVisible(true);
				Componentes.this.dispose();
				
			}
			
		});
		
		btnRPaso61.setBounds(50, 450, 130, 52);
		btnRPaso61.setText("REGRESAR");
		contentPane.add(btnRPaso61);
	
	//boton para ir a la pantalla de componentes parte 2, datos conocidos
	JButton btnComp2 = new JButton("New button");
	btnComp2.setForeground(new Color(250, 235, 215));
	btnComp2.setBackground(new Color(205, 92, 92));
	btnComp2.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnComp2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			Componentes2 componentes2 = new Componentes2();
			componentes2.setVisible(true);
			Componentes.this.dispose();
			
		}
		
	});
	
	btnComp2.setBounds(537, 450, 181, 52);
	btnComp2.setText("COMPONENTES 2");
	contentPane.add(btnComp2);
	
	//imagen de los componentes
	
	ImageIcon imgComp = new ImageIcon("images/componentesImagen.png");
	JLabel lComp = new JLabel();
	lComp.setBackground(new Color(219, 112, 147));
	lComp.setForeground(new Color(250, 240, 230));
	lComp.setBounds(0, 0, 770, 524);
	lComp.setIcon(new ImageIcon(imgComp.getImage().getScaledInstance(lComp.getWidth(), lComp.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lComp);
	
	}

}
