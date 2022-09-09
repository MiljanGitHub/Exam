class Animal{
    public   Object str2(int i) {
        return null;
    }
}

public class Lion extends Animal{
    public  static Object str2(int i) { //DOES NOT COMPILE; not that in both cases child method is being reported for a compiler error
        return null;
    }
}
