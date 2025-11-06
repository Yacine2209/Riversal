package Execrice2;

import java.util.Scanner;

public class Probleme6
{

public static void main(String[] args)
{
 Scanner lectureClavier=new Scanner(System.in);
 int max=Integer.MIN_VALUE;
 int min=Integer.MAX_VALUE;
 int iSomme=0;
 int iValeur;
 int n=0;
 //
  do {
    System.out.print("Saisisez des valeurs : ");
            iValeur = lectureClavier.nextInt();

             if (iValeur!=0) {
                if (iValeur>max) {
                     max=iValeur;
                }
                if (iValeur<min) {
                    min=iValeur;
                }
               iSomme += iValeur;
               n++;
            }
    } while (iValeur != 0);

if (max == Integer.MIN_VALUE) {
            System.out.println("Aucune valeur saisie.");
        } else {
            System.out.println("La plus grande valeur est : " + max);
            System.out.println("La plus petite valeur est : " + min);
        }

        lectureClavier.close();

double dMoyenne= iSomme/n;
     System.out.print("La moyenne est de "+ dMoyenne);
 }
    
 
  
}
