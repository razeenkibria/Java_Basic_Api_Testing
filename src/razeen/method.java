package razeen;

public class method {

    static int x=10;
           int y=20;

           public void case1(){
               System.out.println("x+y"+(x+y));
    }

           public static void case2()
           {
               method ob=new method();
               System.out.println("x+y"+(x+ob.y));
           }





    public static void sum(int a,int b) {
        System.out.println("sum= "+(a+b));
    }

    public static void sum(int a,int b,int c) {
        System.out.println("sum= "+(a+b+c));
    }

    public void mul(int a,int b) {
        System.out.println("Mul= "+(a*b));
    }
    public static void main(String[] args) {
       sum(12,14);
       sum(24,45);
       sum(23,45,67);

        method ob=new method();
        ob.mul(23,67);

    }
}
