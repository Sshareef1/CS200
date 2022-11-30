public int centeredAverage(int[] nums) {
 int min = nums[0];
 int max = nums[0];
 int total = nums[0];
 int avg;
 
 for(int i=1; i<nums.length; i++){
   
   total = total + nums[i];
   
   if(nums[i]<min)
   min = nums[i];
   
   if(nums[i]>max)
   max = nums[i];
 }
  
  total = total - min - max;
  
  avg = total/(nums.length - 2);
  return avg;
  
  
}

