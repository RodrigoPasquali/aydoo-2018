package excepciones;

public class ExcepcionParametroNoNumerico extends RuntimeException {
    private final static String mensajeParametroNoNumerico = "Luego de introducir el tipo de cliente, debe ingresador datos numericos";
    
    public ExcepcionParametroNoNumerico() {
        super(mensajeParametroNoNumerico);
    }
}

