public class cc {
    static int Sum[];
    static int Point[];
    static void  FindMaxCrossingSubarray(int a[])
    {
        int n = a.length;
        Sum = new int[n];
        Point = new int [n];
        int temp=0,jk=0,mn=0,mk=0;
        int h=0,k=0,j=0;
        for(int i=0;i<n;i++)
        {
            temp = temp + a[i];
            Sum[i] = temp;

        }
        for(int i=n-1;i>=0;i--)
        {
            jk =jk +a[i];
            Point[i]=jk;
        }
        for(int i=0;i<n;i++)
        {
            if(Point[i]>mn)
            {
                mn = Point[i];
                j=i;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(Sum[i]>h)
            {
                h = Sum[i];
                k = i;
            }
        }
        System.out.println("最大子数组是原数组的第"+j+"到"+k+"位");

        for(int i =j;i<=k;i++)
        {
            mk =mk + a[i];
        }
        System.out.println(mk);

    }
    public static void main(String [] args)
    {
        int a[] ={-2,11,-4,13,-5,-2,-1};
        FindMaxCrossingSubarray(a);
    }

}