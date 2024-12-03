import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primer perro
        System.out.println("Ingrese los datos del primer perro:");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Raza: ");
        String raza1 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad1 = scanner.nextInt();
        System.out.print("Peso (en kg): ");
        double peso1 = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        Perro perro1 = new Perro(nombre1, raza1, edad1, peso1);

        // Segundo perro
        System.out.println("\nIngrese los datos del segundo perro:");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Raza: ");
        String raza2 = scanner.nextLine();
        System.out.print("Edad: ");
        int edad2 = scanner.nextInt();
        System.out.print("Peso (en kg): ");
        double peso2 = scanner.nextDouble();

        Perro perro2 = new Perro(nombre2, raza2, edad2, peso2);

        System.out.println("\nInteractuando con " + perro1.getNombre() + ":");
        perro1.comer("croquetas", 200); // Ejemplo de comida
        System.out.println(perro1.getNombre() + " dice: " + perro1.ladrar());

        System.out.println("\nInteractuando con " + perro2.getNombre() + ":");
        perro2.comer("pollito", 300); // Ejemplo de comida
        System.out.println(perro2.getNombre() + " dice: " + perro2.ladrar());

        scanner.close();
    }
}
