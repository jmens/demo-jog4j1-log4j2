package de.jmens;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main( String[] args )
    {
        LOGGER.info("Logged with log4j 2.10: {}", AwsomeLib.getSomeString());
    }
}
