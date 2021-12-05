import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgramaImobiliaria {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// e) Crie um programa principal onde são criados dois imóveis, um novo e outro
		// antigo e impresso o endereço e seus respectivos valores.

		System.out.println("--- Criação do Imóvel Antigo ---");
		System.out.println("Informe o endereço do imóvel: ");
		String endereco = scn.nextLine();
		System.out.println("Informe o preço inicial do imóvel: ");
		Double preco = scn.nextDouble();
		scn.nextLine();
		System.out.println("Informe um desconto em R$ para esse imóvel: ");
		Double valor = scn.nextDouble();
		scn.nextLine();

		Imovel imovelAntigo = new ImovelAntigo(endereco, preco, valor);

		System.out.println("--- Criação do Imóvel Novo ---");
		System.out.println("Informe o endereço do imóvel: ");
		endereco = scn.nextLine();
		System.out.println("Informe o preço inicial do imóvel: ");
		preco = scn.nextDouble();
		scn.nextLine();
		System.out.println("Informe um adicional em R$ para esse imóvel: ");
		valor = scn.nextDouble();
		scn.nextLine();

		Imovel imovelNovo = new ImovelNovo(endereco, preco, valor);

		System.out.println("\nValor alterado do imóvel antigo: " + df.format(imovelAntigo.calcularValorImóvel()));
		System.out.println("Valor alterado do imóvel novo: " + df.format(imovelNovo.calcularValorImóvel()));

		// f) Imprima na tela o endereço do imóvel mais barato.
		System.out.println("\nEndereço do imóvel mais barato: ");
		if (imovelAntigo.calcularValorImóvel() < imovelNovo.calcularValorImóvel())
			System.out.println(imovelAntigo.getEndereco());
		else
			System.out.println(imovelNovo.getEndereco());

		scn.close();
	}
}
