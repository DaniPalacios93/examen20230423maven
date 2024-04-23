package examen20230423maven.banco.views;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTextField;

import examen20230423maven.banco.controllers.ControladorTipoContrato;
import examen20230423maven.banco.controllers.ControladorUsuario;
import examen20230423maven.banco.entites.Contrato;
import examen20230423maven.banco.entites.TipoContrato;
import examen20230423maven.banco.entites.Usuario;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaGestionDeContratos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jtfDescipcion;
	private JTextField jtfId;
	private JTextField jtfSaldo;
	private JTextField jtfLimite;
	private JTextField jtfFecha;
	private JComboBox<Usuario> jcbUsuario;
	private JRadioButton rbtnCuentaBancaria;
	private JRadioButton rbtnTarjetaCredito;
	private JRadioButton rbtnTarjetaDebito;
	private JRadioButton rbtnPrestamo;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	

	/**
	 * Create the panel.
	 */
	public VistaGestionDeContratos() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Gestión de contratos");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 17));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id: ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfId = new JTextField();
		jtfId.setEditable(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 2;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblTipoDeContrato = new JLabel("  Tipo de contrato: ");
		GridBagConstraints gbc_lblTipoDeContrato = new GridBagConstraints();
		gbc_lblTipoDeContrato.gridheight = 2;
		gbc_lblTipoDeContrato.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeContrato.gridx = 0;
		gbc_lblTipoDeContrato.gridy = 2;
		add(lblTipoDeContrato, gbc_lblTipoDeContrato);
		
		rbtnCuentaBancaria = new JRadioButton("Cuenta bancaria");
		GridBagConstraints gbc_rbtnCuentaBancaria = new GridBagConstraints();
		gbc_rbtnCuentaBancaria.anchor = GridBagConstraints.WEST;
		gbc_rbtnCuentaBancaria.insets = new Insets(0, 0, 5, 5);
		gbc_rbtnCuentaBancaria.gridx = 1;
		gbc_rbtnCuentaBancaria.gridy = 2;
		add(rbtnCuentaBancaria, gbc_rbtnCuentaBancaria);
		
		rbtnTarjetaCredito = new JRadioButton("Tarjeta de crédito");
		GridBagConstraints gbc_rbtnTarjetaCredito = new GridBagConstraints();
		gbc_rbtnTarjetaCredito.anchor = GridBagConstraints.WEST;
		gbc_rbtnTarjetaCredito.insets = new Insets(0, 0, 5, 0);
		gbc_rbtnTarjetaCredito.gridx = 2;
		gbc_rbtnTarjetaCredito.gridy = 2;
		add(rbtnTarjetaCredito, gbc_rbtnTarjetaCredito);
		
		rbtnTarjetaDebito = new JRadioButton("Tarjeta de débito");
		GridBagConstraints gbc_rbtnTarjetaDebito = new GridBagConstraints();
		gbc_rbtnTarjetaDebito.anchor = GridBagConstraints.WEST;
		gbc_rbtnTarjetaDebito.insets = new Insets(0, 0, 5, 5);
		gbc_rbtnTarjetaDebito.gridx = 1;
		gbc_rbtnTarjetaDebito.gridy = 3;
		add(rbtnTarjetaDebito, gbc_rbtnTarjetaDebito);
		
		rbtnPrestamo = new JRadioButton("Préstamo");
		GridBagConstraints gbc_rbtnPrestamo = new GridBagConstraints();
		gbc_rbtnPrestamo.anchor = GridBagConstraints.WEST;
		gbc_rbtnPrestamo.insets = new Insets(0, 0, 5, 0);
		gbc_rbtnPrestamo.gridx = 2;
		gbc_rbtnPrestamo.gridy = 3;
		add(rbtnPrestamo, gbc_rbtnPrestamo);
		
		
		ButtonGroup tipoContrato = new ButtonGroup();
		tipoContrato.add(rbtnCuentaBancaria);
		tipoContrato.add(rbtnPrestamo);
		tipoContrato.add(rbtnTarjetaCredito);
		tipoContrato.add(rbtnTarjetaDebito);
		
		
		JLabel lblNewLabel_2 = new JLabel("Descripción: ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfDescipcion = new JTextField();
		GridBagConstraints gbc_jtfDescipcion = new GridBagConstraints();
		gbc_jtfDescipcion.gridwidth = 2;
		gbc_jtfDescipcion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDescipcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescipcion.gridx = 1;
		gbc_jtfDescipcion.gridy = 4;
		add(jtfDescipcion, gbc_jtfDescipcion);
		jtfDescipcion.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Usuario: ");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 5;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jcbUsuario = new JComboBox<Usuario>();
		GridBagConstraints gbc_jcbUsuario = new GridBagConstraints();
		gbc_jcbUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_jcbUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbUsuario.gridx = 1;
		gbc_jcbUsuario.gridy = 5;
		add(jcbUsuario, gbc_jcbUsuario);
		
		JButton btnGestionarUsuario = new JButton("Gestionar usuario");
		btnGestionarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirGestionProveedor();
			}
		});
		GridBagConstraints gbc_btnGestionarUsuario = new GridBagConstraints();
		gbc_btnGestionarUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_btnGestionarUsuario.gridx = 2;
		gbc_btnGestionarUsuario.gridy = 5;
		add(btnGestionarUsuario, gbc_btnGestionarUsuario);
		
		JLabel lblNewLabel_4 = new JLabel("Saldo (€): ");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 6;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfSaldo = new JTextField();
		GridBagConstraints gbc_jtfSaldo = new GridBagConstraints();
		gbc_jtfSaldo.gridwidth = 2;
		gbc_jtfSaldo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfSaldo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfSaldo.gridx = 1;
		gbc_jtfSaldo.gridy = 6;
		add(jtfSaldo, gbc_jtfSaldo);
		jtfSaldo.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Limite (€): ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 7;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfLimite = new JTextField();
		GridBagConstraints gbc_jtfLimite = new GridBagConstraints();
		gbc_jtfLimite.gridwidth = 2;
		gbc_jtfLimite.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLimite.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLimite.gridx = 1;
		gbc_jtfLimite.gridy = 7;
		add(jtfLimite, gbc_jtfLimite);
		jtfLimite.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha de firma: ");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 8;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfFecha = new JTextField();
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFecha.gridwidth = 2;
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 1;
		gbc_jtfFecha.gridy = 8;
		add(jtfFecha, gbc_jtfFecha);
		jtfFecha.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actualizarContrato();
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridwidth = 2;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 9;
		add(btnGuardar, gbc_btnGuardar);

		cargaTodosLosUsuarios();
	}

	/**
	 * 
	 */
	private void cargaTodosLosUsuarios() {
		
		List<Usuario> usuarios = (List<Usuario>) ControladorUsuario.getInsctance().findAll();
		
		for(Usuario u : usuarios) {
			jcbUsuario.addItem(u);
		}
	}
	
	
	private void actualizarContrato() {
		
		if(getJtfDescipcion().length() < 4) {
			JOptionPane.showMessageDialog(null, "Error, longitud minima de descripcion de 4 caracteres");
			return;
		}
		if(!isSaldoValido()) {
			JOptionPane.showMessageDialog(null, "Error, el saldo debe ser un numero flotante");
			return;
		}
		if(!isLimiteValido()) {
			JOptionPane.showMessageDialog(null, "Error, el limite debe ser un numero flotante");
			return;
		}
		
		Contrato c = new Contrato();
		
		c.setId(getJtfId());
		c.setDescripcion(getJtfDescipcion());
		c.setSaldo(getJtfSaldo());
		c.setLimite(getJtfLimite());
		c.setFechaFirma(getJtfFecha());
		c.setUsuario(getJcbUsuario());
		c.setTipoContrato(getTipoContrato());
		
		ControladorTipoContrato.getInsctance().save(c);
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	private boolean isSaldoValido() {
		
		try {
			Float.parseFloat(jtfSaldo.getText());
		}catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @return
	 */
	private boolean isLimiteValido() {
		
		try {
			Float.parseFloat(jtfLimite.getText());
		}catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * 
	 */
	public void abrirGestionProveedor() {
		JDialog dialogo = new JDialog();
		// El usuario no puede redimensionar el di�logo
		dialogo.setResizable(true);
		// t�tulo del d�alogo
		dialogo.setTitle("Gestión de empresas");
		// Introducimos el panel creado sobre el di�logo
		dialogo.setContentPane(new VistaGestionDeUsuario((Usuario)jcbUsuario.getSelectedItem()));
		// Empaquetar el di�logo hace que todos los componentes ocupen el espacio que deben y el lugar adecuado
		dialogo.pack();
		// El usuario no puede hacer clic sobre la ventana padre, si el Di�logo es modal
		dialogo.setModal(true);
		// Centro el di�logo en pantalla
		dialogo.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - dialogo.getWidth()/2, 
				(Toolkit.getDefaultToolkit().getScreenSize().height)/2 - dialogo.getHeight()/2);
		// Muestro el di�logo en pantalla
		dialogo.setVisible(true);
	}
	
	
	
	
	// GETTERS & SETTERS


	public int getJtfId() {
		return Integer.parseInt(this.jtfId.getText());
	}

	public void setJtfId(int id) {
		this.jtfId.setText("" + id);
	}

	public String getJtfDescipcion() {
		return this.jtfDescipcion.getText();
	}

	public void setJtfDescipcion(String descipcion) {
		this.jtfDescipcion.setText(descipcion);
	}

	public float getJtfSaldo() {
		return Float.parseFloat(this.jtfSaldo.getText());
	}

	public void setJtfSaldo(float saldo) {
		this.jtfSaldo.setText("" + saldo);
	}

	public float getJtfLimite() {
		return Float.parseFloat(this.jtfLimite.getText());
	}

	public void setJtfLimite(float limite) {
		this.jtfLimite.setText("" + limite);
	}

	public Date getJtfFecha() {
		Date fecha = null;
		try {
			return sdf.parse(this.jtfFecha.getText());
		}catch (Exception e) {
			e.printStackTrace();
		}
		return fecha;
	}

	public void setJtfFecha(Date fecha) {
		this.jtfFecha.setText(sdf.format(fecha));
	}

	
	public Usuario getJcbUsuario() {
		return (Usuario) jcbUsuario.getSelectedItem();
	}


	public void setJcbUsuario(int idUsuario) {
		this.jcbUsuario.setSelectedItem(ControladorUsuario.getInsctance().find(idUsuario));
	}


	public void setTipoContrato (int tipoContrato) {
		
		switch (tipoContrato) {
		case 1:
			rbtnCuentaBancaria.setSelected(true);
			break;
		case 2:
			rbtnTarjetaDebito.setSelected(true);
			break;
		case 3:
			rbtnTarjetaCredito.setSelected(true);
			break;
		case 4:
			rbtnPrestamo.setSelected(true);
			break;
		}
	}
	
	public TipoContrato getTipoContrato () {
		
		if(rbtnCuentaBancaria.isSelected()) return (TipoContrato) ControladorTipoContrato.getInsctance().find(1);
		else if(rbtnTarjetaDebito.isSelected()) return (TipoContrato) ControladorTipoContrato.getInsctance().find(2);
		else if(rbtnTarjetaCredito.isSelected()) return (TipoContrato) ControladorTipoContrato.getInsctance().find(3);
		else if(rbtnPrestamo.isSelected()) return (TipoContrato) ControladorTipoContrato.getInsctance().find(4);
		else return null;
	}

	
	
	
	
	
	
	
	
	
	
}
