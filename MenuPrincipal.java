package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVirtualLibraryTec = new JLabel("Virtual Library TEC");
		lblVirtualLibraryTec.setBounds(5, 5, 524, 27);
		lblVirtualLibraryTec.setHorizontalAlignment(SwingConstants.CENTER);
		lblVirtualLibraryTec.setFont(new Font("Times New Roman", Font.BOLD, 30));
		contentPane.add(lblVirtualLibraryTec);
		
		Button GestionarLibrerias = new Button("Gestionar Librer\u00EDas");
		GestionarLibrerias.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GestionarLibrerias.setBounds(171, 57, 190, 56);
		GestionarLibrerias.setActionCommand("Gestionar Librer\u00EDas");
		contentPane.add(GestionarLibrerias);
		
		Button GestionarLibros = new Button("Gestionar Libros");
		GestionarLibros.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GestionarLibros.setBounds(171, 119, 190, 56);
		contentPane.add(GestionarLibros);
		
		Button BuscarLibros = new Button("Buscar Libros");
		BuscarLibros.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		BuscarLibros.setBounds(171, 181, 190, 56);
		contentPane.add(BuscarLibros);
		
		Button SolicitarLibros = new Button("Solicitar Libros");
		SolicitarLibros.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		SolicitarLibros.setBounds(171, 243, 190, 56);
		contentPane.add(SolicitarLibros);
		
		Button AtencionPedidos = new Button("Atenci\u00F3n de Pedidos");
		AtencionPedidos.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		AtencionPedidos.setBounds(171, 305, 190, 56);
		contentPane.add(AtencionPedidos);
		
		Button Salir = new Button("Salir");
		Salir.setForeground(Color.RED);
		Salir.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Salir.setActionCommand("Salir");
		Salir.setBounds(171, 367, 190, 56);
		contentPane.add(Salir);
	}
}
