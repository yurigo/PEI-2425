import java.util.ArrayList;

public class Company {
    private String nif;
    private ArrayList<Worker> workers;

    public Company(String nif) {
        this.nif = nif;
        this.workers = new ArrayList();
    }

    public void addWorker(Worker w) {
        this.workers.add(w);
    }

    public String getInfo(){
        // ACME12345: t1, t2, t3

        String info = "";
        info +=  this.nif + ": ";

//        for (int i = 0; i < this.worker.size(); i++) {
//            info += this.worker.get(i).getName();
//        }

        for (Worker w : this.workers){
            info += w.getName() + ", ";
        }

        return info.substring(0, info.length() - 2) + ".";

    }
}
