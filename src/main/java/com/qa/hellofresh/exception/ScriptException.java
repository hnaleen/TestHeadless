package com.qa.hellofresh.exception;

/**
 * ScriptException.java
 * Handle Script related exceptions.
 *
 * @author Shiwantha
 * @version 1.0-SNAPSHOT
 * @since 07/11/2018
 */
public class ScriptException extends FrameworkException {

    //private static final Logger log = Logger.getLogger(ScriptException.class);

    /**
     * Constructor passing message only
     *
     * @param message error message
     */
    public ScriptException(String message) {
        super(message);
        //log.error(message);
    }

    /**
     * Constructor passing message and com.cambio.qa.utils.exception object
     *
     * @param message error message
     * @param e com.cambio.qa.utils.exception object
     */
    public ScriptException(String message, Exception e) {
        super(message, e);
        //log.error(message, e);
    }

}

