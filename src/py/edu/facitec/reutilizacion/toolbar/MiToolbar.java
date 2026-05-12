package py.edu.facitec.reutilizacion.toolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JToolBar;
import py.edu.facitec.reutilizacion.botones.MiBoton;
import py.edu.facitec.reutilizacion.interfaces.AccionesABM;

public class MiToolbar extends JToolBar{
	private MiBoton mbtnNuevo;
	private MiBoton mbtnModificar;
	private MiBoton mbtnEliminar;
	private MiBoton mbtnGuardar;
	private MiBoton mbtnCancelar;
	private MiBoton mbtnSalir;
	
	private AccionesABM acciones;
	
	public void setAcciones(AccionesABM acciones) {
		this.acciones = acciones;
	}
	
	public MiToolbar() {
		setFloatable(false);
		
		mbtnNuevo = new MiBoton();
		mbtnNuevo.setText("Nuevo");
		add(mbtnNuevo);
		
		mbtnModificar = new MiBoton();
		mbtnModificar.setText("Modificar");
		add(mbtnModificar);
		
		mbtnEliminar = new MiBoton();
		mbtnEliminar.setText("Eliminar");
		add(mbtnEliminar);
		
		mbtnGuardar = new MiBoton();
		mbtnGuardar.setText("Guardar");
		add(mbtnGuardar);
		
		mbtnCancelar = new MiBoton();
		mbtnCancelar.setText("Cancelar");
		add(mbtnCancelar);
		
		mbtnSalir = new MiBoton();
		mbtnSalir.setText("Salir");
		add(mbtnSalir);
		
		//llamar al metodo setUpEvents
		setUpEvents();
	}
	
	private void setUpEvents() {
		mbtnNuevo.addActionListener(e -> acciones.nuevo());
		mbtnModificar.addActionListener(e -> acciones.modificar());
		mbtnEliminar.addActionListener(e -> acciones.eliminar());
		mbtnGuardar.addActionListener(e -> acciones.guardar());
		mbtnCancelar.addActionListener(e -> acciones.cancelar());
		mbtnSalir.addActionListener(e -> acciones.salir());
	}

}
