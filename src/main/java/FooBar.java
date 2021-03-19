import java.util.concurrent.Semaphore;

/**
 * Leetcode 1115:
 * 交替打印FooBar
 */
public class FooBar {
    private int n;
    private Semaphore sema_foo = new Semaphore(0);
    private Semaphore sema_bar = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            sema_foo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            sema_bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            sema_bar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            sema_foo.release();
        }
    }
}