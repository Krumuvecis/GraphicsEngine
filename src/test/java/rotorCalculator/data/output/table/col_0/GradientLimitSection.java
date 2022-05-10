package rotorCalculator.data.output.table.col_0;

import rotorCalculator.data.rotorData.Limits;
import rotorCalculator.data.output.table.Section;

import static rotorCalculator.data.output.Utilities.roundNumber;

// TODO: add javadoc
public class GradientLimitSection extends Section.NextSection {
    public GradientLimitSection() {
        super("Force gradient limits", prepareData());
    }

    private static String[] prepareData() {
        return new String[] {
                "Gradient: "
                        + roundNumber(Limits.HumanLimits.GradientLimits.MAX_FORCE_GRADIENT * 100,2)
                        + " %",
                "Reference height: "
                        + roundNumber(Limits.HumanLimits.GradientLimits.HEIGHT, 2)
                        + " m",
                "Minimum rotor radius: "
                        + roundNumber(Limits.HumanLimits.GradientLimits.getRadius(), 3)
                        + " m"
        };
    }
}