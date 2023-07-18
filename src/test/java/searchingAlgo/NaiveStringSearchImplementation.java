package searchingAlgo;

public class NaiveStringSearchImplementation {
    public static void main(String[] args) {
        String str = "lorie loled";
        String target = "lo";
        System.out.println(solution(str, target));
    }

    public static int solution(String str, String target){
        int count=0;
        for(int i=0; i<str.length(); i++){
            for(int e=0; e<target.length(); e++){
                if(target.charAt(e) != str.charAt(i+e)){
                    break;
                }
                if(e==target.length()-1){
                    count++;
                }
            }
        }
        return count;
    }
}
