package pl.com.sda.rafal.zientara.javalon.week22.swing.components;


import java.awt.*;
import java.util.ArrayList;

public class FigureComponent extends Component {

    private static final int PADDING = 20;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int left = PADDING;
        int right = getWidth() - 2 * PADDING;
        int top = PADDING;
        int bottom = getHeight() - 2 * PADDING;

        int width = right - left;
        int height = bottom - top;

        int size = Math.min(width, height);

//        g.drawRect(left, top, width, height);

        double circle = 2 * Math.PI;
        int count = 10;

        double deltaArc = circle / count;
        double arc = 0;
        for (int i = 0; i < count; i++) {
            double x = getWidth() / 2f;
            double y = getHeight() / 2f;

            x += Math.sin(arc) * size / 2;
            y += Math.cos(arc) * size / 2;

            Point point = new Point((int) x, (int) y);
            g.drawOval(point.x - 5, point.y - 5, 10, 10);
            arc += deltaArc;
        }


    }
}
