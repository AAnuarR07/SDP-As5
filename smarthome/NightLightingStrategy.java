package smarthome;

public class NightLightingStrategy implements LightingStrategy {
    @Override
    public void execute() {
        System.out.println("Night mode: Only dim night lights are on");
    }
}