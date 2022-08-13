public class CalculateMoneyInLeetCodeBank {
    public static void main(String[] args) {
    totalMoney(20);
    }
    public static int totalMoney(int n) {
        int tempCountTill8Day = 0;
        int count = 1;
        int actualCount = 0;
        int tempCount = 0;
        for (int i = 0; i < n; i++){
            if (tempCountTill8Day == 7){
                tempCountTill8Day = 0;
                tempCount = count++;
            }
            tempCount = tempCount + 1;
            actualCount += tempCount;
            tempCountTill8Day ++;
        }

    return actualCount;
    }

}
