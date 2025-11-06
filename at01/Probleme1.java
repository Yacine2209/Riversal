import java.util.Scanner;

public class Probleme1 {
public static void main(String[] args)
{

Scanner lectureClavier=new Scanner(System.in);
System.out.print("Entrez le premier nombre");
double dNombre1=lectureClavier.nextDouble();

// Afficher et comparer deux nombre
System.out.print("Entrez le deuxieme nombre");
double dNombre2=lectureClavier.nextDouble();

if(dNombre1>dNombre2)
{
System.out.print(dNombre1+" est plus grand que "+dNombre2);
}else if(dNombre2>dNombre1)
{
System.out.print(dNombre2+" est plus grand que "+dNombre1);
}
}
}
//HAHAHHA
