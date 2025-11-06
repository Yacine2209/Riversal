package Execrice2;

import java.util.Scanner;

public class Probleme5
{

public static void main(String[] args)
{
   
    char cAlphabet;
// Affichage en ordre croissant (a à z)
     System.out.print("L'alphabet en ordre:");
for (cAlphabet = 'a'; cAlphabet <= 'z'; cAlphabet++)
    {
System.out.print(cAlphabet+" ");
    }

    
// Affichage en ordre décroissant (z à a)
System.out.print("L'alphabet a l'envers:");
for (cAlphabet = 'z'; cAlphabet>= 'a'; cAlphabet--)
    {
System.out.print(cAlphabet+" ");
    }
}
}
