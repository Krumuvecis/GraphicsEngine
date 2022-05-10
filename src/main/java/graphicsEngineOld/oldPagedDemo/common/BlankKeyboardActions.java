package graphicsEngineOld.oldPagedDemo.common;

import graphicsEngineOld.utilities.input.InputChecker;

import org.jetbrains.annotations.NotNull;

/**
 * Blank keyboard actions for paged oldPagedDemo.
 */
public class BlankKeyboardActions extends InputChecker {

    /**
     * Creates blank keyboard actions.
     */
    public BlankKeyboardActions() {
        super();
    }

    /**
     * Actions to be performed upon key pressing by key text.
     * This override prevents printing output for undefined keys to console.
     * Overridable for page-specific keyboard actions.
     *
     * @param keyText Text of the pressed key.
     */
    @Override
    public void keyboardActions(@NotNull String keyText) {}
}