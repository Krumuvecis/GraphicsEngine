package graphicsEngine.presets;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//TODO: add javadocs
public class SimpleOverlay extends JPanel {
    private static final Color DEFAULT_COLOR = new Color(0, 0, 0, 100);
    private Color color;

    public SimpleOverlay(@Nullable Color color) {
        setOpaque(false);
        this.color = Objects.requireNonNullElse(color, DEFAULT_COLOR);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        fillBackground(g);
    }

    private void fillBackground(@NotNull Graphics g) {
        g.setColor(color);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}