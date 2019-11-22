package commonpref;
/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: ["music","muse","mule"]
Output: “mu”
Example 2:
Input: ["dog","","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Input: ["miss", "mission","mistake", "misunderstand"]
Output: "mis"
*/

import java.util.Arrays;

public class ComLongPrefix {

    public static void main(String[] args) {
        ComLongPrefix comLongPrefix = new ComLongPrefix();

        String[] example1 = {"music","muse","mule"};
        //Output: “mu”
        String[] example2 = {"dog","","car"};
        //Output: ""
        String[] example3 = {"miss", "mission","mistake", "misunderstand"};
        //Output: "mis"

        System.out.println(comLongPrefix.commonPrefix(example1));
        System.out.println(comLongPrefix.commonPrefix(example2));
        System.out.println(comLongPrefix.commonPrefix(example3));

    }

    public String commonPrefix(String[] words) {

        String prefix = words[0]; // first word as possible prefix

        // smallest word as possible prefix
        for(String word : words) {
            if(word.length() < prefix.length()) {
                prefix = word;
            }
        }

        // removing not matched characters from possible prefix
        for(String word : words) {
            for(int i = prefix.length()-1; i > 0; i--) {
                if(prefix.charAt(i) != word.charAt(i)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    break;
                }
            }
        }
        return prefix;
    }

}
