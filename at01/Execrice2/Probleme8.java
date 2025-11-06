import java.util.Scanner;

public class Probleme8 {
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);
        String sDerniere = null;
        String sPremier = null;

        while (true) {
            System.out.print("Saisissez un mot: ");
            String sMot = lectureClavier.nextLine();

            
            if (sMot.toLowerCase().equals("stop")) {
                break;
            }

         
            if (sPremier == null || sMot.compareToIgnoreCase(sPremier) < 0) {
                sPremier = sMot;
            }
            if (sDerniere == null || sMot.compareToIgnoreCase(sDerniere) > 0) {
                sDerniere = sMot;
            }
        }

        lectureClavier.close();

        // Affichage des résultats
        if (sPremier != null && sDerniere != null) {
            System.out.println("Le premier mot dans l'ordre alphabétique est : " + sPremier);
            System.out.println("Le dernier mot dans l'ordre alphabétique est : " + sDerniere);
        } 
        
    }
}
      
        
    


