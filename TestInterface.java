interface Printable {
    void print();
}

class TestInterface implements Printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.print();
    }
}