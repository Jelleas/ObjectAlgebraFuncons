package funcons.interpreter;

import funcons.algebras.LogicWhileTrueAlg;
import funcons.sorts.IEval;
import funcons.values.recursion.Forwards;

public interface LogicWhileTrueFactory extends LogicIfTrueFactory, LogicWhileTrueAlg<IEval> {
    @Override
    default IEval whileTrue(IEval e, IEval c) {
        return ifTrue(
                    e,
                    seq(c, (env, forward, store, given) -> whileTrue(e, c).eval(env, forward, store, given)),
                    null_()
        );
    }
}
