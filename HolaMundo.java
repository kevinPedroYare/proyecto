import java.util.Scanner;
public class HolaMundo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola Mundo!");
        System.out.println("Bienvenida al curso");
        System.out.println("¿Cuál es tu nombre?");
        System.out.println("¡Hola " + sc.nextLine() + "!");
    }
}