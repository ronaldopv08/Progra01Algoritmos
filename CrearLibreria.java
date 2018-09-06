package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Checkbox;
import java.awt.TextField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearLibreria extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreLibreria;
	private JTextField txtPaisLibreria;
	private JTextField txtHoraAbre;
	private JTextField txtMinutosAbre;
	private JTextField txtHoraCierra;
	private JTextField txtMinutosCierra;
	private JTextField txtTelefonoLibreria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearLibreria frame = new CrearLibreria();
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
	public CrearLibreria() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label lblAñadirLibreria = new Label("A\u00F1adir Librer\u00EDa");
		lblAñadirLibreria.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblAñadirLibreria.setAlignment(Label.CENTER);
		lblAñadirLibreria.setBounds(253, 10, 248, 59);
		contentPane.add(lblAñadirLibreria);
		
		Label lblNombreLibreria = new Label("Nombre:");
		lblNombreLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNombreLibreria.setBounds(10, 75, 94, 23);
		contentPane.add(lblNombreLibreria);
		
		Label lblPaisLibreria = new Label("Pa\u00EDs:");
		lblPaisLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPaisLibreria.setBounds(10, 117, 77, 23);
		contentPane.add(lblPaisLibreria);
		
		Label lblUbicacionLibreria = new Label("Ubicaci\u00F3n:");
		lblUbicacionLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblUbicacionLibreria.setBounds(10, 156, 94, 23);
		contentPane.add(lblUbicacionLibreria);
		
		Label lblTelefonoLibreria = new Label("Tel\u00E9fono:");
		lblTelefonoLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTelefonoLibreria.setBounds(10, 263, 87, 23);
		contentPane.add(lblTelefonoLibreria);
		
		Label lblHorarioLibreria = new Label("Horario:");
		lblHorarioLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblHorarioLibreria.setBounds(10, 307, 77, 23);
		contentPane.add(lblHorarioLibreria);
		
		Label lblHoraAbre = new Label("Abre:");
		lblHoraAbre.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblHoraAbre.setBounds(109, 344, 50, 23);
		contentPane.add(lblHoraAbre);
		
		Label lblHoraCierra = new Label("Cierra:");
		lblHoraCierra.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblHoraCierra.setBounds(279, 344, 58, 23);
		contentPane.add(lblHoraCierra);
		
		JRadioButtonMenuItem rbLunes = new JRadioButtonMenuItem("Lunes");
		rbLunes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rbLunes.setBounds(111, 307, 77, 22);
		contentPane.add(rbLunes);
		
		JRadioButtonMenuItem rbMartes = new JRadioButtonMenuItem("Martes");
		rbMartes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rbMartes.setBounds(198, 307, 77, 22);
		contentPane.add(rbMartes);
		
		JRadioButtonMenuItem rbMiercoles = new JRadioButtonMenuItem("Mi\u00E9rcoles");
		rbMiercoles.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rbMiercoles.setBounds(285, 307, 94, 22);
		contentPane.add(rbMiercoles);
		
		JRadioButtonMenuItem rbJueves = new JRadioButtonMenuItem("Jueves");
		rbJueves.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rbJueves.setBounds(389, 307, 77, 22);
		contentPane.add(rbJueves);
		
		JRadioButtonMenuItem rbViernes = new JRadioButtonMenuItem("Viernes");
		rbViernes.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rbViernes.setBounds(476, 307, 77, 22);
		contentPane.add(rbViernes);
		
		JRadioButtonMenuItem rbSabado = new JRadioButtonMenuItem("S\u00E1bado");
		rbSabado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rbSabado.setBounds(563, 308, 77, 22);
		contentPane.add(rbSabado);
		
		JRadioButtonMenuItem rbDomingo = new JRadioButtonMenuItem("Domingo");
		rbDomingo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rbDomingo.setBounds(650, 307, 87, 22);
		contentPane.add(rbDomingo);
		
		txtNombreLibreria = new JTextField();
		txtNombreLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtNombreLibreria.setBounds(109, 78, 166, 20);
		contentPane.add(txtNombreLibreria);
		txtNombreLibreria.setColumns(10);
		
		txtPaisLibreria = new JTextField();
		txtPaisLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtPaisLibreria.setColumns(10);
		txtPaisLibreria.setBounds(109, 117, 166, 20);
		contentPane.add(txtPaisLibreria);
		
		JTextArea txtUbicacionLibreria = new JTextArea();
		txtUbicacionLibreria.setBounds(110, 156, 627, 99);
		contentPane.add(txtUbicacionLibreria);
		
		JScrollPane scrollPane = new JScrollPane(txtUbicacionLibreria);
		scrollPane.setEnabled(false);
		scrollPane.setBounds(110, 156, 627, 99);
		contentPane.add(scrollPane);
		
		txtTelefonoLibreria = new JTextField();
		txtTelefonoLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTelefonoLibreria.setColumns(10);
		txtTelefonoLibreria.setBounds(109, 266, 166, 20);
		contentPane.add(txtTelefonoLibreria);
		
		txtHoraAbre = new JTextField();
		txtHoraAbre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtHoraAbre.setColumns(10);
		txtHoraAbre.setBounds(165, 344, 33, 20);
		contentPane.add(txtHoraAbre);
		
		txtMinutosAbre = new JTextField();
		txtMinutosAbre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtMinutosAbre.setColumns(10);
		txtMinutosAbre.setBounds(218, 344, 33, 20);
		contentPane.add(txtMinutosAbre);
		
		txtHoraCierra = new JTextField();
		txtHoraCierra.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtHoraCierra.setColumns(10);
		txtHoraCierra.setBounds(343, 347, 33, 20);
		contentPane.add(txtHoraCierra);
		
		txtMinutosCierra = new JTextField();
		txtMinutosCierra.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtMinutosCierra.setColumns(10);
		txtMinutosCierra.setBounds(399, 347, 33, 20);
		contentPane.add(txtMinutosCierra);
		
		Label lblPuntos = new Label(":");
		lblPuntos.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPuntos.setBounds(201, 344, 11, 23);
		contentPane.add(lblPuntos);
		
		Label lblPuntos2 = new Label(":");
		lblPuntos2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPuntos2.setBounds(382, 347, 11, 23);
		contentPane.add(lblPuntos2);
		
		Button bRegistrar = new Button("Registrar");
		bRegistrar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bRegistrar.setBounds(198, 391, 110, 30);
		contentPane.add(bRegistrar);
		
		Button bRegresar = new Button("Regresar");
		bRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		bRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bRegresar.setBounds(343, 391, 110, 30);
		contentPane.add(bRegresar);
		
	}
}
