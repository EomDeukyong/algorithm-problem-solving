class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 1. 초기 위치 (pos) 파싱 및 총 분으로 변환
        String[] posParts = pos.split(":");
        int posHours = Integer.parseInt(posParts[0]);
        int posMinutes = Integer.parseInt(posParts[1]);
        int current_pos_total = posHours * 60 + posMinutes;

        // 2. 비디오 총 길이 (video_len) 파싱 및 총 분으로 변환
        String[] videoLenParts = video_len.split(":");
        int videoLenHours = Integer.parseInt(videoLenParts[0]);
        int videoLenMinutes = Integer.parseInt(videoLenParts[1]);
        int video_total = videoLenHours * 60 + videoLenMinutes;

        // 3. op_start 파싱 및 총 분으로 변환
        String[] opStartParts = op_start.split(":");
        int opStartHours = Integer.parseInt(opStartParts[0]);
        int opStartMinutes = Integer.parseInt(opStartParts[1]);
        int op_start_total = opStartHours * 60 + opStartMinutes;

        // 4. op_end 파싱 및 총 분으로 변환
        String[] opEndParts = op_end.split(":");
        int opEndHours = Integer.parseInt(opEndParts[0]);
        int opEndMinutes = Integer.parseInt(opEndParts[1]);
        int op_end_total = opEndHours * 60 + opEndMinutes;
        
        int result=0;
        for(int i=0;i < commands.length;i++){
            if (op_start_total <= current_pos_total && current_pos_total <= op_end_total){
                current_pos_total=op_end_total;
            }
            if (commands[i].equals("next")){
                current_pos_total=current_pos_total+10;
            }
            else{
                current_pos_total=current_pos_total-10;
            }
            if (current_pos_total<0) {
                current_pos_total=0;
            }
            else if (current_pos_total > video_total){
                current_pos_total=video_total;
            }
            else if (op_start_total <= current_pos_total && current_pos_total <= op_end_total){
                current_pos_total=op_end_total;
            }
            else{
                current_pos_total=current_pos_total;
            }
        }
        int finalHours = current_pos_total / 60;
        int finalMinutes = current_pos_total % 60;
        String answer = String.format("%02d:%02d", finalHours, finalMinutes); 

        return answer;
    }
}