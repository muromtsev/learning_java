package holding;

import java.util.*;

class Snow {}
class Powder extends Snow{}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        // Не откомпилируется
        //List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        //получено List<Powder>
        //требуется List<Snow>
        // У Collection.addAll() прооблем нет
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        // Подсказка с явно указанным аргументом типа
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
