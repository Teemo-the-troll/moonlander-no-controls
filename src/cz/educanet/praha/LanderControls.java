package cz.educanet.praha;

public class LanderControls implements ILanderControls {
    @Override
    public int getSecondsOfFuelBurn(int altitude, int velocity) {
        if (velocity == 0)
            return 0;
        return altitude - velocity;
    }
}
