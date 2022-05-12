package rotorCalculator.graphics.panels.leftPanel;

import graphicsEngine.panels.PanelColors;

import javax.swing.*;

import com.google.inject.internal.Nullable;

public class Column2 extends AbstractColumn {
    public static final int WIDTH = 200;

    protected Column2(@Nullable PanelColors panelColors) {
        super(WIDTH, panelColors, true);
    }

    @Override
    public void addParts(JPanel p) {
        //
    }
}