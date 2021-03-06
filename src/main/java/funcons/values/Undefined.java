package funcons.values;

import funcons.values.properties.ExternalRascalValue;
import org.rascalmpl.value.IValue;

public class Undefined implements ExternalRascalValue {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Undefined;
    }

    @Override
    public boolean isEqual(IValue other) {
        return equals(other);
    }

    @Override
    public String toString() {
        return "UNDEFINED";
    }
}
