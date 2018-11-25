package com.qa.hellofresh.exception;

import com.qa.hellofresh.support.ScreeCapture;

/**
 * FrameworkException.java
 * Parent Framework com.cambio.qa.utils.exception class which is extended by com.cambio.qa.utils.exception class
 *
 * @author Shiwantha
 * @version 1.0-SNAPSHOT
 * @since 07/11/2018
 */
public class FrameworkException extends Exception{
//    private static final Logger log = Logger.getLogger(FrameworkException.class);

    /**
     * Constructor passing message only
     * @param message
     */
    public FrameworkException(String message) {
        super(message);
        try {
            ScreeCapture.captureDesktopScreenshot(ScreeCapture.getFileName());
        } catch (FrameworkException e) {
            e.printStackTrace();
        }
//        log.error(message);
    }

    /**
     * Constructor passing message and com.cambio.qa.utils.exception object
     * @param message error message
     * @param e com.cambio.qa.utils.exception object
     */
    public FrameworkException(String message, Exception e) {
        super(message, e);
//        log.error(message, e);
    }
}
