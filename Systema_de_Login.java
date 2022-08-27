import java.util.Scanner;

public class Q1 {
	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu Nome: ");
		String Nome = ler.next();
		
		System.out.println("Digite Seu Sobrenome: ");
		String Sobre = ler.next();
		
		System.out.println("Digite sua Idade: ");
		int idade = ler.nextInt();
		
		
		System.out.println("Digite seu Id: ");
		String id = ler.next();
		
		System.out.println("Digite sua Senha: ");
		int pass = ler.nextInt();
		
		if(id.equals("zeecaixao06") && pass == 1235813) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Usuario ou Senha está errado!");
			
		}
	}

}
