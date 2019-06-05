
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Principal {
	
	public static void main(String[] args) {
		Ouvidoria ouvidoria = new Ouvidoria();
		Endereco endereço = new Endereco();
		Buraco buraco = new Buraco();
		
		int harry = 0;
		Scanner leitura = new Scanner(System.in);
		do{
			System.out.println("Digite o número da opção desejada:");
			System.out.println("1 - Registrar reclamação\n"
					+ "2 - Excluir reclamaçãon\n"
					+ "3 - Consultar reclamação\n"
					+ "4 - Registrar conserto\n"
					+ "5 - Encerrar");
			/*harry = opção escolhida*/		
			harry = leitura.nextInt();
			switch (harry) {
			case 1:
				Reclamacao reclamacao = new Reclamacao();
				Random random = new Random();
				reclamacao.setId(random.nextInt(100));
				reclamacao.setData(new Date());
				System.out.println("Favor fornecer as seguintes informações na mesma sequência:");
				System.out.print("Endereço contendo rua, número da quadra e bairro.\nTamanho do buraco de 0 a 10 e sua localidade (rua ou calçada).\n");
				String rua = leitura.next();
				String numero = leitura.next();
				String bairro = leitura.next();
				String tam = leitura.next();
				String local = leitura.next();
				endereço.setRua(rua);
				endereço.setNumero(numero);
				endereço.setBairro(bairro);
				buraco.setTam(tam);
				buraco.setLocal(local);
				reclamacao.setBuraco(buraco);
				reclamacao.setEndereco(endereço);
				System.out.println("Reclamação registrada com sucesso, a ID da reclamação é: " + reclamacao.getId());
				ouvidoria.adicionarReclamacao(reclamacao);
				break;
				
			case 2:
				System.out.println("Favor fornecer a ID da reclamação que deseja excluir.");
				int id = leitura.nextInt();
				ouvidoria.excluirReclamacao(id);
				System.out.println("Operação executada com sucesso");
				break;
				
			case 3:
				System.out.println("Informe o ID da reclamação desejada.");
				int id2 = leitura.nextInt();
				Reclamacao idRecuperado = ouvidoria.recuperarReclamacao(id2);
				System.out.println(idRecuperado);
				break;
				
			case 4:
				System.out.println("Digite a ID da reclamação que deseja mudar o status para 'Consertado'");
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
				System.out.println("Opção inválida!");
				break;
			}
		}while(harry !=5);
		leitura.close();
	}
}
