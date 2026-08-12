class Solution {
    public boolean checkString(String s) {
        char arr[]= s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            for( int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                    return false;
                }
            }
            
        }
        return true;
    }
}