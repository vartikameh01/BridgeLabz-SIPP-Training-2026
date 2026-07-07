class Pair<T, U> {

    private T first;
    private U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First : " + first);
        System.out.println("Second : " + second);
    }
}