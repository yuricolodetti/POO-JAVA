package exemplos;

public class Pessoa {
	
	private String nome;
	private double peso, altura;
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	//método para retorno do atributo
	public String getNome() {
		return nome;
		
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	//Encapsulamento
	private double calcularIMC() 
	{
		return peso / (altura * altura);
		
	}
	
	public String resultado()
	{
		if (calcularIMC() < 18.5) 
		{
			return "Abaixo do peso."; 
		} else if (calcularIMC() <= 24.9) 
		{
			return "Peso Ideal";
		} else {
			return "Acima do Peso.";
			
		}
	
	}
}
