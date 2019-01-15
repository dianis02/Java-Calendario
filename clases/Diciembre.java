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




public class Diciembre extends JFrame  {
	
 private JComboBox imagenesJComboBox;
 private JLabel etiqueta; 
 private JLabel etiqueta2;
 private JLabel etiqueta3;
  private Icon mes= new ImageIcon(getClass().getResource("calendario/diciembre.jpg"));
 
 
 //Festividades
	Holiday diciembre1 =new Holiday(1, 12,"imagenes/1diciembre.jpg","Transmision del Poder Ejecutivo Federal");
	Holiday diciembre12 =new Holiday(12, 12,"imagenes/12diciembre.jpg","Día de la Virgen de Guadalupe");
	Holiday diciembre24 =new Holiday(24, 12,"imagenes/24diciembre.jpg","Noche Buena");
	Holiday diciembre25 =new Holiday(25, 12,"imagenes/25diciembre.jpg","Navidad");
 Mes month= new Mes();
 
 //Array de las festividades
 ArrayList<Holiday> holidays= new ArrayList<Holiday>(Arrays.asList(diciembre1,diciembre12,diciembre24,diciembre25));
 //Arrays datos festividades
 String[] dias= month.getfechas(holidays);
 String[] efemerides= month.getefemeride(holidays);
 Icon[] iconos= month.getimagenes(holidays);
 
 
 /**
  * Constructor por omision
  */
 public Diciembre(){
 	super( "Diciembre" );
 	setLayout( new FlowLayout() ); 

	//se crea el combobox con los días feriados
 	imagenesJComboBox = new JComboBox( dias );
 	//muestra el numero de filas
 	imagenesJComboBox.setMaximumRowCount(5); 

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

	 
	 
	 
	 
 
