package camllight.algebras.constants;

import camllight.algebras.base.ModuleAlg;
import noa.syntax.Syntax;

public interface ConstantsAlg<E> extends ModuleAlg<E> {
    @Syntax("constant = NUMTOKEN")
    default E int_(java.lang.Integer l) {
        return alg().lit(l);
    }

    @Syntax("constant = BOOLTOKEN")
    default E bool(java.lang.Boolean b) {
        return alg().bool(b);
    }

    @Syntax("constant = NULLTOKEN")
    default E null_(Object o) {
        return alg().null_();
    }

    @Syntax("constant = emptylist")
    default E emptyListConstant(E l) {
        return l;
    }

    @Syntax("emptylist = EMPTYLISTTOKEN")
    default E emptyList(Object o) {
        return alg().list();
    }
}
