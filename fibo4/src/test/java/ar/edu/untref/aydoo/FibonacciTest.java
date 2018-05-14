package ar.edu.untref.aydoo;


import org.junit.Assert;
import org.junit.Test;


public class FibonacciTest {


    @Test
    public void fibonacciDe1() {
        Fibonacci miFibonacci = new Fibonacci(1);
        int resultado = 0;
        resultado = miFibonacci.ejecutarFibonacciDirecto();
        Assert.assertEquals(0, resultado);
    }

    @Test
    public void fibonacciDe2() {
        Fibonacci miFibonacci = new Fibonacci(2);
        int resultado = 0;
        resultado = miFibonacci.ejecutarFibonacciDirecto();
        Assert.assertEquals(1, resultado);
    }

    @Test
    public void fibonacciDe10() {
        Fibonacci miFibonacci = new Fibonacci(10);
        int resultado = 0;
        resultado = miFibonacci.ejecutarFibonacciDirecto();
        Assert.assertEquals(34, resultado);
    }

    @Test
    public void fibonacciDe11() {
        Fibonacci miFibonacci = new Fibonacci(11);
        int resultado = 0;
        resultado = miFibonacci.ejecutarFibonacciDirecto();
        Assert.assertEquals(55, resultado);
    }

    @Test
    public void fibonacciDe12() {
        Fibonacci miFibonacci = new Fibonacci(12);
        int resultado = 0;
        resultado = miFibonacci.ejecutarFibonacciDirecto();
        Assert.assertEquals(89, resultado);
    }


    @Test
    public void deberiaSerCeroElUltimoNumeroDeLaLista() {
        Fibonacci miFibonacci = new Fibonacci(12);
        int resultado = 0;
        resultado = miFibonacci.ejecutarFibonacciInverso();
        Assert.assertEquals(0, resultado);
    }

    @Test
    public void deberiaDar88LaSumatiriaDelFiboDe10() {
        Fibonacci miFibonacci = new Fibonacci(10);
        int resultado = 88;
        Assert.assertEquals(resultado, miFibonacci.ejecutarSumatoriaFibonacci());
    }

}
