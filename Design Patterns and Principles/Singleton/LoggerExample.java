class Logger {
    private static Logger instance;
    private Logger() {}
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
public class LoggerExample {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started.");
        logger.log("This is a singleton logger example.");
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the same logger instance: " + (logger == logger1));
    }
}