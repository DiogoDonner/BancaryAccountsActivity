public class NotificadorConsole implements INotificador {
    public void enviarMensagem(String message) {
        System.out.println("Console: " + message);
    }
}
