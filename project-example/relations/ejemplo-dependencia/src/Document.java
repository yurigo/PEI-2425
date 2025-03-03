public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String showContent(){
        String xxx = "***" + content + "***";
        return xxx;
    }
}
