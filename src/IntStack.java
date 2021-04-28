import java.util.ArrayList;
import java.util.List;

public class IntStack {

    public List<Integer> elements = new ArrayList<Integer>();

    //fügt ein neues Element oben in den Stack ein
    public void push(int newElement) {
        elements.add(newElement);
    }

    //gibt die Anzahl der Elemente im Stack zurück
    public int size() {
        return elements.size();
    }

    //gibt das letzte Elemente des Stacks zurück und entfernt dieses vom Stack
    public int pop() {
        if (elements.size() <= 0) {
            throw new StackTooSmallException();
        }
        int removedElement = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return removedElement;
    }

    //gibt das letzte Elemente des Stacks zurück ohne den Stack zu modifizieren
    public int peek() {
        if (elements.size() <= 0) {
            throw new StackTooSmallException();
        }
        int peekElement = elements.get(elements.size() - 1);
        return peekElement;
    }

    //gibt die letzten n Elemente des Stacks zurück und entfernt diese vom Stack
    public int[] pop(int n) {
        List<Integer> toReturn = new ArrayList<>();
        //Zählt vom Stapel von oben so viele runter, wie ich angebe (n)
        for (int i = 0; i < n; i++) {
            toReturn.add(pop());
        }
        int[] returnArray = new int[toReturn.size()];
        //Speichert alle runtergezählten Elemente vom Stapel in ein neues Array
        for (int i = 0; i < toReturn.size(); i++) {
            returnArray[i] = toReturn.get(i);
        }
        return returnArray;
    }

    //Elemente als StringArray ausgeben
    @Override
    public String toString() {
        return "IntStack{" +
                "elements=" + elements +
                '}';
    }
}
