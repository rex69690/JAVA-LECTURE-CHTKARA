public interface Logger {


    abstract void log();
    default void info(String msg){
        System.out.println("INFO"+ "  " + msg);
    }

    static void error(String msg){
        System.out.println("ERROR"+ "  " + msg);
    }

}
