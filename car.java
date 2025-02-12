public class car extends vehicle implements Engine {
    
    
    public void start() {
        System.out.println("The car is starting.");
    }

 
    public void engineType() {
        System.out.println("The car engine is turning on.");
    }

    public static void main(String[] args) {
         car car = new car();  
        car.start();          
        car.engineType();   
    }
}
