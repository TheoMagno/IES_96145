package log4j;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App 
{

    private static Logger logger = LogManager.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        logger.debug("Debug log message!!!");
        logger.info("Info log message!!!");
        logger.error("Error log message!!!", new NullPointerException("NullError"));
    }
}
