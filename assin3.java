class assin3
{
 
    static boolean findNoIsDivisibleOrNot(int a[], int n)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % n != 0)
                return false;
        }
        return true;
    }
 
        public static void main(String[] args)
    {
        int a[] = {14, 12, 4, 18};
        int n = 2;
        if (findNoIsDivisibleOrNot(a, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}