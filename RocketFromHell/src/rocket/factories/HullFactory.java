package rocket.factories;

import gui.Assets;
import rocket.components.Hull;

/**
 * Created by Wareus on 2016-03-14.
 */
public enum HullFactory
{
    HULL(()->{return new Hull(Assets.hull, 0,100,0,100,1);}),
    BLUE_WINGS(()->{return new Hull(Assets.blueHull, 0,100,0,200,5);});
    private HullProvider hullProvider;

    HullFactory(HullProvider componentProvider)
    {
        this.hullProvider = componentProvider;
    }

    public Hull get()
    {
        return hullProvider.get();
    }

    private interface HullProvider
    {
        Hull get();
    }
}
