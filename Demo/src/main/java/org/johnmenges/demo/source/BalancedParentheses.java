
package org.johnmenges.demo.source;

import java.util.ArrayList;
import java.util.Random;
import javax.json.JsonValue;
import org.johnmenges.demo.JsonHelper;
import org.johnmenges.demo.NameValuePair;

/**
 *
 * @author JohnMenges
 */
public class BalancedParentheses {
    public static JsonValue getTests()
    {
        return JsonHelper.getArray(tests);
    }
    
    private static final int maxStringLength = 100;
    private static final ArrayList<NameValuePair<String>> tests = new ArrayList<>();
    private static final Random random = new Random();

    static
    {
       tests.add(new NameValuePair<>("Random Balanced", getRandomBalancedTest()));
       tests.add(new NameValuePair<>("Random Unbalanced", getRandomUnbalancedTest()));
    }
    
    private static String getRandomBalancedTest()
    {
        char[] a = new char[random.nextInt(maxStringLength)];
        int openCount = 0;
        for (int i = 0; i < a.length; i++)
        {
            ArrayList<Character> options = new ArrayList<>();
            if (openCount > 0) options.add(')');
            if (a.length-i > openCount+1) options.add('(');
            if (a.length-i > openCount) options.add((char)('a'+random.nextInt(26)));
            a[i] = options.get(random.nextInt(options.size()));
        }
        return new String(a);
    }
    
    private static String getRandomUnbalancedTest()
    {
        char[] a = new char[random.nextInt(maxStringLength)];
        int openCount = 0;
        for (int i = 0; i < a.length; i++)
        {
            ArrayList<Character> options = new ArrayList<>();
            options.add('(');
            options.add((char)('a'+random.nextInt(26)));
            if (i < a.length-1 || openCount != 1)
                options.add(')');
            a[i] = options.get(random.nextInt(options.size()));
        }
        return new String(a);
    }
}
