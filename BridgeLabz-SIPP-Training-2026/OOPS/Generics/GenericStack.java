import java.util.ArrayList;

class Stack<T> {

    ArrayList<T> list = new ArrayList<>();

    public void push(T value) {
        list.add(value);
    }

    public T pop() {

        if (list.isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }

        return list.remove(list.size() - 1);
    }

    public void display() {
        System.out.println(list);
    }
}