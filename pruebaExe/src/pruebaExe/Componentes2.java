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

public class Componentes2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Componentes2 frame = new Componentes2();
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
	public Componentes2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Datos conocidos para componentes");
		
		//boton para regresar a la pantalla de Componentes parte 1
		JButton btnRComp = new JButton("New button");
		btnRComp.setForeground(new Color(250, 235, 215));
		btnRComp.setBackground(new Color(205, 92, 92));
		btnRComp.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRComp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Componentes componente = new Componentes();
				componente.setVisible(true);
				Componentes2.this.dispose();
				
			}
			
		});
		
		btnRComp.setBounds(50, 450, 130, 52);
		btnRComp.setText("REGRESAR");
		contentPane.add(btnRComp);
		
		//boton para ir a la parte 1 del componente C
		JButton btnCompC = new JButton("New button");
		btnCompC.setForeground(new Color(250, 235, 215));
		btnCompC.setBackground(new Color(205, 92, 92));
		btnCompC.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnCompC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ComponenteC componenteC = new ComponenteC();
				componenteC.setVisible(true);
				Componentes2.this.dispose();
				
			}
			
		});
		
		btnCompC.setBounds(537, 450, 181, 52);
		btnCompC.setText("COMPONENTE C");
		contentPane.add(btnCompC);
		
		//imagen de los componentes parte 2
		
		ImageIcon imgComp2 = new ImageIcon("src/images/componentes2Imagen.png");
		JLabel lComp2 = new JLabel();
		lComp2.setBackground(new Color(219, 112, 147));
		lComp2.setForeground(new Color(250, 240, 230));
		lComp2.setBounds(0, 0, 770, 524);
		lComp2.setIcon(new ImageIcon(imgComp2.getImage().getScaledInstance(lComp2.getWidth(), lComp2.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(lComp2);
		
	}

}
