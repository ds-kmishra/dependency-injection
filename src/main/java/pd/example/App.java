package pd.example;

import pd.example.service.EmailService;
import pd.example.service.MessageService;
import pd.example.service.SmsService;

public class App
{
    //EmailService emailService = new EmailService();

    // dependency ===> new EmailService();
    // 3. Property Based - Injection
    /* @Autowired
    MessageService service;
    */

    // --- 1. Constructor Based Injection ---
    MessageService service;
    public App(MessageService service){
        this.service= service;
    }

    //  --- 2. Setter Based Injection
    /*public void setService(MessageService service){
        this.service= service;
    }*/
    public void processMsg(String rec, String msg)
    {
        service.sendMsg(rec, msg);
    }
}
