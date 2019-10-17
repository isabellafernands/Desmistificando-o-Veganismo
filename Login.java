package windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Login {

	private static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDesmistificandoOVeganismo = new JLabel("Desmistificando o Veganismo");
		lblDesmistificandoOVeganismo.setForeground(new Color(50, 205, 50));
		lblDesmistificandoOVeganismo.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
		lblDesmistificandoOVeganismo.setBounds(60, 4, 326, 31);
		panel_1.add(lblDesmistificandoOVeganismo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 110, 149, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio Login = new Inicio();
				Login.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(175, 192, 86, 20);
		panel_1.add(btnNewButton);
		
		JLabel lblNome = new JLabel("Nome de Usu\u00E1rio:");
		lblNome.setBounds(41, 113, 114, 14);
		panel_1.add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(92, 149, 46, 14);
		panel_1.add(lblSenha);
		
		JLabel lblLoginDeUsurio = new JLabel("Login de Usu\u00E1rio");
		lblLoginDeUsurio.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblLoginDeUsurio.setBounds(161, 53, 125, 31);
		panel_1.add(lblLoginDeUsurio);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 146, 149, 20);
		panel_1.add(passwordField);
	}

	public static void IniciaTela() {
		frame.setVisible(true);
		
	}
}
