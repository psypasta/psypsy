package test;

import java.awt.*;
import java.net.URI;

public class Browser {

    public static void main(String[] args) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI("www.youtube.com"));
            }
        }
        catch(java.net.URISyntaxException e){
        }
        catch(java.io.IOException e){
        }
    }
}
