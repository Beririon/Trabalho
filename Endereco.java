
public class Endereco {
	
	String rua;
	String numero;
	String bairro;
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
	@Override
	public String toString() {
		return "rua = " + rua + ", numero da quadra = " + numero + ", bairro = " + bairro;
	}
	
}
