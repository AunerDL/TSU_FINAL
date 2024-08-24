public class ejemplo8{
	
	public static void main(String[] args){

		int a = 8, b = 2;
		int Rsuma, Rresta, Rmulti, Rexpo, Rexpo1;
		double Rdiv;

		//suma
		Rsuma = a + b;
		System.out.println("La suma es: " + Rsuma);
		
		//resta
		Rresta = a - b;
		System.out.println("La resta es: " + Rresta); 

		//multiplicacion
		Rmulti = a * b;
		System.out.println("La multiplicacion es: " + Rmulti);

		//divicion
		Rdiv = a / b;
		System.out.println("La divicion es: " + Rdiv);

		//exponente
		Rexpo = a*a;
		Rexpo1 = b*b;
		System.out.println("El exponente de a es: " + Rexpo); 
		System.out.println("El exponente de b es: " + Rexpo1);

	}

}