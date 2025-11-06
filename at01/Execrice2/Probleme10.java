import java.util.Scanner;

public class Probleme10 {
    // Créer un méthodes
    public static int PlusGrand(int iNombre1, int iNombre2) 
    {
        return (iNombre1>iNombre2)? iNombre1 :iNombre2;
    }

    public static void main(String[] args) 
    {
    Scanner lectureClavier = new Scanner(System.in);
    System.out.print("Saisissez le nombre 1 : ");
    int iNombre1= lectureClavier.nextInt();

    System.out.print("Saisissez le nombre 2 : ");
    int iNombre2= lectureClavier.nextInt();

    int PlusGrand=PlusGrand(iNombre1, iNombre2);
    System.out.print("Le plus grand des deux est "+ PlusGrand);
    }
}