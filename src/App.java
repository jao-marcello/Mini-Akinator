import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        //Super super_poderosos[] = new Super[12];

        ArrayList<Super> super_poderosos = new ArrayList<Super>();

        super_poderosos.add(new Super("Batman", "DC", true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false));
        super_poderosos.add(new Super("Super-Homem", "DC", true, true, false, false, false, true, false, false, false, true, true, true, true, false, true, true));
        super_poderosos.add(new Super("Capitão-Patria", "The Boys", true, false, false, false, false, true, false, false, true, true, true, false, true, false, true, true));
        super_poderosos.add(new Super(null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false));
        super_poderosos.add(new Super("Homem-Aranha", "Marvel", true, true, true, true, false, false, true, true, false, true, true, false, false, true, true, true));
        
        ArrayList<Perguntas> perguntas = new ArrayList<Perguntas>();
        
        //System.out.println("Você pensou no Super: " + super_poderosos[3].getNome());

        for (int index = 0; index < super_poderosos.size(); index++) {
           System.out.println("Você pensou no Super: " + super_poderosos.get(index).getNome()); 
        }
    }
}
