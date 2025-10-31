class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length;i++){
            for(int i2=i+1;i2<nums.length;i2++){
                for(int i3=i2+1;i3<nums.length;i3++){
                    if (isPrime(nums[i]+nums[i2]+nums[i3])){
                        answer=answer+1;
                    }
                }
            }
        }

        return answer;
    }
    
    public boolean isPrime(int num){
        for(int i=2;i<=(int) Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}