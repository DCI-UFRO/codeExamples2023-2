public class Principal1 {
    public static void main(String[] args) {
        int a = 2000;
        if(a%4==0){
            if(a%100==0){
                if(a%400==0){
                    System.out.println("Es bisiesto");
                }else {
                    System.out.println("no es bisiesto");
                }
            }else{
                System.out.println("es bisiesto");
            }
        }else {
            System.out.println("no es bisiesto");
        }
    }
}
