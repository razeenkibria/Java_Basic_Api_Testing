package assignment;

public class cal {

    public static void cal(String conditions, int num1,int num2){
        if(conditions.equals("+")){
            System.out.println("Sum "+(num1+num2));
        }
        if(conditions.equals("-")){
            System.out.println("Sub "+(num1-num2));
        }
        if(conditions.equals("*")){
            System.out.println("Mul "+(num1*num2));
        }
        if(conditions.equals("/")){
            System.out.println("Div "+(num1/num2));
        }
    }

    public static void main(String[] args) {
               cal("+",44,56);
               cal("-",50,40);
               cal("*",67,89);
               cal("/",20,10);
    }
}
