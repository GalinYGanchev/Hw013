
//������������ ����� ����� �� ������ �� 13 �������� ���� ����� 
//��������� 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. 
//��������� ��������, ����� ������ �� ��������� ���� ������ � ��������
//"������� �����", ��� �������� ������������ ������� �����,
//� ��������� �������� "��������� �����", ��� �������� � �� ��������� �����. 

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// tuk zashto e Scanner scanner, a ne Scanner in ????
		// kak se zatvarq sccaner
		System.out.println("�������� �����:");

		String card = scanner.nextLine();
		// tuk sushto ne e in.nextLine(); ???

		switch (card) {
		case "2":
			System.out.println("valid card!");
			break;
		case "3":
			System.out.println("valid card!");
			break;
		case "4":
			System.out.println("valid card!");
			break;
		case "5":
			System.out.println("valid card!");
			break;
		case "6":
			System.out.println("valid card!");
			break;
		case "7":
			System.out.println("valid card!");
			break;
		case "8":
			System.out.println("valid card!");
			break;
		case "9":
			System.out.println("valid card!");
			break;
		case "10":
			System.out.println("valid card!");
			break;
		case "J":
			System.out.println("valid card!");
			break;
		case "Q":
			System.out.println("valid card!");
			break;
		case "K":
			System.out.println("valid card!");
			break;
		case "A":
			System.out.println("valid card!");
			break;
		default:
            System.out.println("not valid card!");
            break;	
		}
		

		}
		
	}


