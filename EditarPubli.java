package windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditarPubli {

	private static JFrame frame;
	private JTextField txtTtuloDaPublicao;
	private JTextField txtTextoTextoTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarPubli window = new EditarPubli();
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
	public EditarPubli() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDesmistificandoOVeganismo = new JLabel("Desmistificando o Veganismo");
		lblDesmistificandoOVeganismo.setForeground(new Color(50, 205, 50));
		lblDesmistificandoOVeganismo.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
		lblDesmistificandoOVeganismo.setBounds(10, 11, 326, 25);
		frame.getContentPane().add(lblDesmistificandoOVeganismo);
		
		txtTtuloDaPublicao = new JTextField();
		txtTtuloDaPublicao.setText("T\u00EDtulo da Publica\u00E7\u00E3o");
		txtTtuloDaPublicao.setBounds(10, 73, 183, 20);
		frame.getContentPane().add(txtTtuloDaPublicao);
		txtTtuloDaPublicao.setColumns(10);
		
		txtTextoTextoTexto = new JTextField();
		txtTextoTextoTexto.setText("texto texto texto texto texto texto");
		txtTextoTextoTexto.setBounds(10, 115, 326, 103);
		frame.getContentPane().add(txtTextoTextoTexto);
		txtTextoTextoTexto.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnExcluirPublicao = new JButton("Excluir Publica\u00E7\u00E3o");
		btnExcluirPublicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluirPublicao.setBounds(10, 229, 117, 23);
		frame.getContentPane().add(btnExcluirPublicao);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio EditarPubli = new Inicio();
				Inicio.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnVoltar.setBounds(335, 15, 89, 23);
		frame.getContentPane().add(btnVoltar);
	}

	public static void IniciaTela() {
		frame.setVisible(true);
		
	}
}
