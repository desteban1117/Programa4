package ps.udea.edu.co;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Simpson simpson;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("Programa 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(157, 48, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 100, 114, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setBounds(117, 49, 22, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dof");
		lblNewLabel_1.setBounds(121, 101, 30, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setForeground(Color.RED);
		lblResultado.setBounds(131, 202, 179, 59);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("") || textField_1.getText().equals("")){
					lblResultado.setText("Se deben llenar todos los campos");
				}else{
					double x;
					double dof;
					double resultado;
					simpson = new Simpson();
					x = Double.parseDouble(textField.getText());
					dof = Double.parseDouble(textField_1.getText());
					resultado = simpson.simpsonFunction(10, dof, x);
					//String resulString = String.valueOf(resultado);
					lblResultado.setText("Resultado: "+ String.valueOf(resultado));
				}
			}
		});
		btnNewButton.setBounds(157, 150, 117, 25);
		contentPane.add(btnNewButton);
		
		
	}
}
