
public class ImovelNovo extends Imovel {
	private double adicionalPreco;

	public ImovelNovo(Imovel imovel, double adicionalPreco) {
		super(imovel);
		this.adicionalPreco = adicionalPreco;
	}

	public ImovelNovo(String endereco, Double preco, Double adicionalPreco) {
		super(endereco, preco);
		this.adicionalPreco = adicionalPreco;
	}

	public double getAdicionalPreco() {
		return adicionalPreco;
	}

	public void setAdicionalPreco(double adicionalPreco) {
		this.adicionalPreco = adicionalPreco;
	}

	@Override
	public double calcularValorImóvel() {
		return this.getPreco() + this.getAdicionalPreco();
	}

}
