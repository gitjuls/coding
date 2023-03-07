package string;

public class CountTheLetters {
    public static void main(String[] args) {
        String str = "java";
        int res = count(str,'a');
        int res2 = count(str);
        System.out.println(res);
        System.out.println(res2);
    }

    private static int count(String str, char ch){
        int res = 0;
        for(int eachChar : str.toCharArray()){
            if(eachChar == ch){
                res ++;
            }
        }
        return res;
    }

    private static int count(String str){
        int res = str.toCharArray().length;
        return res;
    }
}
