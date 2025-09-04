package exemplos;

public class Conta 
{
	//Atributos
		int numero;
		String titular;
		double saldo;
	
	//Compartimentos da classe - Métodos
		
	//método sem retorno(void)	
	public void deposito (double valor) 
	{
		saldo += valor; //saldo = saldo + valor (de forma extensa) igual no portugol
		//System.out.println("Depósito efetuado com sucesso.");
	}
	//método com retorno
	
	public boolean saque (double valor) 
	{
		if (saldo >= valor) 
		{
			saldo = saldo - valor; //saldo -= valor
			//System.out.println("Saque efetuado!");
			return true;
		}else 
		{
			//System.out.println("Saque não efetuado.");
			return false;
		}
		
	}

}
