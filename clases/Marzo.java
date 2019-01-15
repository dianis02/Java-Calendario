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



public class Marzo extends JFrame  {
	
 private JComboBox imagenesJComboBox;
 private JLabel etiqueta; 
 private JLabel etiqueta2;
 private JLabel etiqueta3;
 private Icon mes= new ImageIcon(getClass().getResource("calendario/marzo.jpg"));
 
 //Festividades
 Holiday marzo19 =new Holiday(19, 3, "imagenes/19marzo.jpg","Natalicio de Benito Juarez");
 Holiday marzo29 =new Holiday(29, 3,"imagenes/29marzo.jpg","	Jueves Santo");
 Holiday marzo30 =new Holiday(30, 3,"imagenes/30marzo.jpg","Viernes Santo");
 Mes marzo= new Mes();
 
 //Array de las festividades
 ArrayList<Holiday> holidays= new ArrayList<Holiday>(Arrays.asList(marzo19,marzo29,marzo30));
 //Arrays datos festividades
 String[] dias= marzo.getfechas(holidays);
 String[] efemerides= marzo.getefemeride(holidays);
 Icon[] iconos= marzo.getimagenes(holidays);
 
 
 /**
  * Constructor por omision
  */
 public Marzo(){
 	super( "Marzo" );
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

	 
	 
	 
	 
 

