class Logger {
    private static Logger instance;
    // Removed the private keyword to allow instantiation in the LoggerExample2 to test the error handling
    Logger() {
        if (instance != null) {
            throw new RuntimeException("Logger instance already exists.");
        }
    }
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
public class LoggerExample2 {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started.");
        logger.log("This is a singleton logger example.");
        // Attempt to create another instance of Logger to test the error handling
        try {
            Logger anotherLogger = new Logger();
        } catch (RuntimeException e) {
            logger.log("The logger cannot be instatiated directly. \n" + e.getMessage());
        }
    }
}