
//Класическото тесте карти се състои от 13 различни вида карти 
//съответно 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. 
//Направете програма, която приема от конзолата един символ и принтира
//"Валидна карта", ако символът представлява валидна карта,
//и съответно принтира "Невалидна карта", ако символът е на невалидна карта. 

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// tuk zashto e Scanner scanner, a ne Scanner in ????
		// kak se zatvarq sccaner
		System.out.println("Въведете карта:");

		String card = scanner.nextLine();
		// tuk sushti ne e in.nextLine(); ???

		switch (card) {
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		case "6":
			break;
		case "7":
			break;
		case "8":
			break;
		case "9":
			break;
		case "10":
			break;
		case "J":
			break;
		case "Q":
			break;
		case "K":
			break;
		case "A":
			break;

		}

		if (card != "2" + "3" + "4" + "5" + "6" + "7" + "8" + "9" + "10" + "J" + "Q" + "K" + "A") {
			System.out.println("not valid card!");
		}
		System.out.println("valid card!");
	}
}
// ne moga da q napravq taka che da ne izliza i "not valid card" pri validna
// karta i izlizat i dvete :(
