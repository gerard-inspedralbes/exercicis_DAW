import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DemoMaps {
    public static void main(String[] args) {
        // HashMap: No garanteix cap ordre
        HashMap hashMap = new HashMap<>();
        hashMap.put(10, "Deu");
        hashMap.put(5, "Cinc");
        hashMap.put(1, "Un");
        hashMap.remove(5);
        hashMap.put(7, "Set");
        hashMap.put(3, "Tres");
        hashMap.put(25, "Vint-i-cinc");
        hashMap.put(12, "Dotze");
        hashMap.put(30, "Trenta");
        hashMap.put(7, "Set");
        hashMap.put(18, "Divuit");

        System.out.println("HashMap:");
        System.out.println(hashMap.keySet());
        for (Object key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }



        // LinkedHashMap: Manté l'ordre d'inserció
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Deu");
        linkedHashMap.put(5, "Cinc");
        linkedHashMap.put(1, "Un");
        linkedHashMap.remove(5);
        linkedHashMap.put(7, "Set");
        linkedHashMap.put(3, "Tres");
        linkedHashMap.put(25, "Vint-i-cinc");
        linkedHashMap.put(12, "Dotze");
        linkedHashMap.put(30, "Trenta");
        linkedHashMap.put(7, "Set");
        linkedHashMap.put(18, "Divuit");

        System.out.println("\nLinkedHashMap:");
        System.out.println(linkedHashMap.keySet());
        for (Object key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }

        // TreeMap: Ordena les claus en ordre natural
        TreeMap treeMap = new TreeMap<>();
        treeMap.put(10, "Deu");
        treeMap.put(5, "Cinc");
        treeMap.put(1, "Un");
        treeMap.remove(5);
        treeMap.put(7, "Set");
        treeMap.put(3, "Tres");
        treeMap.put(25, "Vint-i-cinc");
        treeMap.put(12, "Dotze");
        treeMap.put(30, "Trenta");
        treeMap.put(7, "Set");
        treeMap.put(18, "Divuit");

        System.out.println("\nTreeMap:");
        System.out.println(treeMap.keySet());
        for (Object key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }

        //Si ho volem mostrar en un altre format, ho podem canviar
        System.out.println(hashMap.keySet().toString().replace("]","}").replace("[","{").replace(",",""));
    }
}