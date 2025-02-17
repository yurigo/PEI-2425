public class Car {
    private static int platesUS = 0;
    private static int platesUK = 0;
    private String plate;

    public static Car createUSCar(){
        // 00001US

        String plate = añadeCeros(platesUS) + "US";
        platesUS++;

        return new Car(plate);
    }

    private static String añadeCeros(int valor){
        if (valor < 10) return "0000" + valor;
        if (valor < 100) return "000" + valor;
        if (valor < 1000) return "00" + valor;
        if (valor < 10000) return "0" + valor;
        return "00000";
    }


    public static Car createUKCar(){
        // UK00001
        String plate = "UK" + añadeCeros(platesUK);
        platesUK++;
        return new Car(plate);
    }

    private Car(String plate){
        this.plate = plate;
    }

    public String getPlate() {
        return plate;
    }
}
