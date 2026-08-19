class Solution {
    public String solution(String s) {
        String[] str = s.split(" ",-1);
        String answer = "";
        for(String st : str){
            if(st.length()==0){
                answer+=" ";
            } else if(st.length()>0){
                String first = st.substring(0, 1).toUpperCase();
                    
                String rest = st.substring(1).toLowerCase();
                    
                st = first + rest;
                if(answer.length()!=0){
                    answer+=" ";
                }
            }
            answer += st;
        }
        
        return answer;
    }
}