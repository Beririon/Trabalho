
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		Ouvidoria ouvidoria = new Ouvidoria();
		Endereco endere�o = new Endereco();
		Buraco buraco = new Buraco();
		
		int harry = 0;
		Scanner leitura = new Scanner(System.in);
		do{
			System.out.println("Digite o n�mero da op��o desejada:");
			System.out.println("1 - Registrar reclama��o\n"
					+ "2 - Excluir reclama��on\n"
					+ "3 - Consultar reclama��o\n"
					+ "4 - Registrar conserto\n"
					+ "5 - Encerrar");
			/*harry = op��o escolhida*/		
			harry = leitura.nextInt();
			switch (harry) {
			case 1:
				Reclamacao reclamacao = new Reclamacao();
				Random random = new Random();
				reclamacao.setId(random.nextInt(100));
				reclamacao.setData(new Date());
				System.out.println("Favor fornecer as seguintes informa��es na mesma sequ�ncia:");
				System.out.print("Endere�o contendo rua, n�mero da quadra e bairro.\nTamanho do buraco de 0 a 10 e sua localidade (rua ou cal�ada).\n");
				String rua = leitura.next();
				String numero = leitura.next();
				String bairro = leitura.next();
				String tam = leitura.next();
				String local = leitura.next();
				endere�o.setRua(rua);
				endere�o.setNumero(numero);
				endere�o.setBairro(bairro);
				buraco.setTam(tam);
				buraco.setLocal(local);
				reclamacao.setBuraco(buraco);
				reclamacao.setEndereco(endere�o);
				System.out.println("Reclama��o registrada com sucesso, a ID da reclama��o �: " + reclamacao.getId());
				ouvidoria.adicionarReclamacao(reclamacao);
				break;
				
			case 2:
				System.out.println("Favor fornecer a ID da reclama��o que deseja excluir.");
				int id = leitura.nextInt();
				ouvidoria.excluirReclamacao(id);
				System.out.println("Opera��o executada com sucesso");
				break;
				
			case 3:
				System.out.println("Informe o ID da reclama��o desejada.");
				int id2 = leitura.nextInt();
				Reclamacao idRecuperado = ouvidoria.recuperarReclamacao(id2);
				System.out.println(idRecuperado);
				break;
				
			case 4:
				System.out.println("Digite a ID da reclama��o que deseja mudar o status para 'Consertado'");
				int id3 = leitura.nextInt();
				System.out.println("Digite a hora do conserto");
				leitura.nextLine();
				String hora = leitura.nextLine();
				
				System.out.println("Digite o custo do conserto");
				String custo = leitura.nextLine();
				
				ouvidoria.situacaoReclamacao(id3, hora, custo);
				
				break;
				
			case 5:
				System.out.println("Volte sempre");
				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		}while(harry !=5);
		leitura.close();
	}
}
