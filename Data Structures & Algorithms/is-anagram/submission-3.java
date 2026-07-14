class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1=new HashMap<>();
        //HashMap<Character, Integer> map2=new HashMap<>();
        int n1=s.length();
        int n2=t.length();
        if(n1!=n2)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)-1);
        }
        for(char c:map1.keySet())
        {
            if(map1.get(c)!=0)
            {
                return false;
            }
        }
        return true;
    }
}
