package graphicsEngineSandbox.graphics.controlWindow.leftPanel;

import graphicsEngine.parts.SimpleLabel;

import javax.swing.border.LineBorder;
import java.awt.*;

import org.jetbrains.annotations.NotNull;

class TextLabel extends SimpleLabel {
    protected static final int HEIGHT = 80;
    private static final Color TEXT_COLOR = Color.blue;

    protected TextLabel(@NotNull Color borderColor) {
        super("A label object", TEXT_COLOR);
        setPreferredSize(new Dimension(LeftPanel.WIDTH, HEIGHT));

        //TODO: remove this when tests are completed
        setBorder(new LineBorder(borderColor));
    }

    @Override
    public Dimension getMaximumSize() {
        Dimension size = getPreferredSize();
        size.width = Integer.MAX_VALUE;
        return size;
    }
}