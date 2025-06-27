public class Main {
    public static void main(String[] args) {
        MyLogger logger1 = MyLogger.getInstance();
        MyLogger logger2 = MyLogger.getInstance();

        logger1.log("First log message.");
        logger2.log("Second log message.");

        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works).");
        } else {
            System.out.println("Logger instances are different (Singleton failed).");
        }
    }
}

