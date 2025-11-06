import java.util.Scanner;

public class Probleme3
{



public static void main(String[] args)
{
   //Calculer la moyenne de deux Age
    Scanner lectureClavier=new Scanner(System.in);
    System.out.print("Entrez la premiere Age");
    double Age1=lectureClavier.nextDouble();

    System.out.print("Entrez la deuxieme Age");
    double Age2=lectureClavier.nextDouble();

    double moyenneAge = (Age1+Age2)/2;
    System.out.print("La moyenne est de" + moyenneAge);

}


}

