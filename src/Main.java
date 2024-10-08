

        import java.util.Random;
import java.util.Stack;

        public class ArrayStack {
            private int[] stack;
            private int top = -1;
            private int size;

            public ArrayStack(int size) {
                this.size = size;
                this.stack = new int[size];
            }

            public void push(int value) {
                if (top < size - 1) {
                    stack[++top] = value;
                } else {
                    System.out.println("La pila está llena.");
                }
            }

            public int pop() {
                if (top >= 0) {
                    return stack[top--];
                } else {
                    System.out.println("La pila está vacía.");
                    return -1;
                }
            }

            public int getSize() {
                return top + 1;
            }

            public int getRemainingCapacity() {
                return size - (top + 1);
            }

            public boolean isFull() {
                return top == size - 1;
            }

            public static void main(String[] args) {
                // Crear una pila con tamaño de 9
                ArrayStack arrayStack = new ArrayStack(9);

                // Apilar 5 valores numéricos aleatorios
                Random random = new Random();
                for (int i = 0; i < 5; i++) {
                    arrayStack.push(random.nextInt(100)); // Valores aleatorios entre 0 y 99
                }

                // Mostrar el tamaño actual de la pila
                System.out.println("Tamaño actual de la pila: " + arrayStack.getSize());

                // Borrar un dato
                arrayStack.pop();

                // Indicar nuevamente el tamaño actual
                System.out.println("Tamaño actual de la pila después de borrar un dato: " + arrayStack.getSize());

                // Mostrar la cantidad de datos que se pueden agregar a la pila
                System.out.println("Cantidad de datos que se pueden agregar a la pila: " + arrayStack.getRemainingCapacity());

                // Crear dos nuevas pilas utilizando la clase Stack de Java
                Stack<Integer> stack1 = new Stack<>();
                Stack<Integer> stack2 = new Stack<>();

                // Agregar 7 datos a la primera pila
                for (int i = 0; i < 7; i++) {
                    stack1.push(random.nextInt(100));
                }

                // Transferir los datos de la primera pila a la segunda en orden inverso
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }

                // Mostrar contenido de las dos pilas
                System.out.println("Contenido de la primera pila (deben estar vacías después de la transferencia): " + stack1);
                System.out.println("Contenido de la segunda pila (en orden inverso): " + stack2);
            }
        }

    }
}

