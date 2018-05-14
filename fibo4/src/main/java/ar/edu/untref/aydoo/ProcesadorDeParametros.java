package ar.edu.untref.aydoo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcesadorDeParametros {

    private boolean continuar;
    private boolean vertical;
    private boolean ordenInverso;
    private boolean sumarValores;
    private String archivoDeSalida;
    private boolean salidaPorPantalla;
    private boolean parametroInterpretado;

    private boolean esCoincidente;
    private String expresionRegular;
    private Pattern patron;
    private Matcher emparejador;

    public ProcesadorDeParametros() {
        this.continuar = true;
        this.salidaPorPantalla = true;
        this.esCoincidente = false;
    }

    public void recibirParametros(String unArgumento) {
        this.parametroInterpretado = false;
        if (puedoContinuar()) {
            definirSalidaListaOSumatoria(unArgumento);
            if (!this.parametroInterpretado) {
                definirSalidaHorizontalOVertical(unArgumento);
            }
            if (!this.parametroInterpretado) {
                definirArchivoDeSalida(unArgumento);
            }

            if (!this.parametroInterpretado) {
                cancelarEjecucion();
            }
        }
    }

    private void definirSalidaHorizontalOVertical(String parametros) {
        this.expresionRegular = "(\\-)+([o])=([vh][id]\\b)";
        this.patron = Pattern.compile(expresionRegular);
        this.emparejador = patron.matcher(parametros);
        this.esCoincidente =emparejador.find();
        if (this.esCoincidente){
            imprimeEnVertical(parametros.contains("v"));
            ejecutarEnOrdenInverso(parametros.contains("i"));
            encontroParametros(true);
        }
    }

    private void imprimeEnVertical(boolean imprimeVertical) {
        this.vertical = imprimeVertical;
    }

    private void ejecutarEnOrdenInverso(boolean unOrden) {
        this.ordenInverso = unOrden;
    }

    private void cancelarEjecucion() {
        System.out.println("Opciones no validas");
        continuarEjecucion(false);
    }

    private void continuarEjecucion(boolean unEstado) {
        this.continuar = unEstado;
    }

    public boolean esEjecucionInversa() {
        return this.ordenInverso;
    }

    public boolean puedoContinuar() {
        return this.continuar;
    }

    public boolean imprimirEnVertical() {
        return this.vertical;
    }

    public boolean puedoSumarVaroles() {
        return this.sumarValores;
    }

    private void aplicarSumaDeValores(boolean unEstado) {
        this.sumarValores = unEstado;
    }

    private void definirSalidaListaOSumatoria(String parametro) {
        this.expresionRegular = "(\\-)+([m])=([ls]\\b)";
        this.patron = Pattern.compile(expresionRegular);
        this.emparejador = patron.matcher(parametro);
        this.esCoincidente =emparejador.find();
        if (this.esCoincidente){
            aplicarSumaDeValores(parametro.contains("s"));
            encontroParametros(true);
        }
    }

    private void encontroParametros(boolean parametroInterpretado) {
        this.parametroInterpretado = parametroInterpretado;
    }

    private void definirArchivoDeSalida(String paramatroSalidaArchivo) {
        boolean aplicaSalidaPorArchivo = paramatroSalidaArchivo.contains("-f=");
        if (aplicaSalidaPorArchivo) {
            this.archivoDeSalida = paramatroSalidaArchivo.substring(3, paramatroSalidaArchivo.length());
            encontroParametros(true);
            this.salidaPorPantalla = false;
        }
    }

    public boolean imprimeEnPantalla() {
        return this.salidaPorPantalla;
    }

    public String darArchivoDeSalida() {
        return this.archivoDeSalida;
    }
}
