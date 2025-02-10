public class Point {
    private int[] coordinates = new int[2];

    public void move(int x, int y){
        coordinates[0] = x;
        coordinates[1] = y;
    }

    public void print(){
        System.out.println("Coordinates: " + coordinates[0] + ", " + coordinates[1] + ".");
    }

 }
