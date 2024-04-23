package examen20230423maven.banco.views;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import examen20230423maven.banco.controllers.ControladorUsuario;
import examen20230423maven.banco.entites.Usuario;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaGestionDeUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private Usuario usuario;
	private JTextField jtfId;
	private JTextField jtfUsuario;
	private JPasswordField jpfContrasenia;
	private JTextField jtfEmail;
	private JComboBox<String> jcbColorPreferido;
	

	/**
	 * Create the panel.
	 */
	public VistaGestionDeUsuario(Usuario usuario) {
		
		this.usuario = usuario;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Gestion de usuario");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
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
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario: ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfUsuario = new JTextField();
		GridBagConstraints gbc_jtfUsuario = new GridBagConstraints();
		gbc_jtfUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtfUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfUsuario.gridx = 1;
		gbc_jtfUsuario.gridy = 2;
		add(jtfUsuario, gbc_jtfUsuario);
		jtfUsuario.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña: ");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jpfContrasenia = new JPasswordField();
		GridBagConstraints gbc_jpfContrasenia = new GridBagConstraints();
		gbc_jpfContrasenia.insets = new Insets(0, 0, 5, 0);
		gbc_jpfContrasenia.fill = GridBagConstraints.HORIZONTAL;
		gbc_jpfContrasenia.gridx = 1;
		gbc_jpfContrasenia.gridy = 3;
		add(jpfContrasenia, gbc_jpfContrasenia);
		
		JLabel lblNewLabel_4 = new JLabel("Email: ");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 4;
		add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("  Color preferido: ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jcbColorPreferido = new JComboBox<String>();
		GridBagConstraints gbc_jcbColorPreferido = new GridBagConstraints();
		gbc_jcbColorPreferido.insets = new Insets(0, 0, 5, 0);
		gbc_jcbColorPreferido.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbColorPreferido.gridx = 1;
		gbc_jcbColorPreferido.gridy = 5;
		add(jcbColorPreferido, gbc_jcbColorPreferido);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 6;
		add(btnGuardar, gbc_btnGuardar);
		
		cargarColores();
		mostrarInfo();

	}
	
	/**
	 * 
	 */
	private void cargarColores() {
		
		jcbColorPreferido.addItem("#FF00FF");
		jcbColorPreferido.addItem("#9890A5");
		jcbColorPreferido.addItem("#765456");
		jcbColorPreferido.addItem("#879876");
		
	}
	
	
	private void mostrarInfo() {
		
		jtfId.setText("" + usuario.getId());
		jtfUsuario.setText(usuario.getNombreUsuario());
		jtfEmail.setText(usuario.getEmail());
		jpfContrasenia.setText(usuario.getPassword());
		jcbColorPreferido.setSelectedItem(usuario.getColorPreferido());
		
	}
	
	
	
	private void guardar() {
		
		if(jtfUsuario.getText().trim().equals("")){
			JOptionPane.showMessageDialog(null, "Usuario necesario");
			return;
		}
		if(jpfContrasenia.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Contraseña necesaria");
			return;
		}
		
		
		Usuario u = new Usuario();
		
		u.setId(Integer.parseInt(jtfId.getText()));
		u.setNombreUsuario(jtfUsuario.getText());
		u.setPassword(jpfContrasenia.getText());
		u.setEmail(jtfEmail.getText());
		u.setColorPreferido((String) jcbColorPreferido.getSelectedItem());
		
		ControladorUsuario.getInsctance().save(u);
		
	}
	

}
