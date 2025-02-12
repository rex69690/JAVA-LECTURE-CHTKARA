public class Duck implements Flyable , Swimmable {


    public void fly(){
        System.out.println("Duck is able to fly");
    }

    public void swim(){
        System.out.println("Duck can also swim!!!");
    }

    public static void main(String args[]){

        Duck d1 = new Duck();
        d1.fly();
        d1.swim();

    }

}
