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

public class ComponenteC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponenteC frame = new ComponenteC();
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
	public ComponenteC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 553);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Componente C parte 1");
		
		//boton para regresar a la pantalla de componentes parte 2
		JButton btnRComp2 = new JButton("New button");
		btnRComp2.setForeground(new Color(250, 235, 215));
		btnRComp2.setBackground(new Color(205, 92, 92));
		btnRComp2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		
		btnRComp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Componentes2 componentes2 = new Componentes2();
				componentes2.setVisible(true);
				ComponenteC.this.dispose();
				
			}
			
		});
		
		btnRComp2.setBounds(50, 450, 130, 52);
		btnRComp2.setText("REGRESAR");
		contentPane.add(btnRComp2);
	
	//boton para ir a la pantalla del componente C parte 2
	JButton btnCompC1 = new JButton("New button");
	btnCompC1.setForeground(new Color(250, 235, 215));
	btnCompC1.setBackground(new Color(205, 92, 92));
	btnCompC1.setFont(new Font("Century Gothic", Font.BOLD, 18));
	
	btnCompC1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			ComponenteC1 componenteC1 = new ComponenteC1();
			componenteC1.setVisible(true);
			ComponenteC.this.dispose();
			
		}
		
	});
	
	btnCompC1.setBounds(537, 450, 181, 52);
	btnCompC1.setText("COMPONENTE C");
	contentPane.add(btnCompC1);
	
	//imagen del componente c parte 1
	
	ImageIcon imgComp = new ImageIcon("images/componenteCImagen.png");
	JLabel lComp = new JLabel();
	lComp.setBackground(new Color(219, 112, 147));
	lComp.setForeground(new Color(250, 240, 230));
	lComp.setBounds(0, 0, 770, 524);
	lComp.setIcon(new ImageIcon(imgComp.getImage().getScaledInstance(lComp.getWidth(), lComp.getHeight(), Image.SCALE_SMOOTH)));
	contentPane.add(lComp);
	
	}

}
