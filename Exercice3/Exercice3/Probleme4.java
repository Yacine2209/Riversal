
import java.util.Random;

public class Probleme4 
{
    public static void main(String[] args) 
    {
      int N = 5;
      int[] tableau = new int[N];   
      Random nombre = new Random();
      
      
      
        for (int i = 0; i < N; i++)
        { 
            tableau[i] = nombre.nextInt(100);
        }
int iMax=tableau[0];
int iMin=tableau[0];
int iPositionMax=0;
int iPositionMin=0;

 for (int i = 1; i < N; i++)
        { 
            if (tableau[i]<iMin) 
            {
                iMin=tableau[i];
                iPositionMin=i;
            }
             if (tableau[i]>iMax) 
            {
                iMax=tableau[i];
                iPositionMax=i;
            }
        }

        System.out.println("La plus grande variable est "+iMax +" à la position "+iPositionMax);
        System.out.println("La plus petite variable est "+iMin +" à la position "+iPositionMin);
    }
}
