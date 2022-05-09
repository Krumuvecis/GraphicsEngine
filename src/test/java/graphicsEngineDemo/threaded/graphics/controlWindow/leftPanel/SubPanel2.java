package graphicsEngineDemo.threaded.graphics.controlWindow.leftPanel;

import graphicsEngineDemo.threaded.data.Data;
import graphicsEngineSwingBeta.PanelColors;

import java.awt.*;

class SubPanel2 extends AbstractSubPanel {
    protected static final int HEIGHT = 60;
    private static final int[] TEXT_LOCATION = new int[]{5, 20};

    protected SubPanel2(PanelColors panelColors, boolean border) {
        super(
                new int[]{LeftPanel.WIDTH, HEIGHT},
                panelColors,
                border);
    }

    @Override
    protected final void drawText(Graphics g) {
        g.setColor(colors.text);
        g.drawString("X: " + Data.getX(), TEXT_LOCATION[0], TEXT_LOCATION[1]);
    }
}