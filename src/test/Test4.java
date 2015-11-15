package test;

/**
 * Created by admin on 20.10.2015.
 */
public final class Test4
{
    class Inner {
        void test() {
            if (Test4.this.flag) ; {
                sample();
            }
        }
    }

    private boolean flag = true;
    int b;

    public void sample() {
        System.out.println("out");
    }

    public Test4()
    {
        (new Inner()).test();

    }


    public static void main(String[] args)
    {
//        new Test4();

        float d = 10 / 0;
        System.out.println(d);
    }

    public void first(int a) {

    }

    public double first(boolean x) {
        return 5;
    }

    public abstract class Test5{
        public abstract void tst();
    }
}
