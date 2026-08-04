class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length())
        {
            return -1;
        }
        else
        {
            for(int i =0;i<=haystack.length()-needle.length();i++)

            {
                char ch = haystack.charAt(i);
                boolean found = false;
                for(int j =0;j<needle.length();j++)

                {
                    if(haystack.charAt(i+j)!= needle.charAt(j)){
                    found = true;
                    break;
                    }

                }
                if(!found)
                {
                    return i;
                }
            }
        }
       return -1; 
    }
}