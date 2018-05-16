package ar.edu.untref.aydoo;

import org.junit.Test;

public class GenerardorDeArchivosTest {
    @Test
    public void generarUnArchivoEnLaRutaDeDestino(){
        GenerardorDeArchivos miGenerador = new GenerardorDeArchivos("salida.txt");
        miGenerador.generarArchivo();
    }

    @Test
    public void deberiaGenerarUnArchivoTXTconElResultadoDeLaEjecucionDelFibonacci(){
        GenerardorDeArchivos miGenerador = new GenerardorDeArchivos("salida.txt");
        miGenerador.generarArchivo();
        miGenerador.escribirArchivo("fibo<6>: 0 1 1 2 3 5 8");
    }
}
