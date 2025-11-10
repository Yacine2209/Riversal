
import java.util.Random;

public class Probleme3 {

    public static void main(String[] args)
    {
        int N = 9;
        int[] tableauInverse = new int[N]; 
        int[] tableau = new int[N];       
        Random nombre = new Random();

        for (int i = 0; i < N; i++)
        { 
            tableau[i] = nombre.nextInt(100);
        }

        for (int i = 0; i < N; i++)
        {
            int j = N - 1 - i;
            tableauInverse[j] = tableau[i];
        }

        System.out.println("Tableau en Ordre");
        for (int i = 0; i < N; i++)
        {
            System.out.println("Nombre [" + i + "] : " + tableau[i]);
        }
        
        System.out.println("\nTableau Inverse");
        for (int i = 0; i < N; i++)
        {
            System.out.println("Nombre [" + i + "] : " + tableauInverse[i]);
        }
    
}
}