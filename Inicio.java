package windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblDesmistificnandoOVeganismo = new JLabel("Desmistificnando o Veganismo");
		lblDesmistificnandoOVeganismo.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
		lblDesmistificnandoOVeganismo.setForeground(new Color(50, 205, 50));
		
		JButton btnIrParaLogin = new JButton("Ir para Login");
		btnIrParaLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login Inicio = new Login();
				Login.IniciaTela();
				frame.setVisible(false);
			}
		});
		
		JLabel lblTtuloDaMatria = new JLabel("T\u00EDtulo da Publica\u00E7\u00E3o");
		lblTtuloDaMatria.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JLabel lblTextoTextoTexto = new JLabel("texto texto texto texto texto texto texto texto texto texto texto");
		
		JButton btnComentar = new JButton("Comentar");
		btnComentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Comentar Inicio = new Comentar();
				Comentar.IniciaTela();
				frame.setVisible(false);
			
			}
		});
		
		JButton btnEditarPublicao = new JButton("Editar Publica\u00E7\u00E3o");
		btnEditarPublicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditarPubli Inicio = new EditarPubli();
				EditarPubli.IniciaTela();
				frame.setVisible(false);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTtuloDaMatria, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTextoTextoTexto, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDesmistificnandoOVeganismo)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(btnEditarPublicao)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnIrParaLogin)
						.addComponent(btnComentar))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblDesmistificnandoOVeganismo)
							.addGap(32)
							.addComponent(lblTtuloDaMatria)
							.addGap(18)
							.addComponent(lblTextoTextoTexto, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnComentar)
								.addComponent(btnEditarPublicao))
							.addContainerGap())
						.addComponent(btnIrParaLogin)))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	public static void IniciaTela() {
		frame.setVisible(true);
		
	}

}
