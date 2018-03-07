package de.jmens;


import org.apache.log4j.Logger;

public class AwsomeLib
{
    private static final Logger LOGGER = Logger.getLogger(AwsomeLib.class);

    public static String getSomeString() {
        LOGGER.info("Logged with log4j 1.2");
        return "Foo";
    }
}
