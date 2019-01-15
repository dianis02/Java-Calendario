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




public class Septiembre extends JFrame  {
	
 private JComboBox imagenesJComboBox;
 private JLabel etiqueta; 
 private JLabel etiqueta2;
 private JLabel etiqueta3;
  private Icon mes= new ImageIcon(getClass().getResource("calendario/septiembre.jpg"));
 
 //Festividades

Holiday septiembre13 =new Holiday(13, 9,"imagenes/13septiembre.jpg","Día del Programador");
	Holiday septiembre16 =new Holiday(16, 9,"imagenes/16septiembre.jpeg","Independencia de México");
 Mes month= new Mes();
 
 //Array de las festividades
 ArrayList<Holiday> holidays= new ArrayList<Holiday>(Arrays.asList(septiembre13,septiembre16));
 //Arrays datos festividades
 String[] dias= month.getfechas(holidays);
 String[] efemerides= month.getefemeride(holidays);
 Icon[] iconos= month.getimagenes(holidays);
 
 
 /**
  * Constructor por omision
  */
 public Septiembre(){
 	super( "Septiembre" );
 	setLayout( new FlowLayout() ); 

	//se crea el combobox con los días feriados
 	imagenesJComboBox = new JComboBox( dias );
 	//muestra el numero de filas
 	imagenesJComboBox.setMaximumRowCount(3); 

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

	 
	 
	 
	 
 


