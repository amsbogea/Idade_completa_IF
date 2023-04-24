package idade_completa_IF;

import java.util.Scanner;

public class Idade_completa_IF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite o dia de nascimento (dd).");
		int diaNascimento = input.nextInt();
		
		System.out.println("Digite o mês de nascimento (mm)");
		int mesNascimento = input.nextInt();
		
		System.out.println("Digite o ano de nascimento (aaaa)");
		int anoNascimento = input.nextInt();
		
		System.out.println("Digite o dia atual (dd).");
		int diaAtual = input.nextInt();
		
		System.out.println("Digite o atual (mm)");
		int mesAtual = input.nextInt();
		
		System.out.println("Digite o ano atual (aaaa)");
		int anoAtual = input.nextInt();
		
		int idadeAno = anoAtual - anoNascimento;
		int idadeMes = mesAtual - mesNascimento;
		int idadeDia = diaAtual - diaNascimento;
		
		if (mesNascimento > mesAtual) {
			idadeAno = idadeAno -1;
			idadeMes = idadeMes + 12;
		}
			
			
		if (diaNascimento > diaAtual) {
			idadeMes = idadeMes -1;
			idadeDia = idadeDia + 30;
		}
			
		System.out.println("A idade da pessoa é de " + idadeAno + " anos, " + idadeMes + " meses e " + idadeDia + " dias.");
	}

}
