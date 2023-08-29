public class DemoFib {
    public static void main(String[] args) {
        System.out.println(fib(100));
    }
    
    private static int fib(int num) {
        if(num<=1){
            return num;
        }else{
            return fib(num-1)+ fib(num-2);
        }
    }
}
