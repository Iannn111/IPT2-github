public class Calculator {

    public static void main (String[] args){
        
        int a = 45;
        int b = 12;

        System.out.println("Addition :" + add(a,b));
        System.out.println("Subtraction :" + sub(a,b));
    }

        public static int add(int a, int b){
            return a + b;
        }
        public static int sub(int a, int b){
            return a - b;
        }
}
