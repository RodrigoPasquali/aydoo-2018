package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerardorDeArchivos {
    private String rutaArchivo;
    private BufferedWriter bw;

    public GenerardorDeArchivos(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public boolean generarArchivo(){
        try {
            this.bw=new BufferedWriter
                    (new FileWriter(this.rutaArchivo));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void escribirArchivo(String cuerpoArchivo) {
        try {
            this.bw.write(cuerpoArchivo);
            this.bw.flush();
            this.bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
