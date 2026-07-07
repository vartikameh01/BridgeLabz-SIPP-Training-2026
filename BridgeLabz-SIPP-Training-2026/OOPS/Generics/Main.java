import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> p = new Pair<>("Rahul", 101);
        p.display();

    
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped : " + stack.pop());

        stack.display();
        Integer[] arr = {10, 40, 60, 25, 90};

        System.out.println("Maximum = " + MaxValue.findMax(arr));
        Repository<String> repo = new Repository<>();

        repo.add("Apple");
        repo.add("Banana");
        repo.add("Orange");

        repo.show();

        // Wildcard
        Utility.printList(Arrays.asList(1, 2, 3, 4, 5));
    }
}