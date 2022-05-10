package graphicsEngine.oldPagedDemo.pages.menuPages.demoSelectPage;

import graphicsEngine.engine.GraphicsManager;

import graphicsEngine.oldPagedDemo.common.BlankKeyboardActions;
import graphicsEngine.oldPagedDemo.pages.demoPages.page1.Page_1;
import graphicsEngine.oldPagedDemo.pages.demoPages.page2.Page_2;

import org.jetbrains.annotations.NotNull;

//TODO: add javadoc
class KeyboardActions extends BlankKeyboardActions {

    //TODO: add javadoc
    KeyboardActions() {
        super();
    }

    //TODO: add javadoc
    @Override
    public void keyboardActions(@NotNull String keyText) {
        switch (keyText) {
            case "1" -> changePage(Page_1.PAGE_KEY);
            case "2" -> changePage(Page_2.PAGE_KEY);

            //add new oldPagedDemo pages here

            default -> super.keyboardActions(keyText);
        }
    }

    private void changePage(String key) {
        GraphicsManager.pages.setActivePage(key);
    }
}