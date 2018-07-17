package excepciones;

public class ExcepcionInversionNoValida extends RuntimeException {
    private final static String mensajeInversionNoValida = "La inversion que desea realizar no es valida";
    
    public ExcepcionInversionNoValida() {
        super(mensajeInversionNoValida);
    }
}
