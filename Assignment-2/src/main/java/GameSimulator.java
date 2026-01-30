import Observer.AudioController;
import Observer.HeadsUpDisplay;
import model.TerrainType;
import model.AmphibiousVehicle;

public class GameSimulator {
    public static void main(String[] args) {
        AmphibiousVehicle myVehicle = new AmphibiousVehicle("Phoenix-X1");

        // 2. Setup and Attach Systems (Observers)
        HeadsUpDisplay hud = new HeadsUpDisplay();
        AudioController audio = new AudioController();

        myVehicle.attach(hud);
        myVehicle.attach(audio);

        // --- GAME START ---

        // 3. Driving on Land
        System.out.println("\n[Player Action] Driving forward...");
        myVehicle.performMove(0.5f);

        // 4. Entering Water
        // This single line triggers the Strategy swap AND updates UI/Audio
        myVehicle.switchTerrain(TerrainType.WATER);

        System.out.println("\n[Player Action] Cruising in water...");
        myVehicle.performMove(0.8f);

        // 5. Taking Off
        myVehicle.switchTerrain(TerrainType.AIR);

        System.out.println("\n[Player Action] Ascending...");
        myVehicle.performMove(1.0f);
        myVehicle.performBrake();
    }
}