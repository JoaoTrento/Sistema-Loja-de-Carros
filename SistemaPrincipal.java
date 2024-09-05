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
			System.out.println("[1] Adicionar Carro \n"
					+ "[2] Exibir Lista de Carros \n"
					+ "[3] Excluir Carro do Sistema \n"
					+ "[4] Pesquisar Marca \n"
					+ "[5] Pesquisar Modelo \n"
					+ "[6] Vender Carro \n"
					+ "[7] Consultar Saldo \n"
					+ "[8] Adicionar Saldo \n"
					+ "[9] Sair \nSua Escolha: ");
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
					lojadecarros.pesquisarMarca();
					break;
				case 5:
					lojadecarros.pesquisarModelo();
					break;
				case 6:
					lojadecarros.venderCarro();
					break;
				case 7:
					lojadecarros.exibirSaldoLoja();
					break;
				case 8:
					lojadecarros.adicionarSaldo();
					break;
				case 9:
					menu=false;
					break;
				default:
					System.out.println("\nOpção Invalida:");
			}
		}

	}

}
