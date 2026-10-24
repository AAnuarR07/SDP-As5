package smarthome;

public class Lighting {

    private LightingStrategy strategy;

    public Lighting(LightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(LightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void turnOn() {
        strategy.execute();
    }
}