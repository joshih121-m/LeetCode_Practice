class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max=salary[0];
        int sum =0;
        for(int i =0;i<salary.length;i++)
        {
            sum = sum + salary[i];
        
        if( salary[i] > max )
        {
            max = salary[i];
        }
        if(salary[i] < min ){
            min = salary[i];
            }
        }
    int total = sum-min-max;
  return (double) total / (salary.length - 2);
    
    }
}