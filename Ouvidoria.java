
public class Ouvidoria {
	
	private Reclamacao[] reclama = new Reclamacao[100];
	
	
	public void adicionarReclamacao(Reclamacao novaReclama){
		for(int i =0; i < reclama.length; i++){
			if(reclama[i] == null){
				reclama[i] = novaReclama;
				break;
			}
		}
	}

	public Reclamacao recuperarReclamacao(int id){
		for (int i =0; i <reclama.length; i++){
			Reclamacao reclama2 = reclama[i];
			if(reclama2 != null && reclama2.getId() == id){
				return reclama2;
			}
		}
	
		return null;
	}
	
	public void excluirReclamacao(int id){
		for(int i =0; i<reclama.length;i++){
			Reclamacao reclama2 = reclama[i];
			if(reclama2.getId() == id){
				reclama[i] = null;
				break;
			}
		}
	}
	public Buraco situacaoReclamacao(int id, String custo, String hora){
		for (int i =0; i <reclama.length; i++){
			Reclamacao reclama2 = reclama[i];
			if(reclama2 != null && reclama2.getId() == id){
				reclama2.buraco.setHoraConserto(hora);
				reclama2.buraco.setCustoConserto(custo);
				reclama2.buraco.setSituacao("Consertado");
				reclama[i] = reclama2;
				System.out.println("Conserto registrado com sucesso");
			}
		}
	
		return null;
	}
}
