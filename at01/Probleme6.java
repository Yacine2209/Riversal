import java.util.Scanner;

public class Probleme6
{

public static void main(String[] args)
{
Scanner lectureClavier=new Scanner(System.in);

//Saisir le nom/longeur et Largeur
System.out.print("Veuillez saisir votre nom :");
String sNom=lectureClavier.nextLine();

System.out.print("Entrez le premier nombre : ");
double dNombre1=lectureClavier.nextDouble();


System.out.print("Entrez le deuxieme nombre : ");
double dNombre2=lectureClavier.nextDouble();

    if(dNombre1>dNombre2)
{
System.out.print(dNombre1+"est plus grand ");
}
    else if(dNombre2>dNombre1)
{
System.out.print(dNombre2+"est plus grand\n");
}

int iReponse;
double dPrixMetrecarre=0;

do {
    
    System.out.print("Quels types de plancher voulez-vous ?\n");

    System.out.print("1 - Chêne \n");
    System.out.print("2 - Érable\n");
    System.out.print("3 - Pin\n");


    iReponse=lectureClavier.nextInt();
    dPrixMetrecarre=0;

} while (iReponse != 1 && iReponse != 2 && iReponse !=3);


if (iReponse==1) 
{
dPrixMetrecarre=5;
}   

else if (iReponse==2) 
{
dPrixMetrecarre=12;
}

else if (iReponse==3) 
{
dPrixMetrecarre=10;
}

else
{
System.out.print("Vous n'avez pas choisit le bon type de plancher.");
return;
}

System.out.print("Veuillez saisir la longeur :\n");
double dLongeur=lectureClavier.nextDouble();

System.out.print("Veuillez saisir la largeur :\n");
double dLargeur=lectureClavier.nextDouble();

//Calculer l'aire
double dAire;
dAire= dLongeur*dLargeur;

//Calculer le total du prix du planger
double dPrixTotal;
dPrixTotal= dPrixMetrecarre*dAire;

System.out.print(sNom+ " la sufrace de planger est de "+ dAire +"et le prix du plancher est de "+ dPrixTotal );

}

}


