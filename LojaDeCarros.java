package objetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojaDeCarros {
	
	public static Scanner scan = new Scanner(System.in);
	
	List<Carro> ListaDeCarros = new ArrayList<>();
	
	public void adicionarCarro() {
		
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
		
		Carro carro = new Carro(marca, modelo, anoFabricacao, cor, quilometragem, preco);
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
		
		System.out.println("Insira o ano do carro que deseja excluir: ");
		int anoCarroExcluido = scan.nextInt();
		scan.nextLine(); // para limpar o teclado
		
		System.out.println("Insira a cor do carro que deseja excluir: ");
		String corCarroExcluido = scan.nextLine();
		
		boolean carroEncontrado=false;
		
		for (Carro carro : ListaDeCarros) 
		{
			if(carro.getModelo().equalsIgnoreCase(modeloCarroExcluido))
			{
				if(carro.getAnoFabricacao() == anoCarroExcluido)
				{
					if(carro.getCor().equalsIgnoreCase(corCarroExcluido))
					{
						System.out.println("O " + modeloCarroExcluido + " " + anoCarroExcluido + " " + corCarroExcluido + " foi excluido! \n");
						carroEncontrado=true;
						ListaDeCarros.remove(carro);
					}
				}
			}
		}
		
		if(!carroEncontrado)
		{
			System.out.println("O " + modeloCarroExcluido + " " + anoCarroExcluido + " " + corCarroExcluido + " não foi encontrado! \n");
		}
	}
	
	
}
