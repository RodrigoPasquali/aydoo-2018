package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ManejadorFibonacciTest {

    @Test
    public void deberiaPoderSetearParametrosCorrectamente() {
        ProcesadorDeParametros unProcesador = new ProcesadorDeParametros();
        ManejadorFibonacci miManejador = new ManejadorFibonacci(unProcesador, null);
        miManejador.procesarArgumentos("-m=s");
        Assert.assertTrue(miManejador.darProcesadorDeParemetros().puedoContinuar());
    }

    @Test
    public void fibonacciDe8VD() {
        ProcesadorDeParametros unProcesador = new ProcesadorDeParametros();
        ManejadorFibonacci miManejador = new ManejadorFibonacci(unProcesador, null);
        miManejador.procesarArgumentos("-o=vd");
        Assert.assertTrue(unProcesador.puedoContinuar());
        int resultado = 0;
        resultado = miManejador.ejecutarFibonnaci(8);
        Assert.assertEquals(13, resultado);
    }

    @Test
    public void fibonacciDe8VI() {
        ProcesadorDeParametros unProcesador = new ProcesadorDeParametros();
        ManejadorFibonacci miManejador = new ManejadorFibonacci(unProcesador, null);
        Fibonacci miFibonacci = new Fibonacci(8);
        unProcesador.recibirParametros("-o=vi");
        Assert.assertTrue(miManejador.darProcesadorDeParemetros().puedoContinuar());
        int resultado = 0;
        resultado = miFibonacci.ejecutarFibonacciInverso();
        Assert.assertEquals(0, resultado);
    }

    @Test
    public void simularEjecucionPorConsolaTipoLista() {
        ProcesadorDeParametros unProcesador = new ProcesadorDeParametros();
        ManejadorFibonacci miManejador = new ManejadorFibonacci(unProcesador, null);
        int numeroFibo = -1;
        String[] args = {"-o=vd", "-f=salida.txt", "-m=l", "6"};
        int largoArgumentos = args.length;
        if (largoArgumentos > 0)
            numeroFibo = Integer.parseInt(args[largoArgumentos - 1]);

        for (int i = 0; i < args.length - 1; i++) {
            miManejador.procesarArgumentos(args[i]);
        }

        int resultado = 5;
        Assert.assertEquals(resultado, miManejador.ejecutarFibonnaci(numeroFibo));
    }

    @Test
    public void simularEjecucionPorConsolaTipoSumatoria() {
        ProcesadorDeParametros unProcesador = new ProcesadorDeParametros();
        ManejadorFibonacci miManejador = new ManejadorFibonacci(unProcesador, null);
        int numeroFibo = -1;
        String[] args = {"-o=vd", "-f=salida.txt", "-m=s", "6"};
        int largoArgumentos = args.length;
        if (largoArgumentos > 0)
            numeroFibo = Integer.parseInt(args[largoArgumentos - 1]);

        for (int i = 0; i < args.length - 1; i++) {
            miManejador.procesarArgumentos(args[i]);
        }

        int resultado = 12;
        Assert.assertEquals(resultado, miManejador.ejecutarFibonnaci(numeroFibo));
        miManejador.imprimirSalida();
    }

    @Test
    public void deberiaGenerarArchivoDeSalida() {
        ProcesadorDeParametros unProcesador = new ProcesadorDeParametros();
        ManejadorFibonacci miManejador = new ManejadorFibonacci(unProcesador, null);
        int numeroFibo = -1;
        String[] args = {"-o=hi", "-f=salida.txt", "-m=l", "6"};
        int largoArgumentos = args.length;
        if (largoArgumentos > 0)
            numeroFibo = Integer.parseInt(args[largoArgumentos - 1]);

        for (int i = 0; i < args.length - 1; i++) {
            miManejador.procesarArgumentos(args[i]);
        }

        int resultado = 0;
        Assert.assertEquals(resultado, miManejador.ejecutarFibonnaci(numeroFibo));
        miManejador.imprimirSalida();
        Assert.assertFalse(unProcesador.imprimeEnPantalla());
        Assert.assertFalse(unProcesador.puedoSumarVaroles());
    }

    @Test
    public void deberiaEjecutarSumatoriaDeValoresYGuardarResultadoEnArchivoSalida() {
        ProcesadorDeParametros unProcesador = new ProcesadorDeParametros();
        ManejadorFibonacci miManejador = new ManejadorFibonacci(unProcesador, null);
        int numeroFibo = -1;
        String[] args = {"-o=vd", "-f=salida.txt", "-m=s", "6"};
        int largoArgumentos = args.length;
        if (largoArgumentos > 0)
            numeroFibo = Integer.parseInt(args[largoArgumentos - 1]);

        for (int i = 0; i < args.length - 1; i++) {
            miManejador.procesarArgumentos(args[i]);
        }
        Assert.assertTrue(unProcesador.puedoContinuar());
        int resultado = 12;
        Assert.assertEquals(resultado, miManejador.ejecutarFibonnaci(numeroFibo));
        miManejador.imprimirSalida();
        Assert.assertFalse(unProcesador.imprimeEnPantalla());
        Assert.assertTrue(unProcesador.puedoSumarVaroles());
    }
}
