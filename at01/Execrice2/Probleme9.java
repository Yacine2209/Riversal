import java.util.Scanner;

public class Probleme9 {
    // Créer un méthodes
    public static double Circonférence(int iRayon) {
        return 2 * Math.PI * iRayon;
    }

    public static void main(String[] args) {
       
        Scanner lectureClavier = new Scanner(System.in);

        
        System.out.print("Saisissez votre rayon: ");
        int iRayon = lectureClavier.nextInt();

        
        double dCirconférence = Circonférence(iRayon);

       
        System.out.println("Le rayon saisi est: " + iRayon);
        System.out.println("La circonférence est de: " + dCirconférence);

        
        lectureClavier.close();
    }
}