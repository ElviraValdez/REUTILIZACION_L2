package py.edu.facitec.reutilizacion.Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import py.edu.facitec.reutilizacion.toolbar.MiToolbar;

public abstract class VentanaGenerica extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTextField tBuscador;
	private MiToolbar miToolbar;
	private JPanel panelFormulario;

	/**
	 * Create the dialog.
	 */
	public VentanaGenerica() {
		setTitle( getTitulo() );
		//define el tamaño de la ventana
		setBounds(100, 100, 850, 600);
		//centrar la ventana
		setLocationRelativeTo(this);
		//Evita que la ventana pierda el foco
		setModal(true);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panelFormulario = new JPanel();
		panelFormulario.setBackground(Color.WHITE);
		panelFormulario.setBorder(new TitledBorder(null, getTituloFormulario(), TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFormulario.setBounds(12, 12, 416, 419);
		contentPanel.add(panelFormulario);
		panelFormulario.setLayout(null);
		
		miToolbar = new MiToolbar();
		miToolbar.setBounds(12, 456, 618, 84);
		contentPanel.add(miToolbar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(440, 13, 398, 370);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setBounds(446, 404, 60, 17);
		contentPanel.add(lblBuscar);
		
		tBuscador = new JTextField();
		tBuscador.setBounds(490, 394, 348, 37);
		contentPanel.add(tBuscador);
		tBuscador.setColumns(10);
	}
	
	//metodos abstractos para definir titulos
	protected abstract String getTitulo();
	protected abstract String getTituloFormulario();

	public JTable getTable() {
		return table;
	}

	public JTextField gettBuscador() {
		return tBuscador;
	}

	public MiToolbar getMiToolbar() {
		return miToolbar;
	}

	public JPanel getPanelFormulario() {
		return panelFormulario;
	}
}
