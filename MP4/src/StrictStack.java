import java.util.List;

/**
 * Created by Selma on 2016-02-16.
 */
public class StrictStack<E> implements Stack{
    List<E> list;

    StrictStack()
    {

    }
    StrictStack(List<E> list)
    {
        this.list = list;
    }


    @Override
    public Object push(Object item) {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
