import java.util.Scanner;

public class Probleme12 {

  public static int sommeMinMax(int iMax,int iMin) 
  {
    int iSomme=0;
        for (int i = iMin; i <= iMax; i++) {
        iSomme += i;
    }
    return iSomme;
  }

    public static void main(String[] args) {
    

       Scanner lectureClavier = new Scanner(System.in);

        System.out.print("Entrez le nombre minimum : ");
        int iMin = lectureClavier.nextInt();

        System.out.print("Entrez le nombre maximum : ");
        int iMax = lectureClavier.nextInt();

    

        int iSomme = sommeMinMax(iMax, iMin);

      
        
    
    
    for (int i = iMin; i <= iMax; i++) {
            System.out.print(i); 
            
            
            if (i < iMax) {
                System.out.print(" + ");
            }
            
        }
        System.out.println("La somme des nombres entre " + iMin + " et " + iMax + " est : " + iSomme);
        
}
}
