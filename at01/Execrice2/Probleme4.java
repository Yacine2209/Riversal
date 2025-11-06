package Execrice2;

import java.util.Scanner;

public class Probleme4
{

public static void main(String[] args)
{
    double dReponse=-1;
    Scanner lectureClavier=new Scanner(System.in);
    
    //Afficher ce message tant que le nombre saisie n'est pas entre 0 et 100
   do {
            System.out.print("Veuillez entrer un nombre entre 0 et 100 : ");
            dReponse= lectureClavier.nextDouble(); 

    } while (dReponse < 0 || dReponse > 100); 
    
    System.out.print("Votre nombre est entre 0 et 100");

        
}
}



