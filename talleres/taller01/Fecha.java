
 import java.time.Year;
public class Fecha
{


    private int dia, mes, anyo;


    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Fecha(int dia, int mes, int anyo)
    {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    /**
     * Método para obtener la variable global dia.
     *
     * @return el dia
     */
    public int dia()
    {
        return this.dia;
    }

    /**
     * Método para obtener la variable global mes.
     *
     * @return el mes
     */
    public int mes()
    {
        return this.mes;
    }

    /**
     * Método para obtener la variable global anio.
     *
     * @return el año
     */
    public int anio()
    {
        return this.anyo;
    }

    /**
     * @param otra representa la fecha con la cual se va a comparar.
     *
     * El método comprar se encarga de devolvernos respuesta a tres posibilidades.
     * 1: si la fecha es menor que la otra retorna -1.
     * 2: si la fecha es igual que la otra retorna 0.
     * 3: si la fecha es mayor que la otra retorna 1.
     *
     * @return -1 sí es menor; 0 sí es igual; 1 sí es mayor.
     *
     */

    public int comparar(Fecha otra)
    {
        if(this.anyo < otra.anyo)
        {
            return -1;
        }
        if(this.anyo > otra.anyo)
        {
            return 1;
        }
        if (this.mes < otra.mes)
        {
            return -1;
        }
        if(this.mes > otra.mes)
        {
            return 1;
        }
        if (this.dia < otra.dia)
        {
            return -1;
        }
        if(this.dia > otra.dia)
        {
            return 1;
        }
        return 0;
    }


    /**
     * toString se encargará de convertir el tipo abstracto fecha en un tipo cadena
     * para su posterior visualización
     *
     * @return una cadena que contiene la fecha
     */
    public String toString() {
        return dia+" / "+mes+" / "+anyo;
    }
}