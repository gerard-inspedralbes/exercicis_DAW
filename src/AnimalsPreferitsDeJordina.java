import java.util.ArrayList;
import java.util.Scanner;

public class AnimalsPreferitsDeJordina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = llegirInt(scan);
        while(casos>0){
            int k = llegirInt(scan);
            scan.nextLine();
            ArrayList<String> animals = new ArrayList<>();
            while (k > 1){
                animals.add(scan.nextLine());
                k--;
            }
            String animalCercar = scan.nextLine();
            if(animals.contains(animalCercar)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            casos--;
        }
    }

    public static int llegirInt(Scanner scan){
        while (!scan.hasNextInt()){
            scan.nextLine();
        }
        return scan.nextInt();
    }
}
