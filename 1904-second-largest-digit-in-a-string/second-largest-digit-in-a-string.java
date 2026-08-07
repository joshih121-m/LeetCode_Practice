class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int smax=-1;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )
            {
                continue;
            }
            if (ch >= '0' && ch <= '9') {

                int num = ch - '0';

                if (num > max) {
                    smax = max;
                    max = num;
                } else if (num != max && num > smax) {
                    smax = num;
                }
            }
        }

        return smax;
    }
}