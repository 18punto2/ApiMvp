package pe.edu.cibertec.dependencyinjection;

public interface INotificationAction {
    /**
     * Metodo que escribe un mensaje en el log
     * @Param message: parametro con el mensaje a mostrar
     */
    public void write(String message);
}
