import java.util.Scanner;

public class Azucar {
	static	Scanner teclado=new Scanner(System.in);
	static double Gramos,Precio,PrecioTotal,gr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		 System.out.println("El kilo de azucar vale: $" + Precio);
		 System.out.println("");
		 System.out.println("Los gramos que requeriste son: " + Gramos + "gr.");
		 System.out.println("Tu total a pagar es: $" + PrecioTotal) ;
		
		PrecioTotal = Operaciones(Precio,Gramos);
		System.out.println("El precio a pagar es" );
	}
	
	public static double Operaciones(double a,double b) {
		gr = (Precio / 1000);
		PrecioTotal = Gramos * gr;
		
		return gr,PrecioTotal;
		
		
	}
	
}