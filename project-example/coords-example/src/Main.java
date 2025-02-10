public class Main {
    public static void main(String[] args) {
        Point2 p1 = new Point2(1,1);
        Point2 p2 = new Point2(2,2);
        Point2 p3 = new Point2(2,2);
        Point2 p4 = new Point2(2,2);

        Circle c1 = new Circle(60.0);
        Circle c2 = new Circle(3.14);


        c1.setRadius(44.6754);

        c1.printCircle();
        c2.printCircle();

        p1.move(99, 99);
        p2.move(99, 99);
        p3.move(99, 99);
        p4.move(99, 99);

        p1.print();
        p2.print();
        p3.print();
        p4.print();

    }
}