import java.util.Scanner;

public class EncademanetoEstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {//Esse trecho de codigo quer dizer que se hora for menor que 12 aparecera mensagem de Bom dia!
			System.out.println("Bom dia");
		}
		
		else if (hora < 18) {
			System.out.println("Boa tarde!");
				
		}
		else {
			System.out.println("Boa noite!");
		}
		
		
		sc.close();


	}

}
