package smarthome;

public class Main {
    public static void main(String[] args) {
        Lighting lighting = new Lighting(new NormalLightingStrategy());

        lighting.turnOn();

        lighting.setStrategy(new EnergySavingStrategy());
        lighting.turnOn();

        lighting.setStrategy(new NightLightingStrategy());
        lighting.turnOn();
    }
}