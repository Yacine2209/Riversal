package Execrice2;

import java.util.Scanner;

public class Probleme2
{

public static void main(String[] args)
{
    Scanner lectureClavier=new Scanner(System.in);
    System.out.print("Saisiez un mot ou un phrase ");
    String sTexte=lectureClavier.nextLine();
    
 //Compter la longeur de la phrase et l'afficher
int iLongeur=sTexte.length();
System.out.print("la longeur de votre phrase ou votre mot est de "+ iLongeur);
}
}
    