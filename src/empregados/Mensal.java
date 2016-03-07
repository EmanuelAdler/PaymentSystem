package empregados;

public class Mensal extends Empregado {
	private double salarioMensal;
	
	public Mensal(String nome, String endereco, boolean sindicato, double salarioMensal) {
		super(nome, endereco, sindicato);
		this.salarioMensal = salarioMensal;
	}
	
	public double getSalario()
	{
		return salarioMensal;
	}

}
