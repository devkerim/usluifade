import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int alt,us,total=1;
	System.out.println("Üssü alınacak sayıyı giriniz: ");
	alt = intscanner.nextInt();
	System.out.println("Üs olacak sayıyı giriniz: ");
	us = intscanner.nextInt();

	for(int i=0;i<us;i++){
	    total = total * alt;

    }
	if(alt<=0&&us<=0){System.out.println("Tanımsız ifade");}
	else {
		System.out.println("Sonuç: " + total);
	}


    }
}
