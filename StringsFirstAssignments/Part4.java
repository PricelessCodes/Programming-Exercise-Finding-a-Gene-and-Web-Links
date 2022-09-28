
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.*;

public class Part4 {
    
    void FindingWebLinks()
    {
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        for (String s : ur.lines()) 
        {
            int subString =  s.toLowerCase().indexOf("youtube.com");
            if (subString != -1)
            {
                int start = s.lastIndexOf("\"", subString);
                int end = s.indexOf("\"", subString + 1);
                System.out.println(s.substring(start + 1, end));
            }
        }
    }

    void testPart4()
    {
        FindingWebLinks();
    }
}
