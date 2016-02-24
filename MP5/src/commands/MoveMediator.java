package commands;

import core.HanoiModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Selma on 2016-02-23.
 */
public class MoveMediator {

    private int selectedRod;
    private boolean isSelected = false;
    private boolean recording = false;
    private Stack<Command> undoStack, redoStack;
    private List<Command> macro;
    private HanoiModel model;

    public MoveMediator(HanoiModel model) {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
        macro = new ArrayList<>();
        this.model = model;
    }

    public void selectRod(int rodIndex) {
        if (isSelected) {
            isSelected = false;
            Command command = new MoveCommand(model, selectedRod, rodIndex);
            undoStack.push(command);
            command.execute();
            redoStack.clear();

            if(recording)
            {
                macro.add(command);
            }

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

    public void record()
    {
        recording = true;
        macro.clear();
    }

    public void stopRecording()
    {
        for (Command command: macro)
        {
            if(recording)
                undo();
        }
        recording = false;
    }

    public void playMacro()
    {
        if(!recording)
            for(Command command: macro)
            {
                command.execute();
                undoStack.push(command);
            }
    }

}
