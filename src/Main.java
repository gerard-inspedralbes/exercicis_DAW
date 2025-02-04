import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        int p = scan.nextInt(); //quantitat de pokemons que hi ha
        while(casos > 0){
            int[] pI = new int[p]; //array per emmamatgemar els id del pokemons
            int[] pL = new int[p]; //array per emmagatzemar els nivells dels pokemons
            for (int i = 0; i < p; i++) { //llegim tots els ids
                pI[i] = scan.nextInt();;
            }
            for (int i = 0; i < p; i++) { //llegim tots els nivells
                pL[i] = scan.nextInt();;
            }
            LinkedHashMap<Integer,Integer> result = new LinkedHashMap<>();
            for (int i = 0; i < p; i++) {
                if(result.containsKey(pI[i])){
                    if(result.get(pI[i])< pL[i]) {
                        result.remove(pI[i]); //eliminem anterior
                        result.put(pI[i], pL[i]); //afegim pokemon
                    }
                }else{
                    result.put(pI[i],pL[i]); //afegim pokemon
                }
            }
            for(Integer i : result.keySet()){
                System.out.print(i + " ");
            }
            System.out.println();
            casos--;
        }
    }
}