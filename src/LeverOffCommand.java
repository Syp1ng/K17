public class LeverOffCommand implements ICommand{
    Lever lever;
    public LeverOffCommand(Lever lever){
        this.lever = lever;
    }
    public void execute() {
        lever.setOff();

    }
}
