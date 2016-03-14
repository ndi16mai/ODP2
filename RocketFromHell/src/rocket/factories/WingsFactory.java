package rocket.factories;

import gui.Assets;
import rocket.RocketComponent;
import rocket.components.Wings;

/**
 * Created by Wareus on 2016-03-12.
 */
public enum WingsFactory
{
    WING(()->{return new Wings(Assets.wings, 0,20,50,0,0);}),
    BLUE_WINGS(()->{return new Wings(Assets.blueWings, 0,10,100,0,0);});
    private WingProvider wingProvider;

    WingsFactory(WingProvider componentProvider)
    {
        this.wingProvider = componentProvider;
    }

    public Wings get()
    {
        return wingProvider.get();
    }

    private interface WingProvider
    {
        Wings get();
    }
}
