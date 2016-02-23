package commands;

import core.HanoiModel;

import java.util.Stack;

/**
 * Created by Selma on 2016-02-23.
 */
public class MoveMediator {

    private int selectedRod;
    private boolean isSelected = false;
    private Stack<Command> undoStack, redoStack;
    private HanoiModel model;

    public MoveMediator(HanoiModel model) {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        this.model = model;
    }

    public void selectRod(int rodIndex) {
        if (isSelected) {
            isSelected = false;
            Command command = new MoveCommand(model, selectedRod, rodIndex);
            undoStack.push(command);
            command.execute();
            redoStack.clear();

        } else {
            selectedRod = rodIndex;
            isSelected = true;
        }
    }

    public void undo()
    {
        Command command = undoStack.pop();
        redoStack.push(command);
        command.undo();
    }

    public void redo()
    {
        Command command = redoStack.pop();
        undoStack.push(command);
        command.execute();
    }


}
