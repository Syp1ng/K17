public class Heater {
    int waterTemperature;

    void heatUp(){
        for(; waterTemperature<100;waterTemperature++){
            waterTemperature+=1;
        }
    }

}
