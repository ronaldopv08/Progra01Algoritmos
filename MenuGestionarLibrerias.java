package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuGestionarLibrerias extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGestionarLibrerias frame = new MenuGestionarLibrerias();
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
	public MenuGestionarLibrerias() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label lblGestionarLibrerias = new Label("Gestionar Librer\u00EDas");
		lblGestionarLibrerias.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblGestionarLibrerias.setAlignment(Label.CENTER);
		lblGestionarLibrerias.setBounds(122, 10, 307, 44);
		contentPane.add(lblGestionarLibrerias);
		
		Button bAñadirLibreria = new Button("A\u00F1adir Librer\u00EDa");
		bAñadirLibreria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearLibreria nF = new CrearLibreria();
				nF.setVisible(true);
			}
		});
		bAñadirLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bAñadirLibreria.setBounds(189, 60, 176, 52);
		contentPane.add(bAñadirLibreria);
		
		Button bModificarLibreria = new Button("Modificar Librer\u00EDa");
		bModificarLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bModificarLibreria.setBounds(189, 118, 176, 52);
		contentPane.add(bModificarLibreria);
		
		Button bEliminarLibreria = new Button("Eliminar Librer\u00EDa");
		bEliminarLibreria.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bEliminarLibreria.setBounds(189, 176, 176, 52);
		contentPane.add(bEliminarLibreria);
		
		Button bConsultarLibrerias = new Button("Consultar Librer\u00EDas");
		bConsultarLibrerias.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bConsultarLibrerias.setBounds(189, 234, 176, 52);
		contentPane.add(bConsultarLibrerias);
		
		Button bRegresarGestionarLibrerias = new Button("Regresar");
		bRegresarGestionarLibrerias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		bRegresarGestionarLibrerias.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		bRegresarGestionarLibrerias.setBounds(189, 292, 176, 52);
		contentPane.add(bRegresarGestionarLibrerias);
	}
}
