package rocket.construct;


import rocket.RocketComponent;

/**
 * Created by Wareus on 2016-02-27.
 */
public class RocketDirector
{
    private RocketBuilderVisitor visitor;
    private RocketBlueprint blueprint;

    public RocketDirector(RocketBuilderVisitor visitor, RocketBlueprint blueprint)
    {
        this.visitor = visitor;
        this.blueprint = blueprint;
    }

    public void build()
    {
        for (RocketComponent component: blueprint.getComponents())
        {
            component.accept(visitor);
        }
    }
}
