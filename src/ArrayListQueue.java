import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

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
    public E pop() throws NoSuchElementException {
        if(size != 0) {
            E returnedItem = theQueue.get(size);
            theQueue.remove(size);
            size--;
            return returnedItem;
        }
        else{
            throw new NoSuchElementException("nothing in queue");
        }
    }
    public E peak() throws NoSuchElementException{
        if(size != 0) {
            E returnedItem = theQueue.get(size);
            return returnedItem;
        }
        else{
            throw new NoSuchElementException("nothing in queue");
        }
    }
    public int getSize(){
        return this.size;

    }
    public boolean isEmpty(){
        return (size == 0);

    }
}
