import javax.swing.JFrame;
import java.awt.*;

public class XianyuZhiWang {

    //使用常量定义界面尺寸 长641  宽479
    public static final int WIDTH = 750;
    public static final int HEIGHT = 1433;

    //常量定义游戏状态 开始=0 运行=1 暂停=2 结束=-1
    public static final int START = 0;
    public static final int RUNNING = 1;
    public static final int PAUSE = 2;
    public static final int OVER = 3;
    protected int state = START;


    public void paint(Graphics graphics){

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("咸鱼之王");
        XianyuZhiWang xyzw = new XianyuZhiWang();
   //     frame.add();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH+6,HEIGHT+80);
        frame.setResizable(true);
        frame.setVisible(true);


    }
}
