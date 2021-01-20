import java.util.Scanner;
class liczeniel {
 	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
        System.out.print("podaj imie");
        String a = scan.nextLine();
        int dlugosc = a.length();
        System.out.print("dlugosc imienia = "+dlugosc);
        
        System.out.print("podaj nazwisko");
        String b = scan.nextLine();
        int dlugosc2 = b.length();
        System.out.print("dlugosc nazwiska = "+dlugosc2);

 	}
}