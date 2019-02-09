public class Lever {
    boolean isOn;
    ICommand command;

    public Lever(ICommand command){
        this.command = command;
    }

    public void setOn(){
        isOn = false;
        command.execute();
    }

    public void setOff(){
        isOn = false;
    }
}
