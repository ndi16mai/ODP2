package rocket.construct;

import rocket.RocketComponent;
import rocket.components.Engine;
import rocket.components.Hull;
import rocket.components.Wings;
import rocket.construct.RocketBuilderVisitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Wareus on 2016-02-27.
 */
public class RocketBlueprint
{
    private Hull hull;
    private Wings wings;
    private Engine engine;

    public RocketBlueprint(Hull hull, Wings wings, Engine engine)
    {
        this.hull = hull;
        this.wings = wings;
        this.engine = engine;
    }

    public void setHull(Hull hull)
    {
        this.hull = hull;
    }

    public void setWings(Wings wings)
    {
        this.wings = wings;
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public List<RocketComponent> getComponents()
    {
        List<RocketComponent> components = new LinkedList<>();

        components.add(hull);
        components.add(wings);
        components.add(engine);
        return components;
    }
}
