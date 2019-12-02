package createthreads;

/**
 * @author shenyoujian
 * @create 2019-11-27-11:55
 * 描述：      使用Runnable方式创建线程
 */
public class RunnableStyle implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("使用Runnable方式创建线程");
    }
}
