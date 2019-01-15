
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
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Listholidays extends JFrame implements ActionListener  {
	
	//Lista dias Feriados
	Holiday enero1 = new Holiday(1,1,"imagenes/1enero.jpg","Año Nuevo");
	Holiday enero6 =new Holiday(6, 1,"imagenes/6enero.jpg","Día de Reyes");
	Holiday febrero5 =new Holiday(5, 2,"imagenes/5febrero.jpg","Día de la Constitución Mexicana");
	Holiday febrero14 =new Holiday(14, 2,"imagenes/14febrero.jpg","Día de San Valentin");
	Holiday febrero24 =new Holiday(24, 2,"imagenes/24febrero.jpeg","Día de la Bandera");
	Holiday marzo19 =new Holiday(19, 3,"imagenes/19marzo.jpg","Natalicio de Benito Juarez");
	Holiday marzo29 =new Holiday(29, 3,"imagenes/29marzo.jpg","	Jueves Santo");
	Holiday marzo30 =new Holiday(30, 3,"imagenes/30marzo.jpg","Viernes Santo");
	Holiday abril1 =new Holiday(1, 4,"imagenes/1abril.jpg","Domingo de Resurrección");
	Holiday abril30 =new Holiday(30, 4,"imagenes/30abril.jpg","Día del Niño");
	Holiday mayo1=new Holiday(1,5,"imagenes/1mayo.jpeg","Día del Trabajo");
	Holiday mayo5=new Holiday(5,5,"imagenes/5mayo.jpeg","Batalla de Puebla");
	Holiday mayo10=new Holiday(10,5,"imagenes/10mayo.jpg","Día de las Madres");
	Holiday junio17 =new Holiday(17, 6,"imagenes/17junio.jpg","Día del Padre");
	Holiday junio28 =new Holiday(28, 6,"imagenes/28junio.jpg","Día Internacional del Orgullo Gay (LGBT)");
	Holiday julio14 =new Holiday(14, 7,"imagenes/14julio.jpeg","Toma de la Bastilla");
	Holiday agosto12 =new Holiday(12, 8,"imagenes/12agosto.jpg","Día Internacional de la Juventud");
	Holiday septiembre13 =new Holiday(13, 9,"imagenes/13septiembre.jpg","Día del Programador");
	Holiday septiembre16 =new Holiday(16, 9,"imagenes/16septiembre.jpeg","Independencia de México");
	Holiday octubre2 =new Holiday(2, 10,"imagenes/2octubre.jpg","Cumpleaños Diana ");
	Holiday octubre31 =new Holiday(31, 10,"imagenes/31octubre.jpg","Halloween");
	Holiday noviembre2 =new Holiday(2, 11,"imagenes/2noviembre.jpg","Día de Muertos");
	Holiday noviembre20 =new Holiday(20, 11,"imagenes/20noviembre.jpg","Revolución Mexicana");
	Holiday diciembre1 =new Holiday(1, 12,"imagenes/1diciembre.jpg","Transmision del Poder Ejecutivo Federal");
	Holiday diciembre12 =new Holiday(12, 12,"imagenes/12diciembre.jpg","Día de la Virgen de Guadalupe");
	Holiday diciembre24 =new Holiday(24, 12,"imagenes/24diciembre.jpg","Noche Buena");
	Holiday diciembre25 =new Holiday(25, 12,"imagenes/25diciembre.jpg","Navidad");
	
	//Array con todas las festividades
	ArrayList<Holiday> holidays= new ArrayList<Holiday>(Arrays.asList(enero1,enero6,febrero5,febrero14,febrero24,marzo19,
		marzo29,marzo30,abril1,abril30,junio17,junio28,julio14,agosto12,septiembre13,septiembre16,
		octubre2,octubre31,noviembre2,noviembre20,diciembre1,diciembre12,diciembre24,diciembre25));

	
	private JComboBox diaInicio;
	private JComboBox mesInicio;
	private JComboBox diaFinal;
	private JComboBox mesFinal;
	private JButton holiday;
	private JLabel etiqueta1= new JLabel();
	private JLabel etiqueta2= new JLabel();
	private JLabel etiqueta3= new JLabel();
	private int dayStart;
	private int dayEnd;
	private int monthStart;
	private int monthEnd;
	
	
	
	String [] meses= {"mes(1-12)","1","2","3","4","5","6","7","8","9","10","11","12"};
	String [] dias30={"día(1-30)","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	String [] dias28={"día(1-28)","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};
	String [] dias31={"día(1-31)","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	
	
		
	
	public Listholidays(){
		super( "Festividades 2018" );
		setLayout( new FlowLayout() ); 
		
	 etiqueta2.setText("Día de Inicio");
	 etiqueta3.setText("Dia  de Fin ");
	//se crea el combobox con los días feriados
	mesInicio= new JComboBox( meses );
 	//muestra el numero de filas
 	mesInicio.setMaximumRowCount(5); 
 	
 	
 	//se crea el combobox con los días feriados
	mesFinal= new JComboBox( meses );
 	//muestra el numero de filas
 	mesFinal.setMaximumRowCount(5);
 	
 	diaInicio= new JComboBox( dias30 );
 	//muestra el numero de filas
 	diaInicio.setMaximumRowCount(5);
 	
 	diaFinal= new JComboBox( dias30 );
 	//muestra el numero de filas
 	diaFinal.setMaximumRowCount(5);
 	
 	 holiday= new JButton("Aceptar");
 	//------------------------primer combobox Mes Inicio--------------------------
 	mesInicio.addItemListener(
 	new ItemListener() {
 	// Evento Combobox
	public void itemStateChanged( ItemEvent evento) {
		
 	// Condicional elemento seleccionado
 	if ( evento.getStateChange() == ItemEvent.SELECTED )
 	
 	//modifica el tamaño del comboBox dia dependiendo del mes
		if(mesInicio.getSelectedIndex()==2){
				diaInicio.removeAllItems();
                diaInicio.setModel(new DefaultComboBoxModel(dias28));
			}else if(mesInicio.getSelectedIndex()==1 || mesInicio.getSelectedIndex()==3|| mesInicio.getSelectedIndex()==5 || mesInicio.getSelectedIndex()==7 || mesInicio.getSelectedIndex()==8 || mesInicio.getSelectedIndex()==10 || mesInicio.getSelectedIndex()==12){
				diaInicio.removeAllItems();
                diaInicio.setModel(new DefaultComboBoxModel(dias31));
                
               }else if(mesInicio.getSelectedIndex()==4 || mesInicio.getSelectedIndex()==6 || mesInicio.getSelectedIndex()==9 || mesInicio.getSelectedIndex()==11){
                diaInicio.removeAllItems();
				diaInicio.setModel(new DefaultComboBoxModel(dias30));
                
                
			
					
		}
		
  	} 
 	} 
  );
  
  
 
  
  //------------------------segundo combobox MesFinal-------------------------
  
  
    mesFinal.addItemListener(
 	new ItemListener() {
		
	public void itemStateChanged( ItemEvent evento) {
		
 	// Condicional elemento seleccionado
 	if ( evento.getStateChange() == ItemEvent.SELECTED )
		
		//modifica el tamaño del comboBox dia dependiendo del mes
		if(mesFinal.getSelectedIndex()==2){
				diaFinal.removeAllItems();
                diaFinal.setModel(new DefaultComboBoxModel(dias28));
			}else if(mesFinal.getSelectedIndex()==1 || mesFinal.getSelectedIndex()==3|| mesFinal.getSelectedIndex()==5 || mesFinal.getSelectedIndex()==7 || mesFinal.getSelectedIndex()==8 || mesFinal.getSelectedIndex()==10 || mesFinal.getSelectedIndex()==12){
				diaFinal.removeAllItems();
                diaFinal.setModel(new DefaultComboBoxModel(dias31));
                
               }else if(mesFinal.getSelectedIndex()==4 || mesFinal.getSelectedIndex()==6 || mesFinal.getSelectedIndex()==9 || mesFinal.getSelectedIndex()==11){
                diaFinal.removeAllItems();
				diaFinal.setModel(new DefaultComboBoxModel(dias30));
                
                
			
					
		}
		
  	} 
 	} 
  );
 	
 
 
 //------------------------------------------------------------------	
	//agrega los elementos al frame
	getContentPane().add(etiqueta2);
	
	
	getContentPane().add(mesInicio);
   getContentPane().add( diaInicio );
   getContentPane().add(etiqueta3);
	  
   getContentPane().add(mesFinal);
   getContentPane().add( diaFinal );
   getContentPane().add( holiday );
   holiday.addActionListener(this);
		
	}
	
	
	
	
	/**
	 * Metodo que transforma la fecha(mes, dia) en el dia del anio
	 * @param int diaMes, int mes
	 * @return int diaGlobal
	 */
	public int transformar(int diaMes, int mes){
	int	diaGlobal=0;
	if(mes==1){
			diaGlobal=diaMes;
			
		}else if(mes==2){
			diaGlobal=31+diaMes;
		
		}else if(mes==3){
			diaGlobal=59+diaMes;
			
		}else if(mes==4){
			diaGlobal=90+diaMes;
			
		}else if(mes==5){
			diaGlobal=120+diaMes;
			
		}else if(mes==6){
			diaGlobal=151+diaMes;
			
		}else if(mes==7){
			diaGlobal=181+diaMes;
			
		}else if(mes==8){
			diaGlobal=212+diaMes;
			
		}else if(mes==9){
			diaGlobal=243+diaMes;
			
		}else if(mes==10){
			diaGlobal=273+diaMes;
			
		}else if(mes==11){
			diaGlobal=304+diaMes;
			
		}else if(mes==12){
			diaGlobal=334+diaMes;
		}
		return diaGlobal;
	}
	
	
	
	
	/**
	 * Metodo que devuelve un arrayList con las festividades en el rango 
	 * ingresado. Aquí se hace uso del atributo diaGlobal para comprobar 
	 * si esta en el rango
	 * @param int dia1, int mes1, int dia2, int mes2
	 * @return ArrayList<Holiday> intervalo
	 */
	public ArrayList<Holiday> getHolidays(int dia1, int mes1, int dia2, int mes2){
		int start=transformar(dia1,mes1);
		int end=transformar(dia2,mes2);	
		ArrayList<Holiday> intervalo= new ArrayList<Holiday>();
		int i=0;
		int diaFiesta=0;
		while(i<holidays.size()){
			diaFiesta=holidays.get(i).getdiaGlobal();
			if(diaFiesta>=start && diaFiesta<=end){
				intervalo.add(holidays.get(i));
			}
			
		i+=1;
			
		}
		
		return intervalo;
		
		
	}
	
	
	
	/**
	 * Metodo que realiza la accion del evento
	 * sucedido(sleccion del boton aceptar)
	 * Despliega un nuevo panel para visualizar las
	 * festividades en el rango solicitado
	 */
	 public void actionPerformed(ActionEvent evt){
		monthStart=mesInicio.getSelectedIndex();
		dayStart=diaInicio.getSelectedIndex();
		dayEnd=diaFinal.getSelectedIndex();
		monthEnd=mesFinal.getSelectedIndex();	   
	   //despliega un objeto de la clase FiestasVarias
     ArrayList<Holiday> h=getHolidays(dayStart,monthStart,dayEnd,monthEnd);
		FiestasVarias marcoCuadroCombinado = new FiestasVarias(h);
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
	}
	

	
	
}





