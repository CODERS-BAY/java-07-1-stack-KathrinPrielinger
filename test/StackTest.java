import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

    @Test
    //Testet, welche Größe ein Listenelement hat
    public void testSize() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        int size = myStack.elements.size();
        assertEquals(size, 3);

        assertEquals(myStack.size(), 3);

    }

    @Test
    //Testet, ob ein neues Element eingefügt wurde und gibt es zurück
    public void testPeek() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        boolean peek = myStack.elements.add(4);
        assertEquals(peek, true);

        assertEquals(myStack.peek(), 4);
    }

    @Test
    //Testet, ob das letzte Element entfernt wurde und gibt es zurück
    public void testPop() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        int pop = myStack.elements.remove(3);
        assertEquals(pop, 4);

        assertEquals(myStack.pop(), 3);
    }

    @Test
    //Testet, ob das letzte Element entfernt wurde und gibt es zurück
    public void testPush() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        myStack.push(3);
        assertEquals(myStack.size(), 4);
    }

    @Test
    //Testet, wie viele Elemente entfernt wurden und gibt sie zurück
    public void testPops() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        myStack.pop(3);
        Assertions.assertEquals(1, myStack.size());

    }

}

