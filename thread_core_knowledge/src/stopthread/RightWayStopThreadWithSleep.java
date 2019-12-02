package stopthread;

/**
 * @author shenyoujian
 * @create 2019-11-27-16:19
 * 描述：     run方法内没有sleep或wait方法时停止线程
 */
public class RightWayStopThreadWithSleep implements  Runnable{

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new RightWayStopThreadWithSleep());
        thread.start();
        /**
         * 主动一秒中断
         */
        thread.sleep(1000);
        thread.interrupt();
    }

    /**
     * 打印出最大数的一半中是10000的倍数的数字
     */
    @Override
    public void run() {
        int num = 0;
        while(num <= Integer.MAX_VALUE/2) {
            if (!Thread.currentThread().isInterrupted() && num % 10000 == 0 ) {
                System.out.println(num + "是10000的倍数");
            }
            num++;
        }
        System.out.println("任务执行完毕！");
    }
}
