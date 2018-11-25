package com.qa.hellofresh.exception;

/**
 * ApplicationException.java
 * Handle application related exceptions
 *
 * @author Shiwantha
 * @version 1.0-SNAPSHOT
 * @since 07/11/2018
 */
public class ApplicationException extends FrameworkException {

//    private static final Logger log = Logger.getLogger(ApplicationException.class);

    /**
     * Constructor passing message only
     *
     * @param message error message
     */
    public ApplicationException(String message) {
        super(message);
//        log.error(message);
    }

    /**
     * Constructor passing message and com.cambio.qa.utils.exception object
     *
     * @param message error message
     * @param e com.cambio.qa.utils.exception object
     */
    public ApplicationException(String message, Exception e) {
        super(message, e);
//        log.error(message, e);
    }

}

