public class question3Shift0ToEnd {
    public static void main(String[] args) {
        int numbers[] = {0,2,0,4,0,5,1,0};
        int resNumbers[] = new int[numbers.length];
        int zeroCount = 0, resIndex = 0;
        for (int i : numbers){
            if (i != 0){
                resNumbers[resIndex++] = i;
            }
            else{
                zeroCount++;
            }
        }
        for (int i = 0; i<zeroCount; i++){
            resNumbers[resIndex++] = 0;
        }
        for (int i : resNumbers){
            System.out.print(i+" ");
        }
    }
}
