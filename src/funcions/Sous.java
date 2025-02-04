package funcions;

public class Sous
{
    public static void main(String[] args) {

        System.out.println(aplicaPercentatge(125, 6.5)); // 8.12
        System.out.println(aplicaPercentatge(144.5, 2.1)); // 3.03
        System.out.println(quinquenis(2003, 2017)); // 2
        System.out.println(quinquenis(2001, 2016)); // 3
        System.out.println(sous(1000.0, 79876.43, 1.1, 103.2, 2015, 2018)); // 1878.64
        System.out.println(sous(1651.5, 153876.43, 0.85, 103.2, 2006, 2018)); // 3165.85





    }

    public static double sous(double fix, double vendes, double perc, double bonus,int anyInici,int anyActual){
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
