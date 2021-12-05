
public class ImovelAntigo extends Imovel {
	private double descontoPreco;

	public ImovelAntigo(Imovel imovel, double descontoPreco) {
		super(imovel);
		this.descontoPreco = descontoPreco;
	}

	public ImovelAntigo(String endereco, Double preco, Double descontoPreco) {
		super(endereco, preco);
		this.descontoPreco = descontoPreco;
	}

	public double getDescontoPreco() {
		return descontoPreco;
	}

	public void setDescontoPreco(double descontoPreco) {
		this.descontoPreco = descontoPreco;
	}

	@Override
	public double calcularValorImóvel() {
		return this.getPreco()-this.getDescontoPreco();
	}
	
	

}
