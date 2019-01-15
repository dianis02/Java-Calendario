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




public class FiestasVarias extends JFrame  {
	
 private JComboBox imagenesJComboBox;
 private JLabel etiqueta; 
 private JLabel etiqueta2;
 private JLabel etiqueta3;



 //Festividades
 Mes month= new Mes();
 
 //Array de las festividades
 ArrayList<Holiday> holidays= new ArrayList<Holiday>();
 //Arrays datos festividades
 String[] dias;
 String[] efemerides;
 Icon[] iconos;
 
 
 
 /**
  * Constructor por omision
  */
 public FiestasVarias(ArrayList<Holiday> h){
 	super( "FiestasVarias" );
 	holidays=h;
 	dias= month.getfechas(holidays);
	efemerides= month.getefemeride(holidays);
	iconos= month.getimagenes(holidays);
 	
 	setLayout( new FlowLayout() ); 

	//se crea el combobox con los días feriados
 	imagenesJComboBox = new JComboBox( dias );
 	//muestra el numero de filas
 	imagenesJComboBox.setMaximumRowCount(holidays.size()+1); 

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
   //etiqueta2=new JLabel(mes);
  etiqueta = new JLabel( iconos[0]); 
  etiqueta3= new JLabel(efemerides[0]);
  //agregamos elementos 
   //getContentPane().add(etiqueta2);
   getContentPane().add( imagenesJComboBox );
   getContentPane().add( etiqueta ); 
   getContentPane().add(etiqueta3);
  
  
 }



} 
