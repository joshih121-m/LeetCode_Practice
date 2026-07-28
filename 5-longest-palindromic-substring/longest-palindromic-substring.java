class Solution {
    public String longestPalindrome(String s) {

        char a[] = s.toCharArray();

        int maxLen = 0;
        String ans = "";

        for(int i = 0; i < s.length(); i++)
        {
            for(int j = i; j < s.length(); j++)
            {
                boolean flag = true;

                int left = i;
                int right = j;

                while(left < right)
                {
                    if(a[left] != a[right])
                    {
                        flag = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if(flag)
                {
                    int len = j - i + 1;

                    if(len > maxLen)
                    {
                        maxLen = len;
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }

        return ans;
    }
}