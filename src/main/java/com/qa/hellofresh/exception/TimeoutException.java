package com.qa.hellofresh.exception;

/**
 * TimeoutException.java
 * Handle Timeout related exceptions.
 *
 * @author Shiwantha Lakmal
 * @version 1.0-SNAPSHOT
 * @since 07/11/2018
 */
public class TimeoutException extends FrameworkException {
    //private static final Logger log = Logger.getLogger(TimeoutException.class);

    /**
     * Constructor passing message only
     *
     * @param message error message
     */
    public TimeoutException(String message) {
        super(message);
        //log.error(message);
    }

    /**
     * Constructor passing message and com.cambio.qa.utils.exception object
     *
     * @param message error message
     * @param e com.cambio.qa.utils.exception object
     */
    public TimeoutException(String message, Exception e) {
        super(message, e);
        //log.error(message, e);
    }
}

