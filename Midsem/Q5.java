public interface Stack<T> {
    void push(T item) throws StackOverflowException;
    T pop() throws StackUnderflowException;         
    T peek() throws StackUnderflowException;         
    boolean isEmpty();                             
    int size();                                     
}
class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}
public class ArrayStack<T> implements Stack<T> {
    private T[] data;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
        top = -1; 
    }

    @Override
    public void push(T item) throws StackOverflowException {
        if (top == capacity - 1) {
            throw new StackOverflowException("Stack overflow: Cannot push onto a full stack.");
        }
        data[++top] = item;
    }

    @Override
    public T pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack underflow: Cannot pop from an empty stack.");
        }
        return data[top--];
    }

    @Override
    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack underflow: Cannot peek into an empty stack.");
        }
        return data[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
    
    public int capacity()
    {
        return capacity;
    }
{
public class Main {
    public static void main(String[] args) {
        try {
            ArrayStack<Integer> stack = new ArrayStack<>(5); 
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Top element: " + stack.peek()); 
            System.out.println("Popped element: " + stack.pop()); 
            System.out.println("Size: " + stack.size());      
            stack.push(40);
            stack.push(50);
            stack.push(60); 
            System.out.println("Size: " + stack.size()); 
        } catch (StackOverflowException | StackUnderflowException e) {
            System.err.println("Error: " + e.getMessage());
        
    
