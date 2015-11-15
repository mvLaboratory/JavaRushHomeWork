package test.bits;

/**
 * Created by admin on 20.10.2015.
 */
public class Solution
{
    static int n = 100;

    public static void main(String[] args)
    {
        String bin = Integer.toBinaryString(n);
        bin = bin.replace('0', '2');
        bin = bin.replace('1', '0');
        bin = bin.replace('2', '1');

        System.out.println(Integer.valueOf(bin, 2));
    }
}
