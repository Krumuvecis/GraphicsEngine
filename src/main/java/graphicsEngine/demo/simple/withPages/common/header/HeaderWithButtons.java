package graphicsEngine.demo.simple.withPages.common.header;

import graphicsEngine.engine.data.colors.PanelColors;
import graphicsEngine.utilities.simpleParts.DrawablePart;
import graphicsEngine.utilities.containers.AlignmentType;
import graphicsEngine.utilities.containers.PartContainer;
import graphicsEngine.presets.panels.CommonHeader;

import java.util.ArrayList;
import java.util.Objects;

import com.google.inject.internal.Nullable;
import org.jetbrains.annotations.NotNull;

// TODO: add javadoc
public abstract class HeaderWithButtons extends CommonHeader {
    public static final int
            HEIGHT = 60,
            BUTTON_WIDTH = 150;

    public static final double LOGO_PROPORTIONS = (double) 16 / 9;

    // TODO: add javadoc
    public HeaderWithButtons(int height,
                             @NotNull PanelColors panelColors,
                             @Nullable ArrayList<DrawablePart> buttons) {
        super(height, panelColors, prepareParts(getHeight(height), buttons));
    }

    private static ArrayList<DrawablePart> prepareParts(int height,
                                                        @Nullable ArrayList<DrawablePart> buttons) {
        return new ArrayList<>() {{
            add(prepareLogo(height));
            add(alignButtonsRight(height, buttons));
        }};
    }

    private static Logo prepareLogo(int height) {
        return new Logo(getLogoSize(height), new boolean[] {true, false});
    }

    private static int[] getLogoSize(int height) {
        return new int[] {
                (int) (height * LOGO_PROPORTIONS),
                height};
    }

    private static PartContainer alignButtonsRight(int height,
                                                   @Nullable ArrayList<DrawablePart> buttons) {
        return new PartContainer(
                null, null,
                addStartButton(height, buttons),
                AlignmentType.RIGHT);
    }

    private static ArrayList<DrawablePart> addStartButton(int height,
                                                          @Nullable ArrayList<DrawablePart> buttons) {
        return new ArrayList<>() {{
            add(new StartButton(getButtonSize(height)));
            addAll(Objects.requireNonNullElse(buttons, new ArrayList<>()));
        }};
    }

    public static int[] getButtonSize(int height) {
        return new int[] {BUTTON_WIDTH, height};
    }
}