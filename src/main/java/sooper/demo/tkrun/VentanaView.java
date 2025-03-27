package sooper.demo.tkrun;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class VentanaView {
	
	protected JFrame frmVentana;
	private VentanaController controller2;
	private JTable tablaEmbolsados;
	private JButton btnEnvioAlmacen;
	private DefaultTableModel modeloArticulo;
	
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel;
	
	
	
	
	
	
	 public VentanaView(VentanaController controlador) {
		// TODO Auto-generated constructor stub
		initialize(controlador);
	} 

	 
		private void initialize(VentanaController controlador) {

			frmVentana = new JFrame();
			frmVentana.setBounds(0,0,400,500);
			frmVentana.getContentPane().setLayout(new MigLayout("", "[][grow][][][grow]", "[][grow][][][][][][][][][][][][][][]"));
			
			
			
			
			
			modeloArticulo = new DefaultTableModel(new Object[][] {
			},
			new String[] {
					"idArticulo", "idContenedor"
				}
			);
			
			
			lblNewLabel = new JLabel("Articulos a embolsar");
			frmVentana.getContentPane().add(lblNewLabel, "cell 1 0");
			
			scrollPane = new JScrollPane();
			frmVentana.getContentPane().add(scrollPane, "cell 1 1 4 14,grow");
			
			table = new JTable();
			scrollPane.setViewportView(table);
			table.setModel(modeloArticulo);
			btnNewButton = new JButton("Añadir artículo");
			frmVentana.getContentPane().add(btnNewButton, "cell 1 15");
			
			

			
			
			
			
			
		} 
	
		public JFrame getFrame() {
			return this.frmVentana;
		}
		
		
		
		
		
}
