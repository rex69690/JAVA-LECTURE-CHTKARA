public class ConsoleLogger implements Logger {

    @Override 
    public void log() {
        System.out.println("I am log method");
    };
    
    public static void main(String args[]){
        ConsoleLogger c = new ConsoleLogger();
        c.log();
        c.info("this contains info");
        Logger.error("this have error 303");
    }
};

//static methods cannot be inherited needs to be called using original class in which  it was declared
