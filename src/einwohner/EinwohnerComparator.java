package einwohner;

import java.util.Comparator;

public class EinwohnerComparator implements Comparator<Einwohner> {
    @Override
    public int compare(Einwohner o1, Einwohner o2) {

        int comp = Integer.compare(o1.getGeburtsjahr(),o2.getGeburtsjahr());
        if (comp==0){
            return o1.getName().compareTo(o2.getName());

        }return comp;

    }
}
