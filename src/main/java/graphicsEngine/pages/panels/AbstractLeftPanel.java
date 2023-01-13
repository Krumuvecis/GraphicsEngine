package graphicsEngine.pages.panels;

import org.jetbrains.annotations.Nullable;

import graphicsEngine.colors.SimpleColorScheme;
import graphicsEngine.panels.BorderProperties;
import graphicsEngine.panels.VerticalPanel;

//TODO: add javadocs
public abstract class AbstractLeftPanel extends VerticalPanel {
    //TODO: add javadoc
    public AbstractLeftPanel(@Nullable SimpleColorScheme colors,
                             int width,
                             @Nullable BorderProperties borderProperties) {
        super(colors, width, borderProperties);
    }
}