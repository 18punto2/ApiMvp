package pe.edu.cibertec.dependencyinjection;

public class AppPoolWacther {
    INotificationAction action;
    //Inyeccion de constructor

    //Inyeccion de propiedad atributo
    public INotificationAction getAction() {
        return action;
    }

    public void setAction(INotificationAction action) {
        this.action = action;
    }

    public AppPoolWacther(INotificationAction action) {
        this.action = action;
    }
    public void notify(String message){
        action.write(message);
    }
    //Inyeccion del metodo
    public void  notify(INotificationAction action,String message){
        this.action=action;
        this.action.write(message);
    }
    public AppPoolWacther(){

    }
/*
    public void notify(String message){
        if(action==null){
            //eventLogWriter=new EventLogWriter();
            //action=new SmsSender();
            action=new EmailSender();
        }
        action.write(message);
    }
    */

}
