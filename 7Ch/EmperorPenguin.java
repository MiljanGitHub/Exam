class Penguin {
    public int getHeight() { return 3; }
    public void printInfo() {
        System.out.print(this.getHeight());
    }
}
public class EmperorPenguin extends Penguin {
    public int getHeight() { return super.getHeight(); }
    public static void main(String []fish) {
        new EmperorPenguin().printInfo();
    }
}