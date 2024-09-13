import java.util.Scanner;

public class AgeValidation {
    
    // Definir constante para la edad mínima requerida
    private static final int MINIMUM_AGE = 18;

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese su edad
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        // Validar si el usuario tiene la edad mínima requerida
        if (age >= MINIMUM_AGE) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // Cerrar el escáner
        scanner.close();
    }
}

