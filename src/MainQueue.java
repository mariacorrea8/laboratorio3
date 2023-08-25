
public class MainQueue {

    public static void main(String[] args) {

        Queue<String> miCola = new Queue<String>();

        miCola.enqueue("Maria");
        miCola.enqueue("Juan");
        miCola.enqueue("Pedro");

        System.out.println("Elementos en la cola:");
        for (String elem : miCola) {
            System.out.println(elem);
        }

        System.out.println("Elemento retirado: " + miCola.dequeue());

        System.out.println("Elementos en la cola después de retirar uno:");
        for (String elem : miCola) {
            System.out.println(elem);
        }

        System.out.println("Elemento retirado: " + miCola.dequeue());

        System.out.println("Elementos en la cola después de retirar dos:");
        for (String elem : miCola) {
            System.out.println(elem);
        }
    }
}

    
