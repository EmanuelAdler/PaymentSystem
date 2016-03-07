package empregados;

public class Empregado {
	
	private String nome;
	private String endereco;
	private boolean sindicato;
	protected double salarioTotal;

	public Empregado(String nome, String endereco, boolean sindicato) {
		this.nome = nome;
		this.endereco = endereco;
		this.sindicato = sindicato;
	}
	
	public String toString()
	{
		return nome;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getEndereco()
	{
		return endereco;
	}
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	public boolean getSindicato()
	{
		return sindicato;
	}
	public void setSindicato(boolean sindicato)
	{
		this.sindicato = sindicato;
	}
	public double getSalarioTotal()
	{
		return salarioTotal;
	}
		
}
