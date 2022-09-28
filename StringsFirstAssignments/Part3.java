
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    
    boolean twoOccurrences(String stringa, String stringb)
    {
        int count = 0;
        for (int i = 0; i < stringb.length() - stringa.length(); i++)
        {
            String compare = stringb.substring(i, i + stringa.length());
            System.out.println("Compare: " + compare + " " + stringa);
            if (stringa.equals(compare))
            {
                count++;
            }
        }
        System.out.println("Counter: " + count);
        if (count > 1)
        {
            return true;
        }
        return false;
    }
    
    String lastPart(String stringa, String stringb)
    {
        int subString =  stringb.indexOf(stringa);
        
        if (subString == -1)
        {
            return stringb;
        }
        
        return stringb.substring(subString + stringa.length());
        
    }
    
    void testing()
    {
        /*String stringa = "by";
        String stringb = "A story by Abby Long";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(twoOccurrences(stringa, stringb));
        
        stringa = "a";
        stringb = "banana";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(twoOccurrences(stringa, stringb));
        
        stringa = "a";
        stringb = "melocoton";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(twoOccurrences(stringa, stringb));*/
        
        String stringa = "zoo";
        String stringb = "forest";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(lastPart(stringa, stringb));
        
        stringa = "an";
        stringb = "banana";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(lastPart(stringa, stringb));
    }
    
}
