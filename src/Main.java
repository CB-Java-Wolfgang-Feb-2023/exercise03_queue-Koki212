public class Main {
    public static void main(String[] args) {
        // Ein Objekt der Klasse "Queue" erstellen
        Queue2 q = new Queue2();

        // Versuch ein Element aus der Queue zu löschen
        // Queue ist allerdings zurzeit leer
        // Somit Meldung "Queue is empty" ist zu erwarten
        q.dequeue();

        // Befüllen der Queue
        for (int i = 1; i <= q.size; i++) {
            q.enqueue(i);
        }

        // Einfügen eines 6. Elementes
        // Meldung erwartet "Queue is full"
        q.enqueue(10);
        // Anzeigen der Elemente in der Queue
        q.display();

        // Entfernt das erste Element (First in, first out)
        q.dequeue();
        // Anzeigen der Elemente in der Queue
        q.display();

        // Entfernt das erste Element (First in, first out)
        q.dequeue();
        // Anzeigen der Elemente in der Queue
        q.display();

        // Entfernt das erste Element (First in, first out)
        q.dequeue();
        // Anzeigen der Elemente in der Queue
        q.display();
    }
}
