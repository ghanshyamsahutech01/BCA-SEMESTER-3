class FindSumOfDigit {
    void sumOfDigit(int n)
    {
        int r = 0;
        int m = n;
        int sum = 0;
        while (n>0) {
            r = n % 10;
            sum = sum + r;
            n = n/10;
        }
        System.out.println("Sum of Digit = " + sum);
    }
    public static void main(String[] args) {
        FindSumOfDigit f1 = new FindSumOfDigit();
        f1.sumOfDigit(146);
    }
}
