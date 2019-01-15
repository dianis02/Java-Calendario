import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;



public class Febrero extends JFrame  {
	
private JComboBox imagenesJComboBox;
 private JLabel etiqueta; 
 private JLabel etiqueta2;
 private JLabel etiqueta3;
 private Icon mes= new ImageIcon(getClass().getResource("calendario/febrero.jpg"));
 
 //Festividades
	Holiday febrero5 =new Holiday(5, 2,"imagenes/5febrero.jpg","Día de la Constitución Mexicana");
	Holiday febrero14 =new Holiday(14, 2,"imagenes/14febrero.jpg","Día de San Valentin");
	Holiday febrero24 =new Holiday(24, 2,"imagenes/24febrero.jpeg","Día de la Bandera");
 Mes febrero= new Mes();
 
 //Array de las festividades
 ArrayList<Holiday> holidays= new ArrayList<Holiday>(Arrays.asList(febrero5,febrero14,febrero24));
 //Arrays datos festividades
 String[] dias= febrero.getfechas(holidays);
 String[] efemerides= febrero.getefemeride(holidays);
 Icon[] iconos= febrero.getimagenes(holidays);
 
 
 /**
  * Constructor por omision
  */
 public Febrero(){
 	super( "Febrero" );
 	setLayout( new FlowLayout() ); 

	//se crea el combobox con los días feriados
 	imagenesJComboBox = new JComboBox( dias );
 	//muestra el numero de filas
 	imagenesJComboBox.setMaximumRowCount( 4); 

 	imagenesJComboBox.addItemListener(
 	new ItemListener() {
 	// Evento Combobox
	public void itemStateChanged( ItemEvent evento) {
		
 	// Verifica si esta seleccionada
 	if ( evento.getStateChange() == ItemEvent.SELECTED )
  		etiqueta.setIcon( iconos[
  		imagenesJComboBox.getSelectedIndex() ] );
  		etiqueta3.setText(efemerides[imagenesJComboBox.getSelectedIndex()]);
  		
  	} 
 	} 
  ); 

   // Creamos etiquetas
  etiqueta2=new JLabel(mes);
  etiqueta = new JLabel( iconos[0]); 
  etiqueta3= new JLabel(efemerides[0]);
  //agregamos elementos 
   getContentPane().add(etiqueta2);
   getContentPane().add( imagenesJComboBox );
   getContentPane().add( etiqueta ); 
   getContentPane().add(etiqueta3);
  
  
 }



} 
