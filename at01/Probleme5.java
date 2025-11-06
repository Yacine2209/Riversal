import java.util.Scanner;

public class Probleme5
{

public static void main(String[] args)
{

// Rabais de 25%
Scanner lectureClavier=new Scanner(System.in);
System.out.print("Entrez le montant de votre achat");
double dMontant=lectureClavier.nextDouble();


double dRabais=25.0;

double dMontantRabais = (dMontant*dRabais)/100;

double dMontantFinal= dMontant-dMontantRabais;

System.out.print("Votre total est de "+dMontantFinal+" apres le rabais");
}
}