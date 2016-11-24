/**
 * Created by Teacher on 24.11.2016.
 */
public class ConsoleApp {

    public static void main(String[] args){

        System.out.println("=================");
        System.out.println("Hello World\nPlease enter some symbol:");
        System.currentTimeMillis();
        try {
            int res= System.in.read();
            System.out.println(String.format("res = %d", res));

        } catch (Exception ex){
            System.out.println("Err:" + ex.getMessage());
        }
    }

}
