class CreateFactorial {
    int factorial(int n)
    {
        int fact = 1;
        for(int i=n; i>=1; i--)
            fact = fact * i;

        return fact;
    }

    public static void main(String[] args) {
        CreateFactorial c1 = new CreateFactorial();
        System.out.println("Fact = " + c1.factorial(5));
    }
}
