class Solution {
    public int firstUniqChar(String s) {
        int count =0;
        for(int i =0;i<s.length();i++)
        {

            int j=0;
            boolean found = false;
            while(j<s.length())
            {
                if (i != j && s.charAt(i) == s.charAt(j))
                {   found = true;
                    count++;
                    break;
                }
                j++;
            }
            if(!found)
            {
                return i;
            }
        }
       return -1; 
    }
}