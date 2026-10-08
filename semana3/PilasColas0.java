/*
 * CC-232 - Semana 3, lunes: pila enlazada.
 * Basado en las operaciones push/pop de SLList de Pat Morin.
 */
public class PilasColas0 {
    static class LinkedStack {
        static class Node{
            char x;
            Node next;
            Node(char x, Node next){
                this.x=x;
                this.next = next;
            }
        }

        private Node head;
        private int n;

        int size() {
            return n; 
        }
        boolean isEmpty() {     // si n=0 --> true
            return n == 0;      // si n!= 0 --> false
        }

        // TODO(alumno): insertar en la cabeza. Costo O(1).
        void push(char x) {
            Node u;
            u = new Node(x, head);

            head = u;
            n++;                    // TERMINADO
        }

        // TODO(alumno): retirar y retornar la cabeza. Lanzar una excepción
        // si la pila está vacía. Costo O(1).
        char pop() {
            if(isEmpty()){
                throw new java.util.NoSuchElementException("La pila está vacia");
            }else{
                char x = head.x;
                head = head.next;
                n--;

                return x;
            }
        }
    }

    static String reverse(String text) {
        LinkedStack stack = new LinkedStack();
        for (char c : text.toCharArray()){
            stack.push(c);
        }
        StringBuilder out = new StringBuilder();
        while (!stack.isEmpty()){
            out.append(stack.pop());
        }
        return out.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Resultado de reverse para estructura: " + reverse("estructura"));
            System.out.println("Esperado: arutcurtse");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}