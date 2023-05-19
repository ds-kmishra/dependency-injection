package pd.example;

import pd.example.service.EmailService;
import pd.example.service.MessageService;
import pd.example.service.SmsService;

public class DriverClass {
    public static void main( String[] args )
    {
        // Way of Calling constructor based injection
        App app = new App(new EmailService());
        App app1 = new App(new SmsService());

        // Way of calling setter based injection
        /*App app = new App();
        app.setService(new EmailService());
        app.processMsg("Alina@gmail.com","Hi I am Anila");*/


    }
}
