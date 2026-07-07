import java.util.ArrayList;
class Repository<T> {

    ArrayList<T> items = new ArrayList<>();

    public void add(T obj) {
        items.add(obj);
    }

    public void show() {

        for (T item : items) {
            System.out.println(item);
        }
    }
}