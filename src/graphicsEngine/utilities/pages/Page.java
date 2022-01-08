package graphicsEngine.utilities.pages;

import graphicsEngine.GraphicsManager;
import graphicsEngine.utilities.containers.LayerContainer;
import graphicsEngine.utilities.input.InputChecker;
import graphicsEngine.utilities.simpleParts.Background;
import graphicsEngine.utilities.simpleParts.DrawablePart;

import java.awt.*;
import java.util.ArrayList;

public abstract class Page extends LayerContainer {
    public InputChecker inputCheck;

    public Page(ArrayList<DrawablePart> layers) {
        super(null, null, new ArrayList<>() {{
            add(new Background(GraphicsManager.data.palette.backgroundColor));
            addAll(layers);
        }});
        inputCheck = new InputChecker();
    }

    public void draw(Graphics g) {
        int[] pageSize = GraphicsManager.data.windowParameters.drawSize;
        super.draw(g, new int[] {0, 0}, pageSize);
    }
}