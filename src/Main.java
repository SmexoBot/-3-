import java.lang.reflect.Array;

public class Main {
    public String[] goMaze (String[] inputArr){
        int startIndex1 = 0;
        int startIndex2 = 0;
        int finishIndex1 = 0;
        int finishIndex2 = 0;
        boolean containsS = false;
        boolean containF = false;
        out:
        for(int i = 0; i < inputArr.length; i++){
            for(int j = 0; j < inputArr[i].length(); j++){
                if(inputArr[i].charAt(j) == 's'){
                    containsS = true;
                    startIndex1 = i;
                    startIndex2 = j;
                } else if (inputArr[i].charAt(j) == 'f') {
                    containF = true;
                    finishIndex1 = i;
                    finishIndex2 = j;
                }
                if(containF && containsS){
                    break out;
                }
            }
            if(!containsS || !containF){
                return null;
            }
        }
        if(startIndex1 > finishIndex1){
            if(startIndex2 > finishIndex2){

            } else if (startIndex2 == finishIndex2) {

            }else {

            }
        } else if (startIndex1 == finishIndex1) {

        } else {

        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}