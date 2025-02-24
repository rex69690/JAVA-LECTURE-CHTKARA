public class LogicalExample {
    public static void main(String[] args) {
        int a = 10 , b  = 5 , c = 15;
        //logical and  return true if both condn are true
        System.out.println("Logical AND : " +((a>b) && (a < c))); ///true
        System.out.println("Logical OR : " +((a>b) || (a < c)));  //true
        System.out.println("Logical NOT : " + !(a < c));  //false
    }
}
