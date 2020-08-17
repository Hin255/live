package com.live;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try {
            Robot robot=new Robot();
            BufferedImage bi=robot.createScreenCapture(new Rectangle(1920,1080));
            ImageIO.write(bi, "png", new File("shot.png"));

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//        } catch (AWTException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
