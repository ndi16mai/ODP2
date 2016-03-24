package rocket.factories;

import gui.Assets;
import rocket.components.Engine;
import rocket.components.Hull;

/**
 * Created by Wareus on 2016-03-14.
 */
public enum EngineFactory
{
    ENGINE(()->{return new Engine(Assets.engine, 200,50,0,0,0,0);}),
    BLUE_ENGINE(()->{return new Engine(Assets.blueEngine, 400,50,0,0,0,0);});
    private HullProvider hullProvider;

    EngineFactory(HullProvider componentProvider)
    {
        this.hullProvider = componentProvider;
    }

    public Engine get()
    {
        return hullProvider.get();
    }

    private interface HullProvider
    {
        Engine get();
    }
}
