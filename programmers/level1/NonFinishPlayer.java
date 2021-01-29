package level1;

import java.util.HashMap;

public class NonFinishPlayer {
	  public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        HashMap<String,Integer> list = new HashMap();
	        for(String player : participant)
	            list.put(player,list.getOrDefault(player,0)+1);
	        for(String player : completion)
	            list.put(player,list.get(player)-1);
	        for(String key : list.keySet()){
	            if(list.get(key)!=0){
	            answer = key;
	            }
	        }
	            
	        return answer;
	    }
}
