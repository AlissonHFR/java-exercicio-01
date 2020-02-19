package valores;

import java.util.Scanner;

public class Main {

	
	
	private static Scanner ler;

	public static void leitura(String args[]){
		
		ler = new Scanner(System.in);
		
			int n1,n2,n3,n4;
			
			int i = 1;
			
			while( i < 5) {
				System.out.println("Digite um valor: ");
				switch(i) {
				case 1: n1 = ler.nextInt();
					break;
				case 2: n2 = ler.nextInt();
					break;
				case 3: n3 = ler.nextInt();
					break;
				case 4:	n4 = ler.nextInt();
					break;
				}
				
				i++;
			}
			 
			 
			 
		
		
	}
	
	public static void calculo() {
		
		int maior, menor;
		
		if(maior > 50) {
			System.out.println("O menor valor é: " + menor);
			System.out.println("O maior valor é: " + maior);
			System.out.println("Valor muito alto");
		}else {
			System.out.println("O menor valor é: " + menor);
			System.out.println("O maior valor é: " + maior);
			System.out.println("Valor normal");
		}
		
	}

}
