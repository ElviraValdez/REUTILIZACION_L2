package py.edu.facitec.reutilizacion.Ventanas;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import py.edu.facitec.reutilizacion.toolbar.MiToolbar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

public  abstract class  MiVentanaGenerica extends JDialog {

	private static final long serialVersionUID = 1L;
	protected JTable table;
	private MiToolbar miToolbar;
	private JPanel panelFormulario;
	private JTextField tBuscador;

	/**
	 * Create the dialog.
	 */
	public MiVentanaGenerica() {
		setTitle(getTitulo());
		
		setBounds(100, 100, 818, 777);
		
		setLocationRelativeTo(this);
		
		setModal(true);
		getContentPane().setLayout(null);
		
		panelFormulario = new JPanel();
		panelFormulario.setBackground(Color.WHITE);
		panelFormulario.setBorder(new TitledBorder(null,getTituloFormulario(), TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelFormulario.setBounds(10, 10, 784, 224);
		getContentPane().add(panelFormulario);
		panelFormulario.setLayout(null);
		
		miToolbar = new MiToolbar();
		miToolbar.setBounds(10, 244, 784, 82);
		getContentPane().add(miToolbar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 385, 784, 345);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nombre", "Apellido", "Fecha de Nacimiento"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Buscar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 347, 58, 28);
		getContentPane().add(lblNewLabel);
		
		tBuscador = new JTextField();
		tBuscador.setBounds(55, 349, 441, 28);
		getContentPane().add(tBuscador);
		tBuscador.setColumns(10);
		
		

	}
	
	protected abstract String getTitulo() ;
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

