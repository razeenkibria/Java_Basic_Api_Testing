package razeen;

public class Variable {

    static int num=100;

    public static void main(String[] args) {
        int localVariable=150;
        System.out.println("Local Variable: "+localVariable);
        System.out.println("Set as a Global Variable:"+num);
    }
}
