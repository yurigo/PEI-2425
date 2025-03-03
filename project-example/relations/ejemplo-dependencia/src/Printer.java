public class Printer {
    //---

    public Integer getBlue(){
        return 34;
    }

    public Integer getRed(){
        return 100;
    }

    public Integer getGreen(){
        return 100;
    }

    public Integer getBlack(){
        return 100;
    }

    public boolean print(Document d){
        // hace algo con el documento

        String toPrint = "imprimiendo: " +d.showContent();

        System.out.println(toPrint);

        return true;
    }
}
