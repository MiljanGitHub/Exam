public class Local {
    private int x;
    private void m1(){ }


    public Tester getT(){
        class Tester{}
        final Tester tester = new Tester();
        return tester;
    }

}