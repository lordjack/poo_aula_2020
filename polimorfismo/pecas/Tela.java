package polimorfismo.pecas;

public class Tela {
	double tamanho;
	String resolucao;

	public Tela(double tamanho, String resolucao) {
		this.tamanho = tamanho;
		this.resolucao = resolucao;
	}

	public Tela() {
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

}
