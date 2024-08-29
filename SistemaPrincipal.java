package principal;

import java.util.Scanner;

import objetos.LojaDeCarros;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		LojaDeCarros lojadecarros = new LojaDeCarros();
		
		boolean menu=true;
		int esc=0;
		
		while(menu)
		{
			System.out.println("[1] Adicionar Carro \n[2] Exibir Lista de Carros \n[3] Excluir Carro do Sistema \n[4] Sair \nSua Escolha: ");
			esc = scan.nextInt();
			
			switch(esc)
			{
				case 1:
					lojadecarros.adicionarCarro();
					break;
				case 2:
					lojadecarros.exibirListaDeCarros();
					break;
				case 3:
					lojadecarros.excluirCarro();
					break;
				case 4:
					menu=false;
					break;
				default:
					System.out.println("\nOpção Invalida:");
			}
		}

	}

}
