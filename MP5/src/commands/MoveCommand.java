package commands;

import core.HanoiModel;

/**
 * Created by Selma on 2016-02-23.
 */
public class MoveCommand implements Command
{
    private HanoiModel model;
    private int start, end;

    public MoveCommand(HanoiModel model, int start, int end) {
        this.model = model;
        this.end = end;
        this.start = start;
    }

    @Override
    public void execute() {
        model.move(start, end);
    }

    @Override
    public void undo() {
        model.move(end, start);
    }
}
