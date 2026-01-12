class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i=0;i<dic.length;i++){
            for(int i2=0;i2<spell.length;i2++){
                int index=0;
                int count=0;
                while(true){
                    index=dic[i].indexOf(spell[i2],index);
                    if(index==-1){
                        break;
                    } else {
                        count=count+1;
                    }
                    index=index+1;
                }
                if(count!=1){
                    break;
                }
                if(i2==spell.length-1){
                    answer=1;
                }
                
            }

        }
        return answer;
    }
}