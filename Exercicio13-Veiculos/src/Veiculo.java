import java.util.Scanner;


public class Veiculo extends Motor{

	Scanner leia = new Scanner (System.in);
	int peso, velocMax;
	float preco; 
	
	Veiculo (int paramPeso, int paramVeloc, int paramPreco)
	{
		peso = paramPeso;
		velocMax = paramVeloc;
		preco = paramPreco ;
		
	}
	
	Veiculo ()
	{
		
	}
	
	void Get ()
	{
		peso = leia.nextInt();
		velocMax = leia.nextInt();
		preco = leia.nextFloat();
		
	}
	
	void Print ()
	{
		System.out.println("Peso do Veículo: " + peso );
		System.out.println("Velocidade Máxima do Veículo: " + velocMax  );
		System.out.println("Preço do Veículo: R$" + preco) ;
	}
}


