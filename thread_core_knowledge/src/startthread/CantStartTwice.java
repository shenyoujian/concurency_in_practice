package startthread;

/**
 * @author shenyoujian
 * @create 2019-11-27-15:36
 * 描述：  不能启动两次start方法
 */
public class CantStartTwice {

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.start();
    }
}
