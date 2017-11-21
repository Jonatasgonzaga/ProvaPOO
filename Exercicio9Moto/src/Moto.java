import java.util.Scanner;


public class Moto {
	
	Scanner leia = new Scanner (System.in);
	
	String modelo, marca, cor;
	int marcha;
	int menorMarcha, maiorMarcha;
	boolean ligado;
	String digitou;
	
	
	
	
	Moto ()
	{
		modelo = "";
		marca = "";
		cor = "";
		marcha = 0;
		menorMarcha = 0;
		maiorMarcha = 7;
		ligado = false;
	}
	
	
	
	void Imprime ()
	{
		System.out.println("Modelo: " +  modelo);
		System.out.println("Marca: " +  marca);
		System.out.println("Cor:s" + cor);
		System.out.println("Marcha mínima: " + menorMarcha);
		System.out.println("Marcha máxima: " + maiorMarcha);
		
		if (marcha == 0)
		{
			System.out.println("Marcha atual: Neutra");
		}
		else 
		{
			System.out.println("Marcha atual: " + marcha+ "ª");
		}
		
		if (ligado == true){
			System.out.println("A moto está ligada");
		}
		
		else if (ligado == false){
			System.out.println("A moto está desligada");
		}
	}
	
	void Construtor (){
		System.out.println("Digite o Modelo: " );
		modelo = leia.next ();
		System.out.println("Digite a Marca: " );
		marca = leia.next();
		System.out.println("Digite a Cor:" );
		cor = leia.next();
		System.out.println("Digite a Marcha mínima: " );
		menorMarcha= leia.nextInt();
		System.out.println("Digite a Marcha máxima: ");
		maiorMarcha = leia.nextInt();
		System.out.println("Digite a Marcha atual: " );
		if (marcha <= maiorMarcha && marcha >= menorMarcha)
		{
		
			marcha = leia.nextInt();
			
		}
		
		System.out.println("Ligar a moto? ");
		System.out.println("Digite s para SIM ou n para Não");
		if (digitou == "s")
		{
			ligado = true;
		}
		
		else if (digitou == "n")
		{
			ligado = false;
		}
		
		else 
			System.out.println("Opção incorreta.");
			
	}
	

	void MarchaAcima () {
		if (marcha < maiorMarcha)
		marcha++;
	}
	
	void MarchaAbaixo (){
		if (marcha > menorMarcha)
			
		{
		marcha--;
		}
	}
	
	void Ligar ()
	{
		if (ligado == false)
		{
			ligado = true;	
		}
		
	
	}
	
	void Desligar ()
	{
		if (ligado == true){
			ligado = false;
		
	}
	
}
}

	
