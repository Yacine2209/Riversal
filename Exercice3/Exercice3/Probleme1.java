import java.util.Scanner;

public class Probleme1 
{
    public static void main(String[] args)
    {
String[] mots = new String[5];

System.out.println("Veuillez entrer 5 mots :");
        
        Scanner lectureClavier=new Scanner(System.in);
        for (int i = 0; i < mots.length; i++) {
            System.out.print("Entrez le mot " + (i + 1) + " : ");
           
            mots[i] = lectureClavier.next(); 
        }
        
        lectureClavier.close();

        
        System.out.println("\n- Tableau ");
        
        
        for (int i = 0; i < mots.length; i++) {
            System.out.println("Case [" + i + "] : " + mots[i]);
        }
   
    }
   
}
    

