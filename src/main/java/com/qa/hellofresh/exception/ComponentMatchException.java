package com.qa.hellofresh.exception;


public class ComponentMatchException extends FrameworkException {

//    private static final Logger log = Logger.getLogger(ComponentMatchException.class);

    /**
     * Constructor passing message only
     *
     * @param message error message
     */
    public ComponentMatchException(String message) {
        super(message);
//        log.error(message);
    }

    /**
     * Constructor passing message and com.cambio.qa.utils.exception object
     *
     * @param message error message
     * @param e com.cambio.qa.utils.exception object
     */
    public ComponentMatchException(String message, Exception e) {
        super(message, e);
//        log.error(message, e);
    }
}
