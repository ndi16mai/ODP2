package rocket;

import gui.Assets;
import rocket.components.Wings;

/**
 * Created by Wareus on 2016-03-12.
 */
public enum RocketComponentFactory
{
    WING(()->{return new Wings(Assets.wings, 0,20,100,0,0);}),
    HULL(()->{return new Wings(Assets.hull, 0,20,100,0,0);}),
    ENGINE(()->{return new Wings(Assets.engine, 0,20,100,0,0);});
    private ComponentProvider componentProvider;

    RocketComponentFactory(ComponentProvider componentProvider)
    {
        this.componentProvider = componentProvider;
    }

    private interface ComponentProvider
    {
        RocketComponent getComponent();
    }
}
