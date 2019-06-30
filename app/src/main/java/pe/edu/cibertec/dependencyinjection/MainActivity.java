package pe.edu.cibertec.dependencyinjection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*AppPoolWacther appPoolWacther=new AppPoolWacther();///BASE/

        appPoolWacther.notify("Ocurrio el evento");
        */
        //Inyeccion de constructor
        /*
        EmailSender action=new EmailSender();
        AppPoolWacther appPoolWacther=new AppPoolWacther(action);

        appPoolWacther.notify("Ocurrio el evento");
        */
        //Inyeccion de metodo
        /*
        SmsSender action=new SmsSender();
        AppPoolWacther appPoolWacther=new AppPoolWacther();
        appPoolWacther.notify(action,"ocurrio un evento");
        */
        EventLogWriter action=new EventLogWriter();
        AppPoolWacther appPoolWacther=new AppPoolWacther();

        appPoolWacther.setAction(action);
        appPoolWacther.notify("ocurrio el evento");
    }
}
