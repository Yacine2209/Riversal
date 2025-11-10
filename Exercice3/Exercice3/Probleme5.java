
import java.util.Random;

public class Probleme5
{
    
    public static void main(String[] args) 
    {
        int N = 10;
        int[] tableau = new int[N];    
        Random nombre = new Random();
        
        // Remplissage du tableau avec des nombres aléatoires (0 à 99)
        for (int i = 0; i < N; i++)
        { 
            tableau[i] = nombre.nextInt(100); 
        }

        System.out.println("Tableau #1");
        // Affichage du tableau avec méthode paramétrée
        afficherTableau(tableau);

        // Inversion de l'ordre du tableau par permutation
        inverserTableau(tableau);
        
        System.out.println("\nTableau #2");
        // Réaffichage du tableau inversé
        afficherTableau(tableau);
    }
    
    // Méthode pour afficher le contenu d'un tableau
    public static void afficherTableau(int[] tab) {
        for (int i = 0; i < tab.length; i++)
        {
            System.out.println("Nombre [" + i + "] : " + tab[i]);
        }
    }
    
    // Méthode pour inverser l'ordre du tableau par permutation
    public static void inverserTableau(int[] tab) {
        int N = tab.length;
    // Boucle sur la moitié du tableau pour échanger les paires une seule fois
        for (int i = 0; i < N / 2; i++) {
            
    // Calcul de l'indice de l'élément symétrique (fin)
            int indexFin = N - 1 - i;
            
    // Échange des valeurs (permutation) via une variable temporaire
            int temp = tab[i];
            tab[i] = tab[indexFin];
            tab[indexFin] = temp;
        }
    }
}
