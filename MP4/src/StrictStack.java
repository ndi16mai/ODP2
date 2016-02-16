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
    public void push(Object item) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
