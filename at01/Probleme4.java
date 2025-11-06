import java.util.Scanner;

public class Probleme4
{

public static void main(String[] args)
{

    //Calculer l'éleve si l'élève a reussi
Scanner lectureClavier=new Scanner(System.in);
System.out.print("Entrez Votre note de maths : ");
double dNote=lectureClavier.nextDouble();


    if(dNote<60)
{
System.out.print("Vous avez échoué");
}
    else if (dNote>60)
{
    System.out.print("Vous avez réussi");
}

}
}