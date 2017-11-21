import java.util.Scanner;


public class CarroPasseio extends Veiculo {
	
	Scanner leia = new Scanner (System.in);

	String cor, modelo;
	
	CarroPasseio ()
	{
	cor = "";
	modelo = "";
	
	}
	
	CarroPasseio (String paramCor, String paramModelo)
	{
		
	cor = paramCor;
	modelo = paramModelo;
	}
	
	void Get ()
	{
	cor = leia.next ();
	modelo = leia.next();
	}
	
	
	
	void Print ()
	{
		System.out.println("Cor: " + cor );
	
		System.out.println("Modelo" + modelo);
	}
	
}

