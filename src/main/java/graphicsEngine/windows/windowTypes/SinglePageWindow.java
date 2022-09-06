package graphicsEngine.windows.windowTypes;

import graphicsEngine.windows.AbstractPage;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.presets.SimpleOverlay;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

// TODO: finish this and add javadoc
public abstract class SinglePageWindow extends AbstractLayeredWindow {
    public SinglePageWindow(@NotNull WindowConfig config, @Nullable SimpleOverlay overlay) {
        super(config, overlay);
    }

    @Override
    public final void addParts() {
        add(addPage());
    }

    public abstract AbstractPage addPage();
}