package objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojaDeCarros {
	
	public static Scanner scan = new Scanner(System.in);
	
	List<Carro> ListaDeCarros = new ArrayList<>();
	
	Integer id=0;
	double saldoLoja=0;
	
	public void adicionarCarro() {
		
		id++;
		
		System.out.println("Insira a marca do carro: ");
		String marca = scan.nextLine();
		
		System.out.println("Insira o modelo do carro: ");
		String modelo = scan.nextLine();
		
		System.out.println("Insira o ano de fabricação do carro: ");
		int anoFabricacao = scan.nextInt();
		scan.nextLine(); // para limpar o teclado
		
		System.out.println("Insira a cor do carro: ");
		String cor = scan.nextLine();
		
		System.out.println("Insira a quilometragem do carro: ");
		double quilometragem = scan.nextDouble();
		
		System.out.print("Insira a preço do carro: \nR$");
		double preco = scan.nextDouble();
		
		Carro carro = new Carro(id, marca, modelo, anoFabricacao, cor, quilometragem, preco);
		ListaDeCarros.add(carro);
		scan.nextLine(); // para limpar o teclado
		
		System.out.println("");
		
	}
	
	public void exibirListaDeCarros() {
		
		for (Carro carro : ListaDeCarros) 
		{
			System.out.println(carro);
		}
		
		System.out.println("");
		
	}
	
	public void excluirCarro() {
		
		System.out.println("Insira o modelo do carro que deseja excluir: ");
		String modeloCarroExcluido = scan.nextLine();
		
		System.out.println("Insira ID do carro que deseja excluir: ");
		Integer idCarroExcluido = scan.nextInt();
		scan.nextLine(); // para limpar o teclado
		
		boolean carroEncontrado=false;
		
		for (Carro carro : ListaDeCarros) 
		{
			if(carro.getModelo().equalsIgnoreCase(modeloCarroExcluido))
			{
				if(carro.getId().equals(idCarroExcluido))
				{
					System.out.println("O " + modeloCarroExcluido + " com ID " + idCarroExcluido + " foi excluido \n");
					ListaDeCarros.remove(carro);
					carroEncontrado=true;
					break;
				}
			}
		}
		
		if(!carroEncontrado)
		{
			System.out.println("O " + modeloCarroExcluido + " com ID " + idCarroExcluido + " não foi encontrado \n");
		}
		
	}
	
	public void pesquisarMarca() {
		
		System.out.println("Insira a marca que deseja pesquisar: ");
		String marcaCarroPesquisado = scan.nextLine();
		
		boolean carroEncontrado=false;
		
		for (Carro carro : ListaDeCarros) 
		{
			if(carro.getMarca().equalsIgnoreCase(marcaCarroPesquisado))
			{
				System.out.println(carro);
				carroEncontrado=true;
			}
		}
		System.out.println("");
		
		if(!carroEncontrado)
		{
			System.out.println("nenhum carro " + marcaCarroPesquisado + " foi encontrado \n");
		}
		
	}
	
	public void pesquisarModelo() {
		
		System.out.println("Insira a modelo que deseja pesquisar: ");
		String modeloCarroPesquisado = scan.nextLine();
		
		boolean carroEncontrado=false;
		
		for (Carro carro : ListaDeCarros) 
		{
			if(carro.getModelo().equalsIgnoreCase(modeloCarroPesquisado))
			{
				System.out.println(carro);
				carroEncontrado=true;
			}
		}
		System.out.println("");
		
		if(!carroEncontrado)
		{
			System.out.println("nenhum carro " + modeloCarroPesquisado + " foi encontrado \n");
		}
		
	}
	
	public void exibirSaldoLoja() {
		
		System.out.println("Saldo: R$" + saldoLoja + "\n");
		
	}
	
	public void adicionarSaldo() {
		
		System.out.println("Saldo Atual: R$" + saldoLoja);
		System.out.print("Insira o valor que deseja adicionar ao saldo: \nR$");
		saldoLoja+=scan.nextDouble();
		scan.nextLine(); // para limpar o teclado
		System.out.println("Novo Saldo: R$" + saldoLoja + "\n");
		
	}
	
	public void venderCarro() {
		
		System.out.println("Insira o modelo do carro que deseja vender: ");
		String modeloCarroVendido = scan.nextLine();
		
		System.out.println("Insira ID do carro que deseja vender: ");
		Integer idCarroVendido = scan.nextInt();
		scan.nextLine(); // para limpar o teclado
		
		boolean carroEncontrado=false;
		boolean menu=true;
		
		for (Carro carro : ListaDeCarros) 
		{
			if(carro.getModelo().equalsIgnoreCase(modeloCarroVendido))
			{
				if(carro.getId().equals(idCarroVendido))
				{
					int escVenda=0;
					while(menu)
					{
						System.out.println("O carro foi vendido pelo preço cadastrado? \n[1] Sim \n[2] Não \nSua escolha: ");
						carroEncontrado=true;
						escVenda = scan.nextInt();
						scan.nextLine(); // para limpar o teclado
						
						if(escVenda==1)
						{
							saldoLoja+=carro.getPreco();
							System.out.println("Novo Saldo: R$" + saldoLoja + "\n");
							menu=false;
							ListaDeCarros.remove(carro);
						}
						else if(escVenda==2)
						{
							System.out.print("Por quanto o " + modeloCarroVendido + " com ID " + idCarroVendido + " foi vendido? \nR$");
							saldoLoja+=scan.nextDouble();
							scan.nextLine(); // para limpar o teclado
							System.out.println("Novo Saldo: R$" + saldoLoja + "\n");
							menu=false;
							ListaDeCarros.remove(carro);
						}
						else
						{
							System.out.println("Escolha Invalida! \n");
						}
					}
				}
			}
		}
		
		if(!carroEncontrado)
		{
			System.out.println("O " + modeloCarroVendido + " com ID " + idCarroVendido + " não foi encontrado \n");
		}
		
	}
	
	
}
