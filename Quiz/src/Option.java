public class Option {
    private String text;
    private boolean isTrue;

    Option(String text, boolean isTrue) {
        this.text = text;
        this.isTrue = isTrue;
    }

    // getters
    public boolean isTrue(){
        return this.isTrue;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
