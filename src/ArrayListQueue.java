import java.util.List;
import java.util.ArrayList;

public class ArrayListQueue<E> {
    ArrayList<E> theQueue;
    private int size = 0;

    public ArrayListQueue(){
        List<E> theQueue = new ArrayList<E>();
    }

    public void push(E element){
        theQueue.add(element);
        size++;
    }
    public E pop(){
        E returnedItem = theQueue.get(size);
        theQueue.remove(size);
        size--;
        return returnedItem;
    }
    public E peak(){
        E returnedItem = theQueue.get(size);
        return returnedItem;
    }
    public int getSize(){
        return this.size;

    }
    public boolean isEmpty(){
        return (size == 0);

    }
}
