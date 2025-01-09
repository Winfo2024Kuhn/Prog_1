package Lektion_8;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;


public class ÜB4_StringMethoden {

    public static void main(String[] args) throws IOException {
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";

        int beginningIndexURL = seite.indexOf("src=\"") + 5;
        String subString = seite.substring(beginningIndexURL);
        int endingIndexURL = subString.indexOf("\"");
        String finalString = subString.substring(0, endingIndexURL);
        System.out.println(finalString);

        String downloadUrl = finalString;
        URL url = new URL(downloadUrl);
        BufferedImage image = ImageIO.read(url);
        ImageIO.write(image, "png", new File("bild.png"));
    }
}

