package createthreads;

/**
 * @author shenyoujian
 * @create 2019-11-27-12:00
 * 描述：  用Thread 方式创建线程
 */
public class ThreadStyle extends Thread {

    @Override
    public void run() {
        System.out.println(" 用Thread 方式创建线程");
    }


    public static void main(String[] args) {
        new ThreadStyle().start();
    }
}
