package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner t = new Scanner(System.in);
		
		System.out.print("What is the speed of the vehicle? ");
		int speed = t.nextInt();
		
		if(speed > 80) {
			System.out.println("Fined!");
			System.out.println("You exceeded the 80km/h limit.");
			int trafficTicket = (speed - 80) * 7;
			System.out.printf("You will be fined in %d dollars%n", trafficTicket);
			System.out.println("Have a nice day!");
		} else {
			System.out.println("Have a nice day, drive carefully!");
		}
		
	}

}
