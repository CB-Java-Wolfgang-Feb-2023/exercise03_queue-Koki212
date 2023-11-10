public class Queue2 {
    // Initialisierung eines Arrays für die Queue
    int size = 5;
    int items[] = new int[size];
    int front;
    int rear;

    Queue2() {
        front = -1;
        rear = -1;
    }

    // Methode zum Check ob Queue VOLL ist
    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    // Methode zum Check ob Queue LEER ist
    boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    // Methode zum Befüllen der Queue
    void enqueue(int element) {
        // wenn Queue voll ist
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            if (front == -1) {
                // Wenn ein Element eingefügt wird, wird der Index "front" zu 0
                front = 0;
            }
            rear++;
            // Einfügen eines Elementes am Schluss
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    // Methode zum Löschen eines Elementes aus der Queue
    int dequeue() {
        int element;

        // wenn Queue leer ist
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            // löschen des ersten Elementes
            element = items[front];

            // wenn nur noch 1 Element in der Queue ist
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                // das nächste Element als "front" definieren
                front++;
            }
            System.out.println(element + " deleted");
            return element;
        }
    }

    // Methode zum Anzeigen der Elemente in der Queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            // Anzeigen des ersten Elementes
            System.out.println("\nFront Index -> " + front);

            // Anzeigen aller (restlichen) Elemente in der Queue
            System.out.println("Items -> ");
            for (int i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }

            // Anzeigen des letzten Elementes
            System.out.println("\nRear Index -> " + rear);
        }
    }
}
