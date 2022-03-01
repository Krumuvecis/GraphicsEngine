package graphicsEngine.demo.simple.withPages.common.header;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.utilities.simpleParts.DrawablePart;
import graphicsEngine.presets.panels.CommonHeader;

import java.util.ArrayList;

import org.jetbrains.annotations.NotNull;

// TODO: add javadoc
public class HeaderWithButtons extends CommonHeader {

    // TODO: add javadoc
    public HeaderWithButtons(int height, @NotNull PanelColors panelColors) {
        super(height, panelColors, prepareParts(getHeight(height)));
    }

    // TODO: add javadoc
    private static ArrayList<DrawablePart> prepareParts(int height) {
        int logoWidth = 200, buttonWidth = 100;
        int[] logoSize = new int[] {logoWidth, height};
        int[] buttonSize = new int[] {buttonWidth, height};
        return new ArrayList<>() {{
            add(new Logo(logoSize, new boolean[] {true, false}));
            add(new HeaderButton1(buttonSize));
            add(new HeaderButton2(buttonSize));
        }};
    }
}