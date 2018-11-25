package com.qa.hellofresh.support;

import com.qa.hellofresh.exception.FrameworkException;
import com.qa.hellofresh.listener.TestNgListener;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

public class ScreeCapture {
    /**
     * Get current date as string
     * @return String
     */
    public static String getFileName()
    {
        return TestNgListener.getCurrentTest();
    }

    /**
     *
     * @param fileName
     */
    public static void captureDesktopScreenshot(String fileName) throws FrameworkException {
        BufferedImage image = null;
        URL inputStream = ScreeCapture.class.getProtectionDomain().getCodeSource().getLocation();
        String path = inputStream.getPath()+"../screenshots/browser/";

        try
        {
            new File(path).mkdirs();
            image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(image, "png", new File(path + fileName + ".png"));
        }
        catch (AWTException | IOException e)
        {
            throw new FrameworkException(e.getMessage());
        }
    }
}
