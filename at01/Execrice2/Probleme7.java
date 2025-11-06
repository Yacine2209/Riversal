import java.util.Scanner;

public class Probleme7
{

public static void main(String[] args)
{
 Scanner lectureClavier=new Scanner(System.in);
 int iVoyelle=0;
 int iConsonne=0;

     System.out.print("Saisisez un phrase: ");
     String sPhrase=lectureClavier.nextLine();
   
     for (int i = 0; i < sPhrase.length(); i++) {
      
      if (Character.isLetter(sPhrase.charAt(i))) {

         if (sPhrase.charAt(i) == 'a' || sPhrase.charAt(i) == 'e'||sPhrase.charAt(i) == 'i'||sPhrase.charAt(i) == 'o'||sPhrase.charAt(i) == 'u'||sPhrase.charAt(i) == 'y') {
            iVoyelle++;
         }
         else
         {
            iConsonne++;
         }

      }

     }
     System.out.print("Il y'a "+ iConsonne +" consonnes\n");
     System.out.print("Il y'a "+ iVoyelle +" voyelles");

     }
}