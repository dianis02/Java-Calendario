import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Arrays;


public class Holiday{
int diaMes;
int mes;
int diaGlobal;
Icon img;
String festividad;

	/**
	 * Constructor por parametros
	 * @param int diaMes, int mes, String nombre, String festividad
	*/
	public Holiday(int diaMes, int mes, String nombre, String festividad){
		this.diaMes=diaMes;
		this.mes=mes;
		img=new ImageIcon( getClass().getResource(nombre) );
		this.festividad=festividad;
		
		//condicional para determinar el diaGlobal
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
		
			}
				
	
	/**
	 * Metodo que devuelve el atributo festividad
	 * @return String festividad
	 */
	public String getfestividad(){
		return festividad;
	}
			
	/**
	 * Metodo que devuelve el atributo diaMes
	 * @return int diaMes
	 */
	public int getdiaMes(){
		return diaMes;
		
		
	}
	
	
	/**
	 * Metodo que devuelve el atributo Mes
	 * @return int Mes
	 */
	public int getMes(){
		return mes;
		
		
	}
	
	/**
	 * Metodo que devuelve el atributo diaGlobal
	 * @return int diaGlobal
	 */
	public int getdiaGlobal(){
		return diaGlobal;
		
		
	}
	
	/**
	 * Metodo que devuelve el atributo img
	 * @return Icon img
	 */
	public Icon getIcon(){
		return img;
	}
		
	
	/**
	 * Metodo transforma el mes en el string correspondiente
	 * @return String fecha
	 */
	public String transformMes(){
		String fecha=null;
		if(mes==1){
			fecha="enero";
			
		}else if(mes==2){
			fecha= "febrero";
		
		}else if(mes==3){
			fecha= "marzo";
			
		}else if(mes==4){
			fecha= "abril";
			
		}else if(mes==5){
			fecha= "mayo";
			
		}else if(mes==6){
			fecha= "junio";
			
		}else if(mes==7){
			fecha= "julio";
			
		}else if(mes==8){
			fecha= "agosto";
			
		}else if(mes==9){
			fecha= "septiembre";
			
		}else if(mes==10){
			fecha= "octubre";
			
		}else if(mes==11){
			fecha= "noviembre";
			
		}else if(mes==12){
			fecha= "diciembre";
		}	
		return fecha;
		
	}
	
	
	/**
	 * Metodo que devuelve la representacion del objeto
	 * @return String representaacion(fecha)
	 */
	public String toString(){
		return getdiaMes()+" de "+transformMes();	
	}
	
	
	
	
	
}
	
	
	
	
