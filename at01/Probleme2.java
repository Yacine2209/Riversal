import java.util.Scanner;

public class Probleme2
{

public static void main(String[] args)
{
    //Calculer le salaire de quelqu'un au 15 jours
    Scanner lectureClavier=new Scanner(System.in);
    System.out.print("Entrez Votre salaire");
    double salaire=lectureClavier.nextDouble();


    System.out.print("Entrez le nombre d'heure ");
    double heure=lectureClavier.nextDouble();

    double SalaireTotal= salaire*heure*2;

    System.out.print("le salaire est "+ SalaireTotal);

}

}

