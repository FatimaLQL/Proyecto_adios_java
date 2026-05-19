import java.util.Scanner;

public class AdiosJava{
    public static void main(String[] args){

        public static double Divison (double numero1, double numero2){
            return numero1 / numero2;
        }
        public static int multiplicar (int numero1, int numero2){
            return numero1 * numero2;
        }
        
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ SUMA ------");
        System.out.println("Escribe el primer numero para la suma: ");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el segundo numero para la suma: ");
        numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);

        System.out.println("------ RESTA ------");
        System.out.println("Escribe el primer numero para la resta: ");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el segundo numero para la resta: ");
        numero2 = scanner.nextInt();
        resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);
    
        Persona persona1;
        persona1 = new Persona ("Fatima Liseth", "Quintero", "López");
        persona1.setEdad(20);

        System.out.println("Datos de la Persona:\n" + persona1.toString());

    }
}