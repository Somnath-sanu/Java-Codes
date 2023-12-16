package dailyQuestions;

public class anagram {
     
        public static boolean isAnagram(String s, String t) {
    
            // SMART MOVE
    
            if (s.length() != t.length()) {
                return false;
            }
    
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            for (int j = 0; j < t.length(); j++) {
                count[t.charAt(j) - 'a']--;
            }
            for (int i = 0; i < count.length; i++) {
                if (count[i] != 0)
                    return false;
    
                /*
                 * count[i] < 0 will get error like what if its more than zero like if 2 a is
                 * present in s and only one in t so 1 will be remaining but in Anagram all
                 * character should be used (its like rearranging after all) so it should be
                 * zero and only zero;
                 */
            }
    
            // for(int i : count){
            // if(i != 0) return false;
            // }
            return true;
        }

        public static void main(String[] args) {
            String s = "anagram";
            String t = "nagaram";
            boolean a = isAnagram(s, t);
            System.out.println(a);
            
         }
    
}
