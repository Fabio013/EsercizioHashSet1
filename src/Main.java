import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Creo un HashSet utilizzando la funzione
        HashSet<String> ruoliSquadra = creaSquadra();

        // 2.1 Creare un oggetto dello stesso tipo inserito nell'HashSet...
        String nuovoRuolo = "Cc";

        // 2.2 ...e popolarlo
        ruoliSquadra.add(nuovoRuolo);

        // 3. Verificare se l'oggetto è presente nell'HashSet e stampare il risultato
        if (ruoliSquadra.contains(nuovoRuolo)) {
            System.out.println(nuovoRuolo + " è presente nell'HashSet");
        } else {
            System.out.println(nuovoRuolo + " non è presente nell'HashSet");
        }
    }
    // 1- Funzione che restituisca un HashSet riempito
    private static HashSet<String> creaSquadra () { //creo funzione che restituisce HashSet
        HashSet<String> squadra = new HashSet<String>(Arrays.asList("Pt", "Dd","Ds", "Dc"));
        return squadra ;
    }
}


