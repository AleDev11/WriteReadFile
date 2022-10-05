import java.util.Scanner;

public class Main {
    static ManagerFile managerFile = new ManagerFile();
    static WriteFile writeFile = new WriteFile();
    static ReadFile readFile = new ReadFile();
    static Alumno alumno = new Alumno();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean InMenu = true;

        managerFile.checkFolder("src\\db");
        managerFile.checkFile("src\\db\\Alumnos.txt");

        while(InMenu == true) {
            System.out.println("1 | Agregar Alumno");
            System.out.println("2 | Mostrar Todos Los Alumnos");
            System.out.println("2 | Escribir y Leer Archivo copia");
            System.out.println("4 | Salir");
            System.out.print("Ingrese una opcion: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showAllStudents();
                    break;
                case 3:
                    writeAndReadFile();
                    break;
                case 4:
                    InMenu = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }

    }

    public static void addStudent() {
        try {
            boolean NameCorrect = false;
            boolean LastNameCorrect = false;
            boolean AgeCorrect = false;

            while (NameCorrect == false) {
                System.out.print("Ingrese el nombre del alumno: ");
                String name = scanner.next();
                if (managerFile.checkText(name)) {
                    alumno.setNombre(name);
                    NameCorrect = true;
                    //System.out.println("Nombre correcto");
                } else {
                    System.out.println("El nombre no puede contener numeros");
                }
            }

            while (LastNameCorrect == false) {
                System.out.print("Ingrese el apellido del alumno: ");
                String lastName = scanner.next();
                if (managerFile.checkText(lastName)) {
                    alumno.setApellido(lastName);
                    LastNameCorrect = true;
                    //System.out.println("Apellido Correcto");
                } else {
                    System.out.println("El apellido no puede contener numeros");
                }
            }

            while (AgeCorrect == false) {
                System.out.print("Ingrese la edad del alumno: ");
                String age = scanner.next();
                if (managerFile.checkNumber(age)) {
                    alumno.setEdad(Integer.parseInt(age));
                    AgeCorrect = true;
                    //System.out.println("Edad Correcta");
                } else {
                    System.out.println("La edad no puede contener letras");
                }
            }

            writeFile.writeInFile("src\\db\\Alumnos.txt", "\n Nombre del alumno: " + alumno.getNombre() + "\n Apellido del alumno: " + alumno.getApellido() + "\n Edad del alumno: " + alumno.getEdad());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void showAllStudents() {

    }

    public static void writeAndReadFile() {

    }
}
