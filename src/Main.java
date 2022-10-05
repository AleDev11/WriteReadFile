import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean InMenu = true;
        String Nombre, Apellido;
        int Edad;

        ManagerFile managerFile = new ManagerFile();
        WriteFile writeFile = new WriteFile();
        ReadFile readFile = new ReadFile();
        Alumno alumno = new Alumno();
        Scanner scanner = new Scanner(System.in);

        //managerFile.checkFile("src\\Alumnos.txt");

        while(InMenu == true) {
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Mostrar Alumnos");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    InMenu = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }
}
