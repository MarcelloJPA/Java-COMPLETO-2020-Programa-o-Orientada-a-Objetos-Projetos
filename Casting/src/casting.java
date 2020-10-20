
public class casting {

	public static void main(String[] args) {
		/*Exemplo 1*/
		int x;
		double y;
		
		x=5;
		y=2*x;
		System.out.println(x);
		System.out.println(y);
		
		/*Exemplo 2*/
		double b, B, h, area;
		
		b = 6;
		B = 8;
		h = 5;
		
		area = (b+B) / 2 * h;
		
		System.out.println(area);
		
		/* Exemplo 3 */
		int g, f;
		double resultado;
		
		g=5;
		f=2;
		
		resultado = g/f;
		
		System.out.println(resultado); //2.0, pois g e f sao int
		
		
		resultado = (double) g/f; //Casting, quero um resultado em double
		
		System.out.println(resultado);
		
		/*Exemplo 4 */
		double p;
		int l;
		
		p=2.9;
		l=(int)p;  //p é double e l é int, necessário o casting (int)
		
		System.out.print(l);
	}

}
