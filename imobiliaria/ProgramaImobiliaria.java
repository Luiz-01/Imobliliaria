import java.text.DecimalFormat;
import java.util.Scanner;

public class ProgramaImobiliaria {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		// e) Crie um programa principal onde s�o criados dois im�veis, um novo e outro
		// antigo e impresso o endere�o e seus respectivos valores.

		System.out.println("--- Cria��o do Im�vel Antigo ---");
		System.out.println("Informe o endere�o do im�vel: ");
		String endereco = scn.nextLine();
		System.out.println("Informe o pre�o inicial do im�vel: ");
		Double preco = scn.nextDouble();
		scn.nextLine();
		System.out.println("Informe um desconto em R$ para esse im�vel: ");
		Double valor = scn.nextDouble();
		scn.nextLine();

		Imovel imovelAntigo = new ImovelAntigo(endereco, preco, valor);

		System.out.println("--- Cria��o do Im�vel Novo ---");
		System.out.println("Informe o endere�o do im�vel: ");
		endereco = scn.nextLine();
		System.out.println("Informe o pre�o inicial do im�vel: ");
		preco = scn.nextDouble();
		scn.nextLine();
		System.out.println("Informe um adicional em R$ para esse im�vel: ");
		valor = scn.nextDouble();
		scn.nextLine();

		Imovel imovelNovo = new ImovelNovo(endereco, preco, valor);

		System.out.println("\nValor alterado do im�vel antigo: " + df.format(imovelAntigo.calcularValorIm�vel()));
		System.out.println("Valor alterado do im�vel novo: " + df.format(imovelNovo.calcularValorIm�vel()));

		// f) Imprima na tela o endere�o do im�vel mais barato.
		System.out.println("\nEndere�o do im�vel mais barato: ");
		if (imovelAntigo.calcularValorIm�vel() < imovelNovo.calcularValorIm�vel())
			System.out.println(imovelAntigo.getEndereco());
		else
			System.out.println(imovelNovo.getEndereco());

		scn.close();
	}
}
