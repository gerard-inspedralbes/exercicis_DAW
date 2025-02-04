import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mini2048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        while(casos > 0){
            int mida = scan.nextInt();
            int[] fila = new int[mida];
            for (int i = 0; i < mida; i++) {
                fila[i] = scan.nextInt();
            }
            scan.nextLine();
            String direccio = scan.nextLine();
            fila = processarFila(fila,direccio);
            System.out.println(Arrays.toString(fila).replace("[","").replace("]","").replace(",",""));
            casos--;
        }
    }
    public static int[] processarFila(int[] fila, String direccio){

        if(direccio.equals("R")) {
            invertirArray(fila);
        }

        //convertir a ArrayList
        ArrayList<Integer> filaP = new ArrayList<>();
        for (int i = 0; i < fila.length; i++) {
            filaP.add(fila[i]);
        }
        //treure zeros
        eliminarZeros(filaP);

        //compactem
        for (int i = 0; i < filaP.size()-1; i++) {
            if(filaP.get(i).equals(filaP.get(i+1))){
                filaP.set(i,filaP.get(i)*2);
                filaP.set(i+1,0);
            }
        }

        //treure zeros
        eliminarZeros(filaP);

        //afegim zeros i convertir a array
        int[] result = new int[fila.length];
        for (int i = 0; i < filaP.size(); i++) {
            result[i] = filaP.get(i);
        }

        if(direccio.equals("R")) {
            invertirArray(result);
        }

        return result;

    }
    public static void eliminarZeros(ArrayList<Integer> filaP){
        for (int i = 0; i < filaP.size(); i++) {
            if(filaP.get(i).equals(0)){
                filaP.remove(i);
                i--;
            }
        }
    }

    public static void invertirArray(int[] array){
        for (int i = 0, j = array.length-1; i < j; i++,j--) {
            int temp = array[j];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
