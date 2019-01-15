# Java-Calendario
  
Ramirez García Diana Isabel

Java

Para ver el proyecto basta con ejecutar desde la carpeta src Java Prueba
El proyecto se encuentra dividido en varias clases, que se explicaran a 
continuación.

-------------------Holiday----------------------------------------

Esta clase es la encargada de crear los dias festivos, cuyos atributos
son la fecha de este, la efemeride, su imagen correspondiente y un
atributo muy importante diaGlobal , es el día del año (sea de 1 a 365 días)
En el constructor se utiliza una condicional para calcular diaGlobal
Se tiene una serie de setters y getters. 
Esta el metodo transformarMes para expresar el mes en forma de String



-----------------Listholidays------------------------------------------

Aquí se encuentran todaslas festividades del año declaradas y se almacenan
en un ArrayList
Se crean 4 combobox para ingresar la fecha desa en inicio y final
Los 2 combobox responsable de los meses tienen(cuando hay un evento) como
acción establecer los elementos de los otros 2 combobox correspondientes
a los dias. Este lo establecen de 30,31,28 días según sea necesario

Luego tenemos otro evento pero que corresponde al boton aceptar.
Aquí obtenemos con getSelectedIndex el valor del día y Mes , gracias a que
la numeración inicia en 1 porque el elem 0 tiene un valor por defecto 
"dia", "mes".
Se obtiene el array con las festividades que entren en el rango con el 
metodo getHolidays()
Este desplegara a FiestasVarias

Se tienen los metodos transformar, este regresa el día del año de acuerdo
al mes y dia ingresados; esta el metodo getHolidays el cual regresa
el arreglo con las festividades en el rango establecido.



------------Clases Enero,Febrero...Diciembre ...FiestasVarias------------------

Estas clases muestran un combobox con las festividades en ese mes (en caso 
de Fiestas Varias en el rango establecido)
Y muestran una imagen con el calendario y despliega una imagen de acuerdo 
a la festividad seleccionada


-----------------Global Calendar--------------------------------------

Esta es la clase principal debido a que en ella tenemos una cuadricula
con imagebuttons, cada boton corresponde a la clase Enero, Febrero,...
Cuando surge el evento, en la accion se encarga de hacerlo visible.
También se tiene hasta abajo un boton que desplegara a Listholidays


----------------------Mes-------------------------------------------

Esta clase cuenta con los metodos getImagenes, getefemerides, getfechas.
Estas regresan un arreglo con los datos correspondientes que se obtienen
de un arreglo de objetos Holiday. Estos arreglos se utilizan en las clases
Enero......Diciembre 
