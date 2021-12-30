package graphicsEngine;

import graphicsEngine.data.GraphicsData;
import graphicsEngine.pages.PageManager;
import graphicsEngine.utilities.input.InputManager;

public class GraphicsManager {

    public static GraphicsData data;
    public static PageManager pages;


    public static GraphicsClass graphics;
    public static InputManager input;
    public static ExitManager exitManager;

    public static boolean running;

    public static void initialize(){
        System.out.println("GraphicsManager: Initializing.");

        data = new GraphicsData(true, true);
        pages = new PageManager();

        graphics = new GraphicsClass();
        graphics.initialize();

        exitManager = new ExitManager();
        input = new InputManager(
                graphics.window, data.windowParameters,
                exitManager);

        data.windowParameters.minimized = false;
        running = true;
    }

    public static void run(){
        if (!data.windowParameters.minimized) {
            graphics.main();
            userInputCheck();
        }
    }

    private static void userInputCheck(){
        //Button.checkButtonActions(this); //uz ekr�na redzamo pogu notikumi
        //InputData.keyboardActionCheck(); //keyboard nospiesto pogu notikumi
    }
}