package assignment;

public class method_using {

    public static void even_od(int number){
        if(number%2==0){
            System.out.println(number+" even");
        }
        else{
            System.out.println(number+" odd");
        }
    }

    public static void main(String[] args) {
                  even_od(3);
                  even_od(4);
    }
}
