package Observer;

import model.TerrainType;

public interface VehicleObserver {
    void onTerrainChanged(TerrainType newTerrain, String mechanismName);
}