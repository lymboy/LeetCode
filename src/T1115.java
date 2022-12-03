import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author 小怪兽
 * @version 1.0
 * @since 2022-10-27
 */
public class T1115 {
}

class FooBar {
    private int n;

    BlockingQueue<Integer> fooQueue = new LinkedBlockingQueue<>(1);
    BlockingQueue<Integer> barQueue = new LinkedBlockingQueue<>(1);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            fooQueue.put(i);
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            barQueue.put(i);
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barQueue.take();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooQueue.take();
        }
    }
}