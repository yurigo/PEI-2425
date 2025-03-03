public class Main {
    public static void main(String[] args) {

        Document d = new Document("Hello World");
        Printer p = new Printer();

        p.print(d);

    }
}