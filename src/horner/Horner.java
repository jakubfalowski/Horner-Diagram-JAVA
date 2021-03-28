// zadanie Metody numeryczne lab 1, 1/3 Jakub Fałowski 2 rok informatyki URz, schemat Hornera
package horner;
import java.util.Scanner;
import java.lang.Math.*;
public class Horner {

    public static void main(String[] args) {
        
        Scanner wybor = new Scanner(System.in);
        System.out.println("Wybierz program \n 0 - Obliczanie wartości w punkcie \n 1 - Dzielenie dwumianu  ");
        int l_wyboru = wybor.nextInt();
            
        int stopienpoczatkowy = 0;
        while(stopienpoczatkowy < 2){
            Scanner scan = new Scanner(System.in);
            System.out.println("\nPodaj stopień wielomianu ");
            stopienpoczatkowy = scan.nextInt();
        }
        int stopien = stopienpoczatkowy;
        
        int[] wspolczynnik = new int[stopien+1];
        int[] wynik = new int[stopien+2];
        
        while(stopien >= 0){
            Scanner scan3 = new Scanner(System.in);
            System.out.println("\nPodaj liczbę ... x^"+stopien);
            wspolczynnik[stopien] = scan3.nextInt();       
            stopien--;
        }
        if(l_wyboru == 0) wartosc_w_punkcie(stopienpoczatkowy,wspolczynnik,wynik,stopien);
        if(l_wyboru == 1) dzielenie_dwumianu(stopienpoczatkowy,wspolczynnik,wynik,stopien);
    }
    public static void wartosc_w_punkcie(int stopienpoczatkowy,int[] wspolczynnik, int[] wynik, int stopien){
        
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
    public static void dzielenie_dwumianu(int stopienpoczatkowy, int[] wspolczynnik, int[] wynik, int stopien){
        int dziel = 0;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("\nPodaj współczynnik b dwumianu ");
        dziel = scan2.nextInt();
        
        while(dziel == 0){
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Podaj dzielnik wielomianu ");
            dziel = scan3.nextInt();
        }
        
        System.out.print("W(x)=(x-"+dziel+")*");
        while(stopienpoczatkowy >= 0){
            if(stopienpoczatkowy > 0){
                wynik[stopienpoczatkowy] = wynik[stopienpoczatkowy+1]*dziel+wspolczynnik[stopienpoczatkowy];
                System.out.print("("+wynik[stopienpoczatkowy]+"x^"+(stopienpoczatkowy-1)+")+ ");
            }
            else{
                int reszta = dziel*wynik[1]+wspolczynnik[0];
                System.out.println("Reszta: "+reszta);
            }
                stopienpoczatkowy--;
        }
    }
}
