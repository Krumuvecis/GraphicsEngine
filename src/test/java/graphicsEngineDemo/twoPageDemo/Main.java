package graphicsEngineDemo.twoPageDemo;

import graphicsEngine.AbstractGraphicsAdapter;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.AbstractWindow;

/**
 * Copy-pasted from simplest demo
 * TODO: finish this
 */
public class Main {

    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        new GraphicsAdapter();
    }

    private static class GraphicsAdapter extends AbstractGraphicsAdapter {
        protected GraphicsAdapter() {
            super();
            graphics.newWindow(new Window());
        }
    }

    private static class Window extends AbstractWindow {
        public Window() {
            super(new WindowConfig());
        }

        @Override
        public void addParts() {}
    }
}