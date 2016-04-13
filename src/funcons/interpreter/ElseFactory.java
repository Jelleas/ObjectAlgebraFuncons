package funcons.interpreter;

import funcons.algebras.ElseAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;

public interface ElseFactory extends ExceptionFactory, ElseAlg<IEval> {

    @Override
    default IEval equal(IEval x1, IEval x2) {
        return (env, store, given) -> new Bool(x1.eval(env, store, given).equals(x2.eval(env, store, given)));
    }

    @Override
    default IEval only(IEval v) {
        return (env, store, given) -> abs(ifTrue(equal(given, v), (e, s, g) -> new Environment(), fail())).eval(env, store, given);
    }

    @Override
    default IEval any() {
        return abs((env, store, given) -> new Environment());
    }

    @Override
    default IEval whenTrue(IEval exp, IEval x) {
        return ifTrue(exp, x, fail());
    }

    @Override
    default IEval match(IEval exp, IEval pat) {
        return apply(pat, exp);
    }

    @Override
    default IEval pattAbs(IEval pat, IEval x) {
        return (env, store, given) -> abs(scope(match(given, pat), x)).eval(env, store, given);
    }

    @Override
    default IEval pattUnion(IEval pat1, IEval pat2) {
        return abs((env, store, given) -> {
            Environment env1 = (Environment)unAbs(pat1).eval(env, store, given);
            Environment env2 = (Environment)unAbs(pat2).eval(env, store, given);
            return env1.extend(env2);
        });
    }

    @Override
    default IEval pattNonBinding(IEval patt) {
        return (env, store, given) -> {
            patt.eval(env, store, given);
            return new Environment();
        };
    }
}
