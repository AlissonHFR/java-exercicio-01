package valores;

import java.util.Scanner;

public class Main {
	private static Scanner ler;

	public static void leitura(){
		
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
			
			calculo c = new calculo(n1,n2,n3,n4);
	}
	
	public static void calculo(int n1,int n2,int n3,int n4) {
		
		int maior, menor;
		
		maior = leitura();
		
		
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
