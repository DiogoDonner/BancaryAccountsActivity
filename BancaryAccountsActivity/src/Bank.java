import java.util.List;
import java.util.ArrayList;

public class Bank {
    private INotificador notificador;

    public Bank() {
        this.notificador = null;
    }

    public Bank(INotificador notificador) {
        this.notificador = notificador;
    }

    public void executeRoutine(List<Account> accounts) {
        for (Account account : accounts) {
            account.actualizeBalance();
            account.showData();
        }

    }

    public void processar() {
        notificador.enviarMensagem("Análise de rotina realizada");
    }
}
