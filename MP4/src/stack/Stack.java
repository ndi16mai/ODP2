package stack;

/**
 * Created by Wareus on 2016-02-16.
 */
public interface Stack<E>
{
    void push(E item);
    E pop();
    E peek();
    boolean isEmpty();
}
