package funcions;

import java.util.Scanner;

public class Sous
{
    public static void main(String[] args) {

        /*System.out.println(aplicaPercentatge(125, 6.5)); // 8.12
        System.out.println(aplicaPercentatge(144.5, 2.1)); // 3.03
        System.out.println(quinquenis(2003, 2017)); // 2
        System.out.println(quinquenis(2001, 2016)); // 3
        System.out.println(sous(1000.0, 79876.43, 1.1, 103.2, 2015, 2018)); // 1878.64
        System.out.println(sous(1651.5, 153876.43, 0.85, 103.2, 2006, 2018)); // 3165.85

*/
        Scanner input = new Scanner(System.in);
        System.out.println("Benvingut a l'app de càlcul de sous:");
        double fix = llegirDouble(input,"Introdueix el sou fix:");
        double vendes = llegirDouble(input,"Introdueix les vendes:");
        double perc = llegirDouble(input,"Introdueix el percentatge de commissió:");
        double bonus = llegirDouble(input,"Introdueix el bonus per quinqueni:");
        int anyInici = llegitInt(input,"Introdueix l'any d'inici del treballador:");
        int anyActual = llegitInt(input,"Introdueix l'any actual:");
        double sou = sous(fix,vendes,perc,bonus,anyInici,anyActual);
        System.out.println("El sou del treballador es: " + sou + "€");
        }

    public static int llegitInt(Scanner scanner, String s) {
        int numero;
        while(true){
            System.out.println(s);
            if(scanner.hasNextInt()){
                numero = scanner.nextInt();
                scanner.nextLine();
                return numero;
            }else{
                System.out.println("ERROR: Si us plau, introdueixi un número enter vàlid.");
                scanner.next();
            }
        }
    }

    /**
    *Funció perllegir doubles de manera segura
    */
    public static double llegirDouble(Scanner scanner, String s) {
            double numero;
            while(true){
                System.out.println(s);
                if(scanner.hasNextDouble()){
                    numero = scanner.nextDouble();
                    scanner.nextLine();
                    return numero;
                }else{
                    System.out.println("ERROR: Si us plau, introdueixi un número decimal vàlid.");
                    scanner.next();
                }
            }
        }

    public static double sous(double fix, double vendes, double perc, double bonus, int anyInici, int anyActual){
            double variable_1 = aplicaPercentatge(vendes,perc);
            int n_quinq = quinquenis(anyInici,anyActual);
            double variable_2 = n_quinq * bonus;
            return arrodoniment(fix+variable_1+variable_2,2);
        }

    public static int quinquenis(int any1, int any2){
            return (any2-any1) / 5;
        }

    public static double aplicaPercentatge(double quantitat, double perc){
            double result = quantitat * perc / 100;
            return arrodoniment(result,2);
        }

    public static double arrodoniment(double quantitat, int decimals){
            double d = Math.pow(10,decimals);
            return Math.round(quantitat * d)/d;
        }



}


