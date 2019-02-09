public class HeatUpCommand implements ICommand{
    Heater heater;

    public HeatUpCommand(Heater heater){
        this.heater = heater;
    }
    public void execute(){
        heater.heatUp();
    }
}
