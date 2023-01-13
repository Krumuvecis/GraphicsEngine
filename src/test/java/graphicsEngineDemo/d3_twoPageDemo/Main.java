package graphicsEngineDemo.d3_twoPageDemo;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowUpdater;

/**
 * GraphicsEngine demo demonstrating support of multiple pages within a single window.
 * See <b><code>ReadMe.md<code/></b> for more info.
 */
public class Main {
    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new Window(this)));
        }};
    }
}