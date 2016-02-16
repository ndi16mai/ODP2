import java.util.List;

/**
 * Created by Selma on 2016-02-16.
 */
public interface Stack<E> {

    E push(E item);
    E pop();
    E peek();
    boolean isEmpty();

}
