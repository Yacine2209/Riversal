package Execrice2;

import java.util.Scanner;

public class Probleme1
{

public static void main(String[] args)
{
    
Scanner lectureClavier=new Scanner(System.in);

//Afficher la phrase saisie en lettre majuscules
System.out.print("Saisiez un mot ou un phrase ");

String sMot=lectureClavier.nextLine();
String sMaj=sMot.toUpperCase();

System.out.print(sMaj);
}
}