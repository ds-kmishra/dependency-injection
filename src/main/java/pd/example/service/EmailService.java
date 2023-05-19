package pd.example.service;

public class EmailService implements MessageService{
    public void sendMsg(String receiver, String message){
        System.out.println(message + " is being set to "+ receiver);
    }
}
