class CheckArmstrong {
    void armstrong(int n)
    {
        int r = 0;
        int m = n;
        int sum = 0;
        while (n>0) {
            r = n % 10;
            sum = sum + r * r * r;
            n = n/10;
        }
        if(m == sum)
            System.out.println("No is Armstrong");
        else
            System.out.println("No is not Armstrong");
    }
    public static void main(String[] args) {
        CheckArmstrong c1 = new CheckArmstrong();
        c1.armstrong(163);
    }
}
