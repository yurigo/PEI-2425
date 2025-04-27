import java.util.ArrayList;

public class Main {

    private static ArrayList<Company> companies = new ArrayList<Company>();

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String nif1 = "ACME12345";

        Company c1 = new Company(nif1);

        String workerName1 = "Alice";

//         Worker w1 = new Worker(workerName1);
//         c1.addWorker(w1);

        c1.addWorker(new Worker(workerName1));

        String workerName2 = "Bob";

//        Worker w2 = new Worker(workerName2);
//        c1.addWorker(w2);

        c1.addWorker(new Worker(workerName2));

        companies.add(c1);

        Company c2 = new Company("LaSalle12345");

        String workerName3 = "Charlie";

//        Worker w3 = new Worker(workerName3);
//        c2.addWorker(w3);

        c2.addWorker(new Worker(workerName3));

        companies.add(c2);

//        System.out.println(c1.getInfo());
//        System.out.println(c2.getInfo());

        for (Company c : companies){
            System.out.println(c.getInfo());
        }

    }
}