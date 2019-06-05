import java.util.Date;
import java.text.SimpleDateFormat;
public class Reclamacao {
	private	int id;
	private Date data;
	private Endereco endereco;
	public Buraco buraco;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Buraco getBuraco() {
		return buraco;
	}
	public void setBuraco(Buraco buraco) {
		this.buraco = buraco;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getDataFormatado(){
		if (data==null){
			return "Não existe data cadastrada";
		}else{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String srt = sdf.format(data);
			return srt;
		}
		
	}
	
	@Override
	public String toString() {
		return "Reclação: " + id + "\nData: " + getDataFormatado() + "\nEndereço: " + endereco + "\nBuraco: " + buraco;
	}
	

	
	
	
	
	
}
