package createthreads;

/**
 * @author shenyoujian
 * @create 2019-11-27-14:51
 * 描述： 同时用两种方法会怎么样
 */
public class BothRunnableThread {

    public static void main(String[] args) {
        new Thread(new RunnableStyle() {
            @Override
            public void run() {
                System.out.println("使用Runnable方式创建线程");
            }
        }) {
            @Override
            public void run() {
                System.out.println("使用Thread方式创建线程");
            }
        }.start();
    }
}
