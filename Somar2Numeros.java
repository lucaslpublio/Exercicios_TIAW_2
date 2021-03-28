import java.util.*;

class Somar2Numeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		//DECLARACAO DE VARIAVEIS
		int num1, num2, soma;
		
		//LEITURAS
		System.out.println("Digite um número:");
		num1 = sc.nextInt();
		System.out.println("Digite mais um número:");
		num2 = sc.nextInt();
		
		//SOMAR
		soma = num1 + num2;
		
		//PRINTAR
		System.out.println("Soma: " +soma);
		//AUTO AVALIACAO
		System.out.println("Nota auto avaliação : 5");
		
	}
}
