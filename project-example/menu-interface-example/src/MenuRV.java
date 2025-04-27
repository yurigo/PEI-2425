public class MenuRV implements Menu{

    @Override
    public void showMenu() {
        System.out.println("Menu RV");
    }

    @Override
    public Integer getInteger(String text) {
        System.out.println("getInteger RV");
        return 0;
    }
}
