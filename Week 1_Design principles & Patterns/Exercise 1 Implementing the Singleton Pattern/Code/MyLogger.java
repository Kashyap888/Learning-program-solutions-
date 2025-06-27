public class MyLogger {
    private static MyLogger instance;

    private MyLogger() {
        System.out.println("Logger initialized.");
    }

    public static MyLogger getInstance() {
        if (instance == null) {
            instance = new MyLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
