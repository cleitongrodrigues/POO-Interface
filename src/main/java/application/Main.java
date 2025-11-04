package application;

public class Main {
    public static void main (String[] args){
        NotificacaoSms notifSMS = new NotificacaoSMS("Cleton","123456798","Teste",1);

        notifSMS.exibirInformacoesRemetente();
        notifSMS.enviar();
        notifSMS.registrarLog();

        notifSMS.definirPrioridade(8);
        notifSMS.obterNivelPrioridade();
    }
}
