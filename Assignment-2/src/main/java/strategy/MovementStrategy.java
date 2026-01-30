package strategy;

public interface MovementStrategy {
    void move(float intensity);
    void brake();
    String getMechanismName();
}