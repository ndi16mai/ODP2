package commands;

/**
 * Created by Selma on 2016-02-23.
 */
public interface Command {

    void execute();
    void undo();
}
