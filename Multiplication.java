import java.util.Random;
import java.util.Scanner;

public class MultiplicationPractice {

    public static void main(String[] args) {
        practiceTables();
    }

    public static void practiceTables() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] questions = new String[100];
        int[] answers = new int[100];
        int index = 0;

        while (true) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            questions[index] = num1 + " x " + num2;

            System.out.printf("¿Cuánto es %d x %d?%n", num1, num2);
            int answer = scanner.nextInt();
            answers[index] = answer;
            index++;

            if (evaluateAnswer(num1, num2, answer)) {
                System.out.println("¡Correcto!");
            } else {
                System.out.printf("Incorrecto. La respuesta correcta es %d.%n", num1 * num2);
            }

            System.out.print("¿Quieres intentar otra vez? (s/n): ");
            String continuar = scanner.next();
            switch (continuar.toLowerCase()) {
                case "s":
                    break;
                case "n":
                    System.out.println("Gracias por practicar. ¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Saliendo del programa.");
                    scanner.close();
                    return;
            }
        }
    }

    public static boolean evaluateAnswer(int num1, int num2, int answer) {
        return num1 * num2 == answer;
    }
}
