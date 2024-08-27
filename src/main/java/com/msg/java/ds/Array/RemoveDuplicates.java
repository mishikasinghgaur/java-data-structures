package Array;

import java.util.LinkedHashSet;

public class REmoveDuplicates {
    String removeDups(String str) {
        
        LinkedHashSet<Character> seen = new LinkedHashSet();
        StringBuilder obj = new StringBuilder();
        
        for (char ch: str.toCharArray()) {
            
            if(seen.add(ch)) {
                obj.append(ch);
            }
        }
        
        return obj.toString();
        
        
    }

    String removeDupsSecond(String str) {
        
        boolean[] seen = new boolean[256];
        StringBuilder obj = new StringBuilder();
        
        for (char ch: str.toCharArray()) {
            
            if(!seen[ch]) {
                seen[ch] = true;
                obj.append(ch);
            }
        }
        
        return obj.toString();
        
        
    }
}
    

