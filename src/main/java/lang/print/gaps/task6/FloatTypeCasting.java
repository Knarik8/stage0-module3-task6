package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void roundNumber(float numberToBeRounded) {
        int result = Math.round(numberToBeRounded);
        System.out.print(result);
    }

    public static void main(String[] args){
        roundNumber(1.99F);

    }
}
