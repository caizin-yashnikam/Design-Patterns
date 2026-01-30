package Observer;

import model.TerrainType;

public class AudioController implements VehicleObserver {
    @Override
    public void onTerrainChanged(TerrainType newTerrain, String mechanismName) {
        System.out.print("   [AUDIO] Mixing audio channels... ");
        switch (newTerrain) {
            case LAND -> System.out.println("Playing <Tire_Gravel.wav>");
            case WATER -> System.out.println("Playing <Splash_Loop.wav>");
            case AIR -> System.out.println("Playing <Jet_Whine.wav>");
        }
    }
}