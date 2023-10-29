
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    //Creo un array en la cual guardo las tareas e inicializo el array
    private ArrayList<Tarea> tareas = new ArrayList<>();

    //Metodo para agregar tareas
    public void agregarTarea(String description) {
        tareas.add(new Tarea(description));

    }
    
    //Metodo para poder imprimir las tareas
    public void mostrarTareas() {
        System.out.println("Tarea:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println("Id:" +i+" " + tareas.get(i));
            System.out.println(LocalDate.now());

        }

    }
}
