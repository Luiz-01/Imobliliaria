
public abstract class Imovel {
	private String endereco;
	private Double preco;

	public Imovel(Imovel imovel) {
		this.endereco = imovel.getEndereco();
		this.preco = imovel.getPreco();
	}

	public Imovel(String endereco, Double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public double calcularValorImóvel() {
		return this.preco;
	}

}
