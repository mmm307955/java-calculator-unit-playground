//문자열 계산 클래스.
public class StringCalculator {
    public int calculateString(String... numbers) {
        int sum = 0;
        for(String number: numbers){
            if(!number.isEmpty()){
                int value = Integer.parseInt(number);
                if(value < 0){
                    throw new RuntimeException("음수는 사용할 수 없습니다: " + value);
                }
                 sum += value;
            }
        }
        return sum;
    }
}
