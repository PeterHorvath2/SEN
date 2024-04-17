package coolbaconman4000;
import java.util.Scanner;
public class BeaaaamCauteTuJeGogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zadaj A:");
		double hodnotaA = sc.nextDouble();
		System.out.println("Zadaj B:");
		double hodnotaB = sc.nextDouble();
		
		if (hodnotaA > hodnotaB) {
			System.out.println("A je vacsie");
		}else if (hodnotaA < hodnotaB) {
			System.out.println("B je vacsie");
		}else  {
			System.out.println("rovnaju sa");
		}
		sc.close();
	}

}
