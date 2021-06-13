package bettersring;

import java.util.function.*;

public class BetterSring 
{
    public String betterString(String S1, String S2, BiPredicate<String,String> p)
    {
        return (p.test(S1, S2) ? S1 : S2);
    }
    
    public boolean Letter(String S)
    {
        // convert string to char array
        char[] chars = S.toCharArray();
        
        // iterate over char array
        for (char ch: chars) 
        {
            if (!Character.isLetter(ch))
            {
                return false;
            }
        }  
        return true;
    }
    
    public static void main(String[] args) 
    {
        BetterSring StringUtils = new BetterSring();
        
        String String1 = "Fady";
        String String2 = "Nasser";
        String longer = StringUtils.betterString(String1, String2,(s1,s2)-> s1.length() > s2.length());
        String first = StringUtils.betterString(String1, String2,(s1,s2)-> true);
        System.out.println("The Longer is " + longer);
        System.out.println("The First is " + first);
        
        String S1 = "Fady1996";
        String S2 = "FadyNasser";
        boolean isLetter1 = StringUtils.Letter(S1);
        boolean isLetter2 = StringUtils.Letter(S2);
        System.out.println(isLetter1);
        System.out.println(isLetter2);
    }  
}