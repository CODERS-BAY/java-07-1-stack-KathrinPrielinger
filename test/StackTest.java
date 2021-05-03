import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {

    @Test
    //Testet, welche Größe eine Liste hat
    public void testSize() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        assertEquals(myStack.size(), 3);
    }

    @Test
    //Testet, welche Größe eine Liste hat - wenn der Stack leer ist, wird 0 zurückgegeben
    public void testSizeZero() {
        IntStack myStack = new IntStack();

        assertEquals(myStack.size(), 0);
    }

    @Test
    //Testet, ob ein neues Element eingefügt wurde und gibt es zurück
    public void testPeek() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        assertEquals(myStack.peek(), 3);
    }



    @Test
    //Testet, ob das letzte Element entfernt wurde und gibt es zurück
    public void testPop() {
        IntStack myStack = new IntStack();

        //4 hinzugügen
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        //1 löschen - dann sinds 3
        assertEquals(myStack.pop(), 4);
    }

    @Test
    //Testet, wenn das letzte Element von einem schon leeren Stack entfernt wird, dass dann 0 zurückgegeben wird
    public void testPopZero() {
        IntStack myStack = new IntStack();

            myStack.push(12);

        //gibt das letzte Element zurück
        assertEquals(myStack.pop(), 12);
        //gibt die länge des leeren Stacks zurück 0
        assertEquals(myStack.size(), 0);
    }

    @Test
    //Testet, wenn von einem schon leeren Stack etwas entfernt wird, dass dann 0 zurückgegeben wird
    public void testSizeStackEmpty() {
        IntStack myStack = new IntStack();

        //gibt die länge des leeren Stacks zurück 0
        assertEquals(myStack.size(), 0);
    }

    @Test

    public void testPush() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(8);

        assertEquals(myStack.size(), 4);
        assertEquals(myStack.pop(), 8);
        assertEquals(myStack.size(), 3);
    }

    @Test
    //Testet, wie viele Elemente entfernt wurden und gibt sie zurück
    public void testPops() {
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        int[] Array = myStack.pop(3);
        Assertions.assertEquals(1, myStack.size());
    }

    @Test
    //Testet, ob die Exception StackTooSmall geworfen wird
    public void testStackTooSmallWithZeroValues() {
        //von Leerem Stack soll etwas abgezogen werden - wift Exception
        Assertions.assertThrows(StackTooSmallException.class, () -> {
            new IntStack().pop();
        });

        }

    @Test
    //Testet, ob die Exception StackTooSmall geworfen wird
    public void testStackTooSmall() {

        //Die Exception, die geworfen werden soll steht vorher, die Auslöser in den {}
        Assertions.assertThrows(StackTooSmallException.class, () -> {
            IntStack myStack = new IntStack();
            myStack.push(1);
            myStack.push(2);
            myStack.push(3);
            myStack.push(4);
            myStack.pop(5);
        });

    }
}



