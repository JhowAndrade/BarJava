package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill totalBill = new Bill();
		
		System.out.printf("SEXO: ");
		totalBill.gender = sc.next().charAt(0);
		System.out.printf("Quantidade de cerveja: ");
		totalBill.beer = sc.nextInt();
		System.out.printf("Quantidade refrigerante: ");
		totalBill.softDrink = sc.nextInt();	
		System.out.printf("Quantidade de espetinhos: ");
		totalBill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO: ");
		
		System.out.printf("Consumo = R$ %.2f\n", totalBill.feeding());
		
		if(totalBill.cover() == 0 ) {
			System.out.println("Isento de Couvert");
		}else {
			System.out.printf("Couvert = R$ %.2f\n", totalBill.cover());
		}
		
		if(totalBill.ticket() == 10) {
			System.out.printf("Ingresso = R$ %.2f\n", totalBill.ticket());
		}else {
			System.out.printf("Ingesso = R$ %.2f\n", totalBill.ticket());
		}
		
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f\n", totalBill.total());
		
		sc.close();		

	}

}
