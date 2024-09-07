package principal;

import java.util.Scanner;

import objetos.LojaDeCarros;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		LojaDeCarros lojadecarros = new LojaDeCarros();
		
		boolean menu=true;
		boolean menuInterno=true;
		int esc=0;
		int escInterna=0;
		
		while(menu)
		{
			System.out.println("Quem é você? \n[1] Cliente \n[2] Vendedor \n[3] Adimistrador \n[4] Sair \nSua escolha: ");
			esc = scan.nextInt();
			
			if(esc==1)
			{
				while(menuInterno)
				{
					System.out.println("[1] Exibir Lista de Carros \n"
							+ "[2] Pesquisar Marca \n"
							+ "[3] Pesquisar Modelo \n"
							+ "[4] Voltar Para o Menu Principal \nSua Escolha: ");
					escInterna = scan.nextInt();
					
					switch(escInterna)
					{
						case 1:
							lojadecarros.exibirListaDeCarros();
							break;
						case 2:
							lojadecarros.pesquisarMarca();
							break;
						case 3:
							lojadecarros.pesquisarModelo();
							break;
						case 4:
							menuInterno=false;
							break;
						default:
							System.out.println("\nOpção Invalida:");
					}
				}
			}
			else if(esc==2)
			{
				while(menuInterno)
				{
					System.out.println("[1] Adicionar Carro \n"
							+ "[2] Exibir Lista de Carros \n"
							+ "[3] Excluir Carro do Sistema \n"
							+ "[4] Pesquisar Marca \n"
							+ "[5] Pesquisar Modelo \n"
							+ "[6] Vender Carro \n"
							+ "[7] Voltar Para o Menu Principal \nSua Escolha: ");
					escInterna = scan.nextInt();
					
					switch(escInterna)
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
							menuInterno=false;
							break;
						default:
							System.out.println("\nOpção Invalida:");
					}
				}
			}
			else if(esc==3)
			{
				while(menuInterno)
				{
					System.out.println("[1] Adicionar Carro \n"
							+ "[2] Exibir Lista de Carros \n"
							+ "[3] Excluir Carro do Sistema \n"
							+ "[4] Pesquisar Marca \n"
							+ "[5] Pesquisar Modelo \n"
							+ "[6] Vender Carro \n"
							+ "[7] Consultar Saldo \n"
							+ "[8] Adicionar Saldo \n"
							+ "[9] Voltar Para o Menu Principal \nSua Escolha: ");
					escInterna = scan.nextInt();
					
					switch(escInterna)
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
							menuInterno=false;
							break;
						default:
							System.out.println("\nOpção Invalida:");
					}
				}
			}
			else if(esc==4)
			{
				System.out.println("Sistema Encerrado");
				menu=false;
				scan.close();
			}
			else
			{
				System.out.println("Escolha Invalida \n");
			}
			menuInterno=true;
		}
	}

}
