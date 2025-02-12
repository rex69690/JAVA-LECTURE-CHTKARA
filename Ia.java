public interface Ia {

    abstract void disp();
    default void defaultDemo(){
        System.out.println("demo of default methods in an interface");
    }

    static void staticDemo(){
        System.out.println("demo of static methods in an ibterface");
    }

}