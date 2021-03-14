// zadanie Metody numeryczne lab 1, 1/3 Jakub Fałowski 2 rok informatyki URz, schemat Hornera
package horner;
import java.util.Scanner;
import java.lang.Math.*;
public class Horner {

    public static void main(String[] args) {
        
        int stopienpoczatkowy = 0;
        while(stopienpoczatkowy < 2){
            Scanner scan = new Scanner(System.in);
            System.out.println("\nPodaj stopień wielomianu ");
            stopienpoczatkowy = scan.nextInt();
        }
        int stopien = stopienpoczatkowy;
        
        int dziel = 0;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("\nPodaj współczynnik dwumianu ");
        dziel = scan2.nextInt();
        
        int[] wspolczynnik = new int[stopien+1];
        int[] wynik = new int[stopien+2];
        
        while(stopien >= 0){
            Scanner scan3 = new Scanner(System.in);
            System.out.println("\nPodaj liczbę ... x^"+stopien);
            wspolczynnik[stopien] = scan3.nextInt();       
            wynik[stopien] = wynik[stopien+1]*dziel+wspolczynnik[stopien];
            System.out.println("Reszta: "+wynik[stopien]);
            stopien--;
        }
        
        a(stopienpoczatkowy,wspolczynnik,wynik,stopien);
        b(stopienpoczatkowy,dziel,wspolczynnik,wynik,stopien);
    }
    public static void a(int stopienpoczatkowy,int[] wspolczynnik, int[] wynik, int stopien){
        
        Scanner scan3 = new Scanner(System.in);
        System.out.println("\nPodaj punkt p ");
        int p = scan3.nextInt();
        int suma = 0;
        
        while(stopienpoczatkowy >= 0){
            double punktp = Math.pow(p,stopienpoczatkowy)*wspolczynnik[stopienpoczatkowy];
            suma += punktp;
            stopienpoczatkowy--;
        }
        System.out.println("W("+p+") = "+suma);
    }
    public static void b(int stopienpoczatkowy,int dziel, int[] wspolczynnik, int[] wynik, int stopien){
        
        while(dziel == 0){
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj dzielnik wielomianu ");
            dziel = scan2.nextInt();
        }
        System.out.println();
        System.out.print("W(x)=(x-"+dziel+")*");
        
        while(stopienpoczatkowy > 0){
            System.out.print("("+wynik[stopienpoczatkowy]+"x^"+(stopienpoczatkowy-1)+")+ ");
            stopienpoczatkowy--;
        }
    }
}
