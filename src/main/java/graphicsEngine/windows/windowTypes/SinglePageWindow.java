package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.WindowConfig;

import javax.swing.JPanel;

import org.jetbrains.annotations.NotNull;

// TODO: finish this and add javadoc
public abstract class SinglePageWindow extends AbstractLayeredWindow {
    public SinglePageWindow(@NotNull WindowConfig config, @NotNull JPanel overlay) {
        super(config, overlay);
    }
}