import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Usa [size - clear - print] il resto verrà aggiunto!");

        while (true) {
            System.out.println("Per favore inserisci un Stringa: ");
            String user = s.nextLine();
            switch (user){
                case "size":
                    System.out.println("Ecco la dimensione: " + list.size());
                    break;
                case "clear":
                    list.clear();
                    System.out.println("Ho cancellato tutto!!");
                case "print":
                    System.out.println(list);
                    break;
                default:
                    list.add(user);
                    break;

            }
        }
    }
}

