public class AssignmentExample {
    public static void main(String[] args) {
        int a = 10;
        a+=5;
        System.out.println("add assign : " + a);  //15

        a-=2;
        System.out.println("subtract assign : " + a); //13
        
        a*=2;
        System.out.println("multiply assign : " +  a); //26

        a /=2;
        System.out.println("divide assign : " + a); //13
    }
}
