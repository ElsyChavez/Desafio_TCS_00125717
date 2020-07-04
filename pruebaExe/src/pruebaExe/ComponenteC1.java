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

public class ComponenteC1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponenteC1 frame = new ComponenteC1();
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
	public ComponenteC1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Componente C parte 2");
		
		//boton para regresar a la pantalla de componente C parte 1
		JButton btnRCompC = new JButton("New button");
		btnRCompC.setForeground(new Color(250, 235, 215));
		btnRCompC.setBackground(new Color(205, 92, 92));
		btnRCompC.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRCompC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ComponenteC componenteC = new ComponenteC();
				componenteC.setVisible(true);
				ComponenteC1.this.dispose();
				
			}
			
		});
		
		btnRCompC.setBounds(50, 450, 130, 52);
		btnRCompC.setText("REGRESAR");
		contentPane.add(btnRCompC);
	
	//boton para ir a la pantalla del componente C parte 3
	JButton btnCompC2 = new JButton("New button");
	btnCompC2.setForeground(new Color(250, 235, 215));
	btnCompC2.setBackground(new Color(205, 92, 92));
	btnCompC2.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnCompC2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			ComponenteC2 componenteC2 = new ComponenteC2();
			componenteC2.setVisible(true);
			ComponenteC1.this.dispose();
			
		}
		
	});
	
	btnCompC2.setBounds(537, 450, 181, 52);
	btnCompC2.setText("COMPONENTE C");
	contentPane.add(btnCompC2);
	
	//imagen del componente c parte 2
	
	ImageIcon imgComp = new ImageIcon("src/images/componenteC1Imagen.png");
	JLabel lComp = new JLabel();
	lComp.setBackground(new Color(219, 112, 147));
	lComp.setForeground(new Color(250, 240, 230));
	lComp.setBounds(0, 0, 770, 524);
	lComp.setIcon(new ImageIcon(imgComp.getImage().getScaledInstance(lComp.getWidth(), lComp.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lComp);
	}

}
