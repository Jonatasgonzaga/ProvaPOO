import java.util.Scanner;

public class Motor  {

	Scanner leia = new Scanner (System.in);
	
	int numCilindro, Potenci;

	Motor() {
		numCilindro = 0;
		Potenci = 0;
	}

	Motor(int paramNumCilindro, int paramPotenci) {
		numCilindro = paramNumCilindro;
		Potenci = paramPotenci;

	}

	
	void Get ()
	{
		Potenci = leia.nextInt();
		numCilindro = leia.nextInt();
	}
	
	void Print ()
	{
		System.out.println("Número do Cilindro: " + numCilindro);
		System.out.println("Potência" + Potenci);
	}
}
