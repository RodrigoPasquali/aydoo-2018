package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcesadorDeParametrosTest {
    @Test
    public void deberiaRecibirParametrosCorrectamente() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-o=vd");
        Assert.assertTrue(miProcesador.puedoContinuar());
    }

    @Test
    public void deberiaPoderImprimirVertical() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-o=vd");
        Assert.assertTrue(miProcesador.imprimirEnVertical());
    }

    @Test
    public void deberiaPoderImprimirEnOrdenInverso() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-o=vi");
        Assert.assertTrue(miProcesador.esEjecucionInversa());
    }

    @Test
    public void deberiaPoderImprimirSumatoria() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-m=s");
        Assert.assertTrue(miProcesador.puedoSumarVaroles());
    }

    @Test
    public void deberiaPoderImprimirLista() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-m=l");
        Assert.assertFalse(miProcesador.puedoSumarVaroles());
    }

    @Test
    public void deberiaGenerarUnArchivo() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-f=salida.txt");
        Assert.assertTrue(miProcesador.puedoContinuar());
    }
    @Test
    public void recibeParametro_vd_PoderContinuar() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-o=vd");
        Assert.assertTrue(miProcesador.puedoContinuar());
    }

    @Test
    public void recibeParametro_xy_noDeberiaPoderContinuar() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-o=xy");
        Assert.assertFalse(miProcesador.puedoContinuar());
    }

    @Test
    public void recibeParametro_vdx_noDeberiaPoderContinuar() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-o=vdx");
        Assert.assertFalse(miProcesador.puedoContinuar());
    }

    @Test
    public void recibeParametro_lx_noDeberiaPoderContinuar() {
        ProcesadorDeParametros miProcesador = new ProcesadorDeParametros();
        miProcesador.recibirParametros("-m=lx");
        Assert.assertFalse(miProcesador.puedoContinuar());
    }
}
