package graphicsEngine.demo.paged.pages.demoPages.page3.rotor.output;

import java.util.ArrayList;

// TODO: add javadoc
public class Utilities {
    public static final String[]
            LINE_SEPARATOR = new String[] {
                    "",
                    "----------"},
            SECTION_SPACING = new String[] {
                    "",
                    ""};

    public static String[] sectionTitle(String sectionTitle) {
        return new String[] {
                "----- " + sectionTitle + " -----"
        };
    }

    public static String[] sectionSeparator(String sectionTitle) {
        return joinArrays(new ArrayList<>() {{
            add(SECTION_SPACING);
            add(sectionTitle(sectionTitle));
        }});
    }

    public static String[] joinArrays(ArrayList<String[]> arrayList) {
        String[] returnable = new String[getArrayLengthSum(arrayList)];
        for (int i = 0, offset = 0; i < arrayList.size(); i++) {
            String[] array = arrayList.get(i);
            int arrayLength = array.length;
            System.arraycopy(array, 0, returnable, offset, arrayLength);
            offset += arrayLength;
        }
        return returnable;
    }

    private static int getArrayLengthSum(ArrayList<String[]> arrayList) {
        int sum = 0;
        for (String[] array : arrayList) {
            sum += array.length;
        }
        return sum;
    }
}