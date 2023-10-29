
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        try {
            byte opcion = 0;

            do {
                opcion = Byte.parseByte(JOptionPane.showInputDialog(
                        "MENU PRINCIPAL\nOpciones:\n"
                        + "1.Ingrese una tarea\n"
                        + "2.Mostrar tarea\n"
                        + "3.Salir"
                ));

                switch (opcion) {

                    case 1:
                        System.out.println("Ingrese una tarea: ");
                        String description = scanner.nextLine();
                        todoList.agregarTarea(description);
                        if (description.isBlank()) {
                            System.out.println("Debe ingresar una tarea");
                        }

                        break;
                    case 2:
                        todoList.mostrarTareas();
                        break;

                    case 3:
                        System.out.println("Adios!");
                        scanner.close();
                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida!!");
                }

            } while (opcion != 3);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Opcion invalida, vuelva a ejecutar el programa");
            System.exit(0);

        }

    }
}
