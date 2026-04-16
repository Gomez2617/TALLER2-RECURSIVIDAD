
/**
 *
 * @author julian
 */
public class Operaciones {
   

    public int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public int suma(int n) {
        if (n == 0) return 0;
        return n + suma(n - 1);
    }

    public double serie(int n) {
        if (n == 1) return 1;
        return (1.0 / n) + serie(n - 1);
    }

    public int invertir(int n) {
        if (n < 10) return n;
        return (n % 10) * (int)Math.pow(10, (int)Math.log10(n)) + invertir(n / 10);
    }

    public int sumaDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumaDigitos(n / 10);
    }

    public int potencia(int base, int exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }

    public int mcd(int m, int n) {
        if (n == 0) return m;
        return mcd(n, m % n);
    }

    public int division(int a, int b) {
        if (a < b) return 0;
        return 1 + division(a - b, b);
    }

    public int multiplicacion(int a, int b) {
        if (b == 0) return 0;
        return a + multiplicacion(a, b - 1);
    }

    public int sumaArreglo(int[] v, int n) {
        if (n == 0) return 0;
        return v[n - 1] + sumaArreglo(v, n - 1);
    }

    public int sumaMatriz(int[][] m, int i, int j) {
        if (i < 0) return 0;
        if (j < 0) return sumaMatriz(m, i - 1, m[0].length - 1);
        return m[i][j] + sumaMatriz(m, i, j - 1);
    }

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }
    }
