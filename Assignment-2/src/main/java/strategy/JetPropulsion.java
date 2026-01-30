package strategy;

public class JetPropulsion implements MovementStrategy {
    @Override
    public void move(float intensity) {
        System.out.println("Water intake open. Impeller RPM: " + (intensity * 5000));
    }

    @Override
    public void brake() {
        System.out.println("Reverse thrust buckets deployed.");
    }

    @Override
    public String getMechanismName() {
        return "Hydro-Jet Engine";
    }
}