package View;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JButton extends JLabel {

    private Shape shape;
    private int redius;

    public JButton(String text, int redius, int textSize) {
        super(text);
        this.redius = redius;
        setFont(new Font("Segoe UI", Font.BOLD, textSize));
        setOpaque(false);
        setForeground(GUIConstants.white);
        setHorizontalAlignment(CENTER); 
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(GUIConstants.blue);
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, redius, redius);
        super.paintComponent(g);
    }

    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, redius, redius);
        }
        return shape.contains(x, y);
    }
}
