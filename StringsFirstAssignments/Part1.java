
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {

    String findSimpleGene(String dna)
    {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1)
        {
            return "";
        }   
        int endIndex = dna.indexOf("TAA", startIndex + 3);
        if (endIndex == -1)
        {
            return "";
        }
        String subString = dna.substring(startIndex, endIndex + 3);
        
        if ((endIndex - startIndex) % 3 != 0)
        {
            return "";
        }
        return subString;
    }
    
    void testSimpleGene()
    {
        String dna1 = "ATGAAABBBCCCTAA";
        System.out.println("dna1: " + dna1);
        String result1 = findSimpleGene(dna1);
        System.out.println("dna1 substring: " + result1);
        
        String dna2 = "AAABBBCCCTAA";
        System.out.println("dna2: " + dna2);
        String result2 = findSimpleGene(dna2);
        System.out.println("dna2 substring: " + result2);
        
        String dna3 = "ATGAAABBBCCC";
        System.out.println("dna3: " + dna3);
        String result3 = findSimpleGene(dna3);
        System.out.println("dna3 substring: " + result3);
        
        String dna4 = "ATGAAABBCCCTAA";
        System.out.println("dna4: " + dna4);
        String result4 = findSimpleGene(dna4);
        System.out.println("dna4 substring: " + result4);
        
        String dna5 = "TAAAAABBBCCCATG";
        System.out.println("dna5: " + dna5);
        String result5 = findSimpleGene(dna5);
        System.out.println("dna5 substring: " + result5);
    }
}
