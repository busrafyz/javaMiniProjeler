

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  //kdv tutar� hesaplama
		    double kdvoran = 0.18;
		    double kdvsiztutar;
		    Scanner input = new Scanner(System.in);
		    System.out.println("�r�n tutar�n� giriniz:");
		    kdvsiztutar = input.nextDouble();
		    double kdvlitutar = (kdvoran * kdvsiztutar) + kdvsiztutar; 
		    System.out.println("KDV'siz tutar: " + kdvsiztutar);
		    System.out.println("KDV oran�: " + kdvoran);
		    System.out.println("KDV'li tutar: " + kdvlitutar);	
		}
	}


