package smarthome;

public class NormalLightingStrategy implements LightingStrategy {
    @Override
    public void execute() {
        System.out.println("Normal mode: Main lights are on at 100% brightness");
    }
}