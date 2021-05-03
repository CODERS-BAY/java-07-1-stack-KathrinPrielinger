public class Main {

        public static void main (String[] args) {

        //Klasse aufrufen
        IntStack stack = new IntStack();
            //Methoden der Klasse aufrufen
            stack.push(3);
            stack.push(5);
            stack.push(7);
            stack.push(8);
            stack.push(9);
            stack.push(1);

            System.out.println("Die Länge des Stapels ist: " + stack.size());
            System.out.println(stack.toString());

            //Gibt das entfernte Element aus
            System.out.println(stack.pop());
            //Gibt den Stapel ohne das entfernte Element aus
            System.out.println(stack.toString());

            //Gibt das oberste Element aus
            System.out.println(stack.peek());
            //Stapel bleibt unverändert
            System.out.println(stack.toString());

            //Gibt aus, welche Elemente n ich vom Stapel entfernt habe
            stack.pop(3);
            System.out.println(stack.toString());



    }
}
