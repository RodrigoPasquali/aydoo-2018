package excepciones;

public class ExcepcionUsuarioNoValido extends RuntimeException {
    private final static String mensajeUsuarioIncorrecto = "El usuario es ingresado es invalido. Las opciones validas son: 'ind' y 'emp'";
    
    public ExcepcionUsuarioNoValido() {
        super(mensajeUsuarioIncorrecto);
    }
}

