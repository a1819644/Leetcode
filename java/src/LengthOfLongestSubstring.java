class Solution {
    public int lengthOfLongestSubstring(String s) {
        
    int max = 0;
        (int i =0; i < s.length(); i++){
        ArrayList<Character> temp = new ArrayList<>();
        for (int j = i; j < s.length(); j++){
            if (temp.isEmpty()){
                temp.add(s.charAt(j)); 
            }else if(temp.contains(s.charAt(j))){
                 b reak;
            }else {
                temp.add(s.charAt(j));
            }
        }
        max = Math.max(max, temp.size());
    }

  

return max;
    }
}