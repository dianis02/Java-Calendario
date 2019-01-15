import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GlobalCalendar extends JFrame implements ActionListener {
  
  JPanel panel;
  JPanel panel_interno;
  JButton enero;
  JButton febrero;
  JButton marzo;
  JButton abril;
  JButton mayo;
  JButton junio;
  JButton julio;
  JButton agosto;
  JButton septiembre;
  JButton octubre;
  JButton noviembre;
  JButton diciembre;
  JButton holiday;
  private JLabel etiqueta3= new JLabel();


/**
 * Constructor por omision
 */ 
  public GlobalCalendar(){

 
	//se crean los botones
     enero = new JButton(new ImageIcon("imagenes/january.jpg"));    
     febrero= new JButton(new ImageIcon("imagenes/february.jpg"));
     marzo= new JButton(new ImageIcon("imagenes/march.jpg"));
     abril= new JButton(new ImageIcon("imagenes/april.jpg"));
     mayo = new JButton(new ImageIcon("imagenes/may.jpg"));
     junio= new JButton(new ImageIcon("imagenes/june.jpg"));
     julio= new JButton(new ImageIcon("imagenes/july.jpg"));
     agosto= new JButton(new ImageIcon("imagenes/august.jpg"));
     septiembre= new JButton(new ImageIcon("imagenes/september.jpg"));
     octubre= new JButton(new ImageIcon("imagenes/october.jpg"));
     noviembre= new JButton(new ImageIcon("imagenes/november.jpg"));
     diciembre= new JButton(new ImageIcon("imagenes/december.jpg"));
     holiday= new JButton("Buscar festividades");
     etiqueta3.setText("Calendario 2018");
     etiqueta3.setPreferredSize(new Dimension(150, 50));
     
     
      getContentPane().setLayout(new FlowLayout());
     //se les asigna un tamaño
     panel=new JPanel(new GridLayout(3,1));
      panel_interno=new JPanel(new GridLayout(4,3));
       panel.setPreferredSize(new Dimension(700, 300));
       panel_interno.setPreferredSize(new Dimension(650, 550));
	panel_interno.setLocation(25,50 );
      
      //se agregan los botones al panel
      panel.add(etiqueta3);
      panel_interno.add(enero);
      panel_interno.add(febrero);
      panel_interno.add(marzo);
      panel_interno.add(abril);
      panel_interno.add(mayo);
      panel_interno.add(junio);
      panel_interno.add(julio);
      panel_interno.add(agosto);
      panel_interno.add(septiembre);
      panel_interno.add(octubre);
      panel_interno.add(noviembre);
      panel_interno.add(diciembre);
      
      //se agrega un listener para el evento
      enero.addActionListener(this);
      febrero.addActionListener(this);
      marzo.addActionListener(this);
      abril.addActionListener(this);
      mayo.addActionListener(this);
      junio.addActionListener(this);
      julio.addActionListener(this);
      agosto.addActionListener(this);
      septiembre.addActionListener(this);
      octubre.addActionListener(this);
      noviembre.addActionListener(this);
      diciembre.addActionListener(this);
	
	//se agregan los paneles al frame
      getContentPane().add(etiqueta3);
       getContentPane().add(panel_interno);
        getContentPane().add(holiday);
       holiday.addActionListener(this);
  
     

     setTitle("Calendario");
     
     
   }
   
   
   /**
    * Metodo que realiza la accion del evento dependiendo
    * del boton presionado
    * @param ActionEvent evt
    */ 
   public void actionPerformed(ActionEvent evt){
	   
	   //despliega un objeto de la clase Enero
     if (evt.getSource()==enero){
		Enero marcoCuadroCombinado = new Enero();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
        
     //despliega un objeto de la clase Febrero
     }else if (evt.getSource()==febrero){
		Febrero hola = new Febrero();
		hola.setSize( 400, 700 );
		hola.setVisible( true );
       
            
       //despliega un objeto de la clase Marzo
	 }else if (evt.getSource()==marzo){
		Marzo marcoCuadroCombinado = new Marzo();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
            
            //despliega un objeto de la clase Abril
	 }else if (evt.getSource()==abril){
		Abril marcoCuadroCombinado = new Abril();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );     
            
            //despliega un objeto de la clase Mayo
	 }else if (evt.getSource()==mayo){
		Mayo marcoCuadroCombinado = new Mayo();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
		 
		 
            //despliega un objeto de la clase Junio
	 }else if (evt.getSource()==junio){
		Junio marcoCuadroCombinado = new Junio();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
           
            
            //despliega un objeto de la clase Julio
	 }else if (evt.getSource()==julio){
		Julio marcoCuadroCombinado = new Julio();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
            
           //despliega un objeto de la clase Agosto
	 }else if (evt.getSource()==agosto){
		Agosto marcoCuadroCombinado = new Agosto();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
      
      //despliega un objeto de la clase Septiembre
	 }else if (evt.getSource()==septiembre){
		Septiembre marcoCuadroCombinado = new Septiembre();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
     
           
           //despliega un objeto de la clase octubre
	 }else if (evt.getSource()==octubre){
		Octubre marcoCuadroCombinado = new Octubre();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
     
       
       //despliega un objeto de la clase noviembre
	 }else if (evt.getSource()==noviembre){
		Noviembre marcoCuadroCombinado = new Noviembre();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
     
            
            //despliega un objeto de la clase diciembre
	 }else if (evt.getSource()==diciembre){
        Diciembre marcoCuadroCombinado = new Diciembre();
		marcoCuadroCombinado.setSize( 400, 700 );
		marcoCuadroCombinado.setVisible( true );
        
        //despliega un objeto de la clase Liistholidays
        //para ingresar las fechas deseadas y obtener las festividades
	 }else if(evt.getSource()==holiday){
        Listholidays marcoCuadroCombinado = new Listholidays();
		marcoCuadroCombinado.setSize( 300, 200 );
		marcoCuadroCombinado.setVisible( true );
	}
	 
	 
	 
	 
}

 }
