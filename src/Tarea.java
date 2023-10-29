
import java.time.LocalDate;

//Clase tarea con su atributo private y los Getters
public class Tarea {

    private String nombreTarea;

    public Tarea(String nombreTarea) {

        this.nombreTarea = nombreTarea;

    }

    public String getNombretarea() {
        return nombreTarea;
    }

    //Metodo toString el cual devuelve el estado del objeto
    @Override
    public String toString() {
        return nombreTarea;
    }
}
