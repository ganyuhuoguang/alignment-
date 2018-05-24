import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class alignment extends Applet{

  /**
	 * 
	 */
	private static final long serialVersionUID = 2008L;
	private Event arg0;
	private Object arg1;

	@Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub
        super.resize(400, 300);
     //   super.action(arg0, arg1); 
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        // clr[]存储颜色
        Color clr[] = { Color.blue, Color.black, Color.red, Color.yellow, Color.green ,Color.orange };
        // x[]存储起始x坐标
        int[] x = { 85, 165, 245, 125, 205, 136};
        // y[]存储起始y坐标
        int[] y = { 70, 70, 70, 135, 135, 235 };
        // 设置画笔的粗细
        ((Graphics2D) g).setStroke(new BasicStroke(5.0f));
        for (int loop = 0; loop < clr.length; loop++) {
            g.setColor(clr[loop]);
            // 注意x,y是外切矩形的起始坐标，假设半径为90
            g.drawOval(x[loop], y[loop], 90, 90);
        }
    }



}
