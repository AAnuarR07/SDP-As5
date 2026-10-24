package smarthome;

public class EnergySavingStrategy implements LightingStrategy {
    @Override
    public void execute() {
        System.out.println("Energy-saving mode: Lights are on at 40% brightness");
    }
}