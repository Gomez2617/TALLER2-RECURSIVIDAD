
/**
 *
 * @author julian Gomez
 */
public class Main {

   
    public static void main(String[] args) {
      
        Operaciones op = new Operaciones();

        System.out.println("Factorial 5: " + op.factorial(5));
        System.out.println("Suma hasta 5: " + op.suma(5));
        System.out.println("Serie hasta 5: " + op.serie(5));
        System.out.println("Invertir 123: " + op.invertir(123));
        System.out.println("Suma digitos 123: " + op.sumaDigitos(123));
        System.out.println("Potencia 2^3: " + op.potencia(2,3));
        System.out.println("MCD(48,18): " + op.mcd(48,18));
        System.out.println("Division 10/2: " + op.division(10,2));
        System.out.println("Multiplicacion 3*4: " + op.multiplicacion(3,4));

        int v[] = {1,2,3,4};
        System.out.println("Suma arreglo: " + op.sumaArreglo(v, v.length));

        int mat[][] = {{1,2},{3,4}};
        System.out.println("Suma matriz: " + op.sumaMatriz(mat,1,1));

        System.out.print("Fibonacci: ");
        for(int i=0;i<=5;i++){
            System.out.print(op.fibonacci(i) + " ");
        }

        System.out.println("\nAckermann(3,2): " + op.ackermann(3,2));
    }
    
    
}
