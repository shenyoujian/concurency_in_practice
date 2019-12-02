package startthread;

/**
 * @author shenyoujian
 * @create 2019-11-27-15:24
 * 描述： 对比start和run两种启动线程的方式
 */
public class StartAndRunMethod {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };

        runnable.run();

        new Thread(runnable).start();
    }
}
