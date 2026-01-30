package Observer;

import model.TerrainType;

public class HeadsUpDisplay implements VehicleObserver {
    @Override
    public void onTerrainChanged(TerrainType newTerrain, String mechanismName) {
        System.out.println("   [HUD] UI Refreshing...");
        System.out.println("   [HUD] Active System: " + mechanismName);
        
        if (newTerrain == TerrainType.AIR) {
            System.out.println("   [HUD] >> Altimeter ON | Artificial Horizon ON");
        } else if (newTerrain == TerrainType.WATER) {
            System.out.println("   [HUD] >> Depth Gauge ON | Sonar ON");
        } else {
            System.out.println("   [HUD] >> Speedometer ON | Tachometer ON");
        }
    }
}