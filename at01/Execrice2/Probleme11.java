import java.util.Scanner;

public class Probleme11 {
   


    public static long calculerFactorielle(int nombre) {
        long resultat = 1;
        for (int i = 1; i <= nombre; i++) {
            resultat *= i;
        }
        return resultat;
    }


    public static void main(String[] args) 
    {
     Scanner lectureClavier = new Scanner(System.in);
    System.out.print("Saisissez votre nombre: ");
    int nombre=lectureClavier.nextInt();

    System.out.print(calculerFactorielle(nombre));
    }
}
