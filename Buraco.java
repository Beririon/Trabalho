
public class Buraco {
	String tam;
	String local;
	String situacao;
	String horaConserto;
	String custoConserto;
	
	public String getTam() {
		return tam;
	}
	public void setTam(String tam) {
		this.tam = tam;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getHoraConserto() {
		return horaConserto;
	}
	public void setHoraConserto(String horaConserto) {
		this.horaConserto = horaConserto;
	}
	public String getCustoConserto() {
		return custoConserto;
	}
	public void setCustoConserto(String custoConserto) {
		this.custoConserto = custoConserto;
	}
	@Override
	public String toString() {
		return "Buraco: \nTamanho = " + tam + "\nLocal = " + local + "\nSituação = " + situacao + "\nHora do conserto = " + horaConserto
				+ "\nCusto do conserto = " + custoConserto + "\n";
	}
	
}
