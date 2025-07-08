public class NotificadorEmail implements INotificador {
    public void enviarMensagem(String message) {
        System.out.println("E-MAIL: " + message);
    }
}
