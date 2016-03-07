import java.util.Scanner;
import java.util.ArrayList;
import empregados.*;
import java.util.Date;
import java.text.DateFormat;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Empregado> empregado = new ArrayList<Empregado>();
		
		int aux;
		aux = 0;
		int numEmpregado = 10;//numero de empregados
		/*
		System.out.println("Digite o numero de empregados: ");
		Scanner scannerNumero = new Scanner(System.in);
		int numEmpregado = scannerNumero.nextInt();
		*/
		
		while(aux!=11)
		{
			//MENU
			System.out.println("MENU\n1-Add empregado\n2-Remover empregado\n3-Lancar um cartao de ponto\n4-Resultado venda\n5-Taxa de servico\n6-Alterar detalhes do empregado\n7-Folha de pagamento hoje\n8-Undo/Redo\n9-Agenda de pagamento\n10-Nova agenda de pagamento\n11-Sair");
			System.out.println("Digite o numero:");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			aux = num;
			if(aux == 11)
			{
				break;
			}
			else if(num == 1)//add
			{
				if(empregado.size()<numEmpregado)
				{
					//dados
					System.out.println("Nome:");
					Scanner scannerNome = new Scanner(System.in);
					String nome = scannerNome.nextLine();
					
					System.out.println("Endereco:");
					Scanner scannerEndereco = new Scanner(System.in);
					String endereco = scannerEndereco.nextLine();
					
					System.out.println("Pertence a um sindicato(1/0):");
					Scanner scannerSindicato = new Scanner(System.in);
					int sindicat = scannerSindicato.nextInt();
					
					boolean sindicato;
					
					if(sindicat == 1)
					{
						sindicato = true;
					}
					else{
						sindicato = false;
					}
					
					System.out.println("TIPO DE EMPREGADO\n1-horista\n2-assalariado mensal\n3-assalariado comissionado\nDigite o numero:");
					Scanner scannerTipo = new Scanner(System.in);
					int tipo = scannerTipo.nextInt();
					
					if(tipo == 1)//horista
					{
						System.out.println("Salario por hora:");
						Scanner scannerSalario = new Scanner(System.in);
						double salario = scannerSalario.nextDouble();
						
						Horista usuario = new Horista(nome, endereco, sindicato, salario);
						empregado.add(usuario);//addObject
						System.out.println(empregado.toString());
					}
					else if(tipo == 2)//mensal
					{
						System.out.println("Salario mensal:");
						Scanner scannerSalario = new Scanner(System.in);
						double salario = scannerSalario.nextDouble();
						
						Mensal usuario = new Mensal(nome, endereco, sindicato, salario);
						empregado.add(usuario);//addObject
						System.out.println(empregado.toString());
					}
					else if(tipo == 3)//comissionado
					{
						System.out.println("Comissao:");
						Scanner scannerComissao = new Scanner(System.in);
						double comissao = scannerComissao.nextDouble();
						
						Comissionado usuario = new Comissionado(nome, endereco, sindicato, comissao);
						empregado.add(usuario);//addObject
						System.out.println(empregado.toString());
					}
				}
				else
				{
					System.out.println("Lotado!");
				}
				
			}
			else if(num == 2)//remover
			{
				
				System.out.println("Nome:");
				Scanner scannerNome = new Scanner(System.in);
				String nome = scannerNome.nextLine();
				
				int cont;
				for(cont = 0 ; cont < empregado.size() ; cont++)
				{
					if(empregado.get(cont).getNome().equals(nome))
					{
						empregado.remove(empregado.get(cont));
					}
				}
				
				System.out.println(empregado.toString());
			
			}
			else if(num == 3)//lancar ponto de cartao
			{
				int cont = 0;
				System.out.println("Nome:");
				Scanner scannerNome = new Scanner(System.in);
				String nome = scannerNome.nextLine();
				
				for(cont = 0; cont < empregado.size(); cont++)
				{
					if(empregado.get(cont).getNome().equals(nome))
					{
						break;
					}
				}
				
				System.out.println("Dia: ");
				Scanner scannerDia = new Scanner(System.in);
				int dia = scannerDia.nextInt();
				
				System.out.println("Mês: ");
				Scanner scannerMes = new Scanner(System.in);
				int mes = scannerMes.nextInt();
				
				System.out.println("Ano: ");
				Scanner scannerAno = new Scanner(System.in);
				int ano = scannerAno.nextInt();
				
				if(empregado.get(cont) instanceof Horista)
				{
					System.out.println("Digite a quantidade de horas trabalhadas: ");
					Scanner scannerTotalHora = new Scanner(System.in);
					int totalHora = scannerTotalHora.nextInt();
					
					/*
					empregado.get(cont).setData(dia, mes, ano);
					empregado.get(cont).setSalarioTotal(totalHora);
					*/
				}
				
			}
			else if(num==4)//resultado venda
			{
				int cont;
				
				System.out.println("Digite o nome: ");
				Scanner scannerNome = new Scanner(System.in);
				String nome = scannerNome.nextLine();

				System.out.println("Digite a data: ");
				
				System.out.println("Digite o valor da venda: ");
				Scanner scannerVenda = new Scanner(System.in);
				double venda = scannerVenda.nextDouble();
				
				for(cont = 0; cont < empregado.size(); cont++)
				{
					if(empregado.get(cont).getNome().equals(nome))
					{
					//	empregado.get(cont).setSalarioTotal(venda);
						break;
					}
				}
			}
			
			else if(num == 6)//alterar detalhes do empregado
			{
				System.out.println("1-Nome\n2-Endereco\n3-Tipo (Horista, Assalariado mensal, Comissionado)\n4-Metodo de pagamento\n5-Pertence a um sidicato\n6-Identificacao no sindicato\n7-Taxa sindical\n");
				
				System.out.println("Digite um numero: ");
				Scanner scannerNum = new Scanner(System.in);
				int num2 = scannerNum.nextInt();
				
				if(num2 == 1)//nome
				{
					int cont;
					System.out.println("Digite o nome atual:");
					Scanner scannerNome = new Scanner(System.in);
					String nome = scannerNome.nextLine();
					
					System.out.println("Digite o novo nome: ");
					Scanner scannerNome2 = new Scanner(System.in);
					String nome2 = scannerNome2.nextLine();
					
					for(cont = 0; cont < empregado.size(); cont++)
					{
						if(empregado.get(cont).getNome().equals(nome))
						{
							empregado.get(cont).setNome(nome2);
							break;
						}
					}
					
				}else if(num2 == 2)//endereco
				{
					int cont;
					System.out.println("Digite o nome:");
					Scanner scannerNome = new Scanner(System.in);
					String nome = scannerNome.nextLine();
					
					System.out.println("Digite o novo endereco: ");
					Scanner scannerEndereco = new Scanner(System.in);
					String endereco = scannerEndereco.nextLine();
					
					for(cont = 0; cont < empregado.size(); cont++)
					{
						if(empregado.get(cont).getNome().equals(nome))
						{
							empregado.get(cont).setEndereco(endereco);
							break;
						}
					}
				}else if(num2 == 3)//tipo
				{
					int cont;
					System.out.println("Digite o nome atual:");
					Scanner scannerNome = new Scanner(System.in);
					String nome = scannerNome.nextLine();
					
					System.out.println("1-Horista\n2-Assalariado mensal\n3-Comissionado\nDigite o numero do novo tipo: ");
					Scanner scannerTipo = new Scanner(System.in);
					int tipo = scannerTipo.nextInt();
					
					for(cont = 0; cont < empregado.size(); cont++)
					{
						if(empregado.get(cont).getNome().equals(nome))
						{
							System.out.println("Pertence a um sindicato(1/0):");
							Scanner scannerSindicato = new Scanner(System.in);
							int sindicat = scannerSindicato.nextInt();
							
							boolean sindicato = false;
							
							if(sindicat == 1)
							{
								sindicato = true;
							}
							else if(sindicat == 0){
								sindicato = false;
							}
							
							if(tipo == 1)
							{
								System.out.println("Salario por hora:");
								Scanner scannerSalario = new Scanner(System.in);
								double salario = scannerSalario.nextDouble();
								
								Horista novo = new Horista(empregado.get(cont).getNome(), empregado.get(cont).getEndereco(), sindicato, salario);
								empregado.add(novo);
							}else if(tipo == 2)
							{
								System.out.println("Salario mensal:");
								Scanner scannerSalario = new Scanner(System.in);
								double salario = scannerSalario.nextDouble();
								
								Mensal novo = new Mensal(empregado.get(cont).getNome(), empregado.get(cont).getEndereco(), sindicato, salario);
								empregado.add(novo);
							}else if(tipo == 3)
							{
								System.out.println("Comissao:");
								Scanner scannerComissao = new Scanner(System.in);
								double comissao = scannerComissao.nextDouble();
								
								Comissionado novo = new Comissionado(empregado.get(cont).getNome(), empregado.get(cont).getEndereco(), sindicato, comissao);
								empregado.add(novo);
							}
							empregado.remove(empregado.get(cont));
							
							break;
						}
					}
				}else if(num2 == 5)//pertence a um sidicato
				{
					int cont;
					
					System.out.println("Digite o nome: ");
					Scanner scannerNome = new Scanner(System.in);
					String nome = scannerNome.nextLine();
					
					for(cont = 0; cont < empregado.size(); cont++)
					{
						if(empregado.get(cont).getNome().equals(nome))
						{
							if(empregado.get(cont).getSindicato() == true)
							{
								empregado.get(cont).setSindicato(false);
							}
							else
							{
								empregado.get(cont).setSindicato(true);
		
							}
							break;
						}
					}
				}
			}
		}
		
		
	}

}
