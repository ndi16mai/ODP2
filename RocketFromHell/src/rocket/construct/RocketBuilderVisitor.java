package rocket.construct;

import rocket.RocketComponent;

/**
 * Created by Wareus on 2016-02-27.
 */
public class RocketBuilderVisitor
{
    private RocketBuilder builder;

    public RocketBuilderVisitor(RocketBuilder builder)
    {
        this.builder = builder;
    }

    public void visit(RocketComponent rocketComponent)
    {
        builder.addComponent(rocketComponent);
    }
}
