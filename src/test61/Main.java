package test61;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
public class Main {

    static void shuffle(int a[], int seed) {
        int n = a.length;
        Random rand = new Random(seed);
        for (; n > 1; n--) {
            int r = rand.nextInt(n);
            int tmp = a[n - 1];
            a[n - 1] = a[r];
            a[r] = tmp;
        }
    }

    static void restore(int a[], int seed) {
        /* ÌîĞ´´úÂë */
    	int n=a.length;
    	
   	 Random rand = new Random(seed);
   	 Stack<Integer> s=new Stack<Integer>();
       for (; n > 1; n--) 
   	{
   		s.push(rand.nextInt(n));
   		
   	}
       n=a.length;
       for (int i=2; i<=n; i++) 
   	{
       	int x=s.pop();
       	//System.out.println("out="+x);
   		 int tmp = a[i-1];
            a[i-1] = a[x];
            a[x] = tmp;
   		
   	}
    }

    public static void main(String[] args) {
        int seed, n, i;
        int[] a, b;
        Scanner input = new Scanner(System.in);
        {
            seed = input.nextInt();
            n = input.nextInt();
            a = new int[n];
            for (i = 0; i < n; ++i)
                a[i] = input.nextInt();
        }
        b = Arrays.copyOf(a, a.length);
        shuffle(a, seed);
        restore(a, seed);
        for (i = 0; i < n; i++) {
            if (a[i] != b[i])
                break;
        }
        if (i == n)
            System.out.printf("Success!\n");
        else
            System.out.printf("Failed!\n");
    }
}
