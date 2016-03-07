package empregados;

public class Comissionado extends Empregado {
	
	private double comissao;
	double venda;
	int quantidade;
	
	public Comissionado(String nome, String endereco, boolean sindicato, double comissao) {
		super(nome, endereco, sindicato);
		this.comissao = comissao;
		super.salarioTotal = 0;
		this.quantidade = 0;
	}
	
	public double getComissao()
	{
		return comissao;
	}
	
	public void setSalarioTotal(double venda)
	{
		this.quantidade = quantidade+1;
		venda = venda*comissao;
		super.salarioTotal = salarioTotal + venda;
	}
	
}
