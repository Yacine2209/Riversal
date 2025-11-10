import java.util.Scanner;

public class Probleme2 {

    public static void main(String[] args) {
        
        double[] nombresReels = new double[10];
        
        Scanner lectureClavier = new Scanner(System.in);
        
        System.out.println("Veuillez entrer 10 nombres réels :");

        for (int i = 0; i < nombresReels.length; i++) {
            System.out.print("Entrez le nombre réel pour l'indice [" + i + "] : ");
            nombresReels[i] = lectureClavier.nextDouble(); 
        }
        
        lectureClavier.close();
        System.out.print("\n Tableau de Réels \n");
        for (int i = 0; i < nombresReels.length; i++) {
            System.out.println("Indice [" + i + "] : " + nombresReels[i]);
    }
}}