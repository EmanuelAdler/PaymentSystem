package empregados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Horista extends Empregado {
	private double salarioHorario;
	private int totalHora;
	private int dia;
	private int mes;
	private int ano;
	private Date data;
	
	public Horista(String nome, String endereco, boolean sindicato, double salarioHorario) {
		super(nome, endereco, sindicato);
		this.salarioHorario = salarioHorario;
		this.totalHora = 0;
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
		super.salarioTotal = 0;
		this.data = new Date();
	}
	
	public double getSalario()
	{
		return salarioHorario;
	}
	public int getTotalHora()
	{
		return totalHora;
	}
	public void setTotalHora(int totalHora)
	{
		this.totalHora = totalHora;
	}
	public void setSalarioTotal(int totalHora)
	{
		double aux1, aux2;
		aux2 = 0;
		if(totalHora > 8)
		{
			aux1 = totalHora - 8;
			aux2 = salarioHorario * 1.5 * aux1;
		}
		super.salarioTotal = salarioTotal + aux2;
	}
	public void setData(int dia, int mes, int ano) throws ParseException
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		String formatStr = dia + "/" + mes + "/" + ano;
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy"); //Must be in this format
		this.data = formatDate.parse(formatStr); 
	}
}
