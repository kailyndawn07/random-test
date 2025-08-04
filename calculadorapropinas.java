import java.util.Scanner; // Importamos Scanner para leer datos del usuario

public class calculadorapropinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos el objeto Scanner

        // Repetimos el cálculo 5 veces
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cálculo #" + i);

            // Pedimos el monto total de la cuenta
            System.out.print("Monto total: ");
            double monto = scanner.nextDouble();

            // Pedimos el porcentaje de propina
            System.out.print("Porcentaje de propina: ");
            double porcentaje = scanner.nextDouble();

            // Calculamos la propina con la fórmula
            double propina = monto * porcentaje / 100;

            // Calculamos el total a pagar (monto + propina)
            double total = monto + propina;

            // Mostramos el resultado al usuario
            System.out.println("Propina: " + propina);
            System.out.println("Total a pagar: " + total);
            System.out.println();
        }

        scanner.close(); // Cerramos el Scanner al final
    }
}
