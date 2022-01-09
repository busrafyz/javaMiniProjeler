

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  //kdv tutarý hesaplama
		    double kdvoran = 0.18;
		    double kdvsiztutar;
		    Scanner input = new Scanner(System.in);
		    System.out.println("Ürün tutarýný giriniz:");
		    kdvsiztutar = input.nextDouble();
		    double kdvlitutar = (kdvoran * kdvsiztutar) + kdvsiztutar; 
		    System.out.println("KDV'siz tutar: " + kdvsiztutar);
		    System.out.println("KDV oraný: " + kdvoran);
		    System.out.println("KDV'li tutar: " + kdvlitutar);	
		}
	}


