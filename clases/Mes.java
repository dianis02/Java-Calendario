
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Arrays;


public class Mes{

	
	

	public Mes(){
		
	}
	
	
	/**
	 * Metodo que obtiene un arreglo con las fechas festivas
	 * @param ArrayList <Holiday> a
	 * @return String[]
	 */
	public String[] getfechas(ArrayList<Holiday> a){
		String fiesta=null;
		ArrayList<String> intervalo= new ArrayList<String>();
		intervalo.add("Seleccionar");
		for(int i=0; i<a.size();i++){
			fiesta= a.get(i).toString();
			intervalo.add(fiesta);
		}
			String[] arr = intervalo.toArray(new String[intervalo.size()]);
		return arr;

	}
	
	
	/**
	 * Metodo que obtiene un arreglo con las festividades
	 * @param ArrayList <Holiday> a
	 * @return String[]
	 */
	public String[] getefemeride(ArrayList<Holiday> a){
		String fiesta=null;
		ArrayList<String> intervalo= new ArrayList<String>();
		intervalo.add("");
		for(int i=0; i<a.size();i++){
			fiesta=a.get(i).getfestividad();
			intervalo.add(fiesta);
		}
			String[] arr = intervalo.toArray(new String[intervalo.size()]);
		return arr;


	}
	
	
	/**
	 * Metodo que obtiene un arreglo con las imagenes de los dias feriados
	 * @param ArrayList <Holiday> a
	 * @return Icon[]
	 */
		public Icon[] getimagenes(ArrayList<Holiday> a){
		Icon fiesta=null;
		ArrayList<Icon> intervalo= new ArrayList<Icon>();
		intervalo.add(null);
		for(int i=0; i<a.size();i++){
			fiesta=a.get(i).getIcon();
			intervalo.add(fiesta);
		}
			Icon[] arr = intervalo.toArray(new Icon[intervalo.size()]);
		return arr;


	}
	
	
	
	
	
	
	
	
}
