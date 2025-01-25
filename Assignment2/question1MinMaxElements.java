public class question1MinMaxElements {
    public static void main(String[] args) {
        int numbers[] = {1,2,4,4,6,-1};
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : numbers){
            max = (max < i) ? i : max;
            min = (min > i) ? i : min;
        }
        System.out.printf("[%d, %d]", max, min);
    }
}
