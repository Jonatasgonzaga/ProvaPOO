import java.util.Scanner;


public class Caminhao extends Veiculo {

	Scanner leia = new Scanner (System.in);
	
	int cargaMax;
	int alturaMax;
	int comprimento;
	
	Caminhao ()
	{
		
	}
	
	Caminhao (int paramCarga, int paramAltura, int paramCompri)
	{
		cargaMax = paramCarga;
		alturaMax = paramAltura;
		comprimento = paramCompri;
	}
	
	void Get () {
		
		cargaMax = leia.nextInt();
		alturaMax = leia.nextInt();
		comprimento = leia.nextInt();
		
	}
	
	void Print ()
	{
		System.out.println("Carga Máxima: " + cargaMax);
		System.out.println("Altura Máxima:" + alturaMax);
		System.out.println("Comprimento Máximo: " + comprimento);
		
	}
	
}
