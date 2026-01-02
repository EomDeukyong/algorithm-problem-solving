class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = -1;
        int maxY = -1;
        for(int i=0;i<wallpaper.length;i++){
            int index=0;
            while(index!=-1){
                index=wallpaper[i].indexOf('#',index);
                if(index!=-1){
                    if(i<minY){
                        minY=i;
                    }
                    if(i+1>maxY){
                        maxY=i+1;
                    }
                    if(index<minX){
                        minX=index;
                    } 
                    if (index+1>maxX) {
                        maxX=index+1;
                    }
                    index+=1;
                }
            }
            
        }
        int[] answer = {minY,minX,maxY,maxX};
        return answer;
    }
}