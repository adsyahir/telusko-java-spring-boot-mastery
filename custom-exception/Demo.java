import java.util.logging.Logger;
import java.util.logging.Level;

class NavinException extends RuntimeException {

    public NavinException(String message) {
        super(message);
    }
}
public class Demo {

    private static final Logger logger = Logger.getLogger(Demo.class.getName());

    public static void main(String a[]) {

        int i = 0;
        int j = 0;

        try {
            logger.info("Starting division");

            j = 18 / i;

            if (j == 0) {
                throw new NavinException("Result is zero");
            }

        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Arithmetic error occurred", e);
            throw e;

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unexpected exception", e);
        }

        logger.info("Result: " + j);
        logger.info("Program finished");
    }
}