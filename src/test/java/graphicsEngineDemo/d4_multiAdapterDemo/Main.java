package graphicsEngineDemo.d4_multiAdapterDemo;

import org.jetbrains.annotations.NotNull;

import graphicsEngine.GraphicsAdapter;
import graphicsEngine.windows.WindowManager;
import graphicsEngine.windows.WindowUpdater;
import graphicsEngine.windows.WindowConfig;
import graphicsEngine.windows.windowTypes.SimpleWindow;

/**
 * GraphicsEngine demo demonstrating the capability to simultaneously run multiple graphics adapters.
 * See <b><code>ReadMe.md<code/></b> for more info.
 */
public class Main {
    private static GraphicsAdapter adapter1;
    private static GraphicsAdapter adapter2;

    /**
     * The main method.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        adapter1 = new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new SimpleWindow1(this)));
        }};
        adapter2 = new GraphicsAdapter() {{
            newWindow(new WindowUpdater(new SimpleWindow2(this)));
            newWindow(new WindowUpdater(new PagedWindow(this)));
        }};
    }

    private static class SimpleWindow1 extends SimpleWindow {
        //TODO: add javadoc
        public SimpleWindow1(@NotNull WindowManager windowManager) {
            super(windowManager, config(), null);
        }

        /**
         * Hardcoded configuration of a new SimpleWindow1 object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Adapter 1 - Simple window 1";
            int[]
                    size = new int[] {300, 200},
                    location = new int[] {50, 50};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = EXIT_ON_CLOSE;
            return config;
        }

        @Override
        public @NotNull String getWindowKey() {
            return "window";
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }

    private static class SimpleWindow2 extends SimpleWindow {
        //TODO: add javadoc
        public SimpleWindow2(@NotNull WindowManager windowManager) {
            super(windowManager, config(), null);
        }

        /**
         * Hardcoded configuration of a new SimpleWindow2 object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Adapter 2 - Simple window 2";
            int[]
                    size = new int[] {300, 200},
                    location = new int[] {50, 300};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = DISPOSE_ON_CLOSE;
            return config;
        }

        @Override
        public @NotNull String getWindowKey() {
            return "simpleWindow";
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }

    private static class PagedWindow extends SimpleWindow {
        //TODO: add javadoc
        public PagedWindow(@NotNull WindowManager windowManager) {
            super(windowManager, config(), null);
        }

        /**
         * Hardcoded configuration of a new PagedWindow object.
         *
         * @return Window configuration.
         */
        private static WindowConfig config() {
            String title = "Adapter 2 - Paged window";
            int[]
                    size = new int[] {600, 400},
                    location = new int[] {400, 300};
            WindowConfig config = new WindowConfig(title, size, location);
            config.closeOperation = DISPOSE_ON_CLOSE;
            return config;
        }

        @Override
        public @NotNull String getWindowKey() {
            return "pagedWindow";
        }

        /**
         * Adds parts to this window.
         */
        @Override
        public void addParts() {}
    }
}