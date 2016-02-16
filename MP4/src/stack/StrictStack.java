package stack;


public class StrictStack<E> implements Stack<E>
{
    private java.util.Stack<E> stack;

    public StrictStack()
    {
        stack = new java.util.Stack<>();
    }

    public StrictStack(java.util.Stack<E> stack)
    {
        this.stack = stack;
    }

    @Override
    public void push(E item)
    {
        stack.push(item);
    }

    @Override
    public E pop()
    {
        return stack.pop();
    }

    @Override
    public E peek()
    {
        return stack.peek();
    }

    @Override
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
}
