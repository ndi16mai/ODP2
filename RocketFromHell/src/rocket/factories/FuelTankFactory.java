package rocket.factories;

import gui.Assets;
import rocket.components.FuelTank;
import rocket.components.Wings;

/**
 * Created by Wareus on 2016-03-12.
 */
public enum FuelTankFactory
{
    FUEL_TANK(()->{return new FuelTank(0,20,0,0,0,100);});

    private FuelProvider fuelProvider;

    FuelTankFactory(FuelProvider componentProvider)
    {
        this.fuelProvider = componentProvider;
    }

    public FuelTank get()
    {
        return fuelProvider.get();
    }

    private interface FuelProvider
    {
        FuelTank get();
    }
}
