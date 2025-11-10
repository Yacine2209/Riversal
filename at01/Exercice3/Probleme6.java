
import java.util.Scanner;
public class Probleme6 
{
    public static void main(String[] args) 
    {
        int[] tableau = {-65, -34, 7, -3, -43, 14, 23, -9, 45, 11}; 
        
        System.out.println("                    Tableau");
        
        
        afficherTableauLigne(tableau);
       
        
    
    }

 
    public static void afficherTableauLigne(int[] tab) {
        System.out.print("|"); 
        
        // Boucle pour parcourir chaque élément
        for (int i = 0; i < tab.length; i++) 
        {
            System.out.print(" " + String.valueOf(tab[i]) + " |"); 
        }
        System.out.println();
    }
    public static void Caclculer(int[] tab)
    {
        int sommePositive = 0;
        int sommeNegative = 0;

        for (int i = 0; i < tab.length; i++) {
            int element = tab[i];

            if (element > 0) {
                sommePositive += element;
            } else if (element < 0) {
                sommeNegative += element;
            }
        }
    }
}
