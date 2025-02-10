public class Point2 {
    private int id = 0;
    private int x = 0;
    private int y = 0;

    public static int contador = 0;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
        contador++;
        this.id = contador;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void print() {

        System.out.println("Coordinates(" + id + "/" + contador + "): " + x + ", " + y);
    }

 }
