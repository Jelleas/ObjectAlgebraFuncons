package funcons.interpreter.tests;

import funcons.algebras.ExceptionAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.ExceptionFactory;
import funcons.values.Bool;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.signals.FailureTrue;
import funcons.values.signals.MatchFailureException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionFactoryTest {

    private ExceptionAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new ExceptionFactory() {};
    }


    @Test
    public void testFail() throws Exception {
        try {
            alg.fail().eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch (FailureTrue ignored) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testElse_() throws Exception {
        Int i = (Int)alg.else_(alg.fail(), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(3));

        i = (Int)alg.else_(alg.lit(2), alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(2));
    }

    @Test
    public void testThrow_() throws Exception {
        try {
            alg.throw_(alg.matchFailure()).eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch(MatchFailureException s) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testCatch_() throws Exception {
        IEval c = alg.catch_(alg.throw_(alg.matchFailure()), alg.abs(alg.given()));
        MatchFailureException e = (MatchFailureException)c.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(e);
    }

    @Test
    public void testCatchElseRethrow() throws Exception {
        IEval fail = alg.throw_(alg.matchFailure());

        IEval c = alg.catchElseRethrow(fail, alg.abs(alg.given()));
        MatchFailureException e = (MatchFailureException)c.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(e);

        try {
            alg.catchElseRethrow(fail, fail).eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch(MatchFailureException exception) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testPreferOver() throws Exception {
        IEval f1 = alg.abs(alg.seq(alg.fail(), alg.bool(false)));
        IEval f2 = alg.abs(alg.bool(true));

        Bool b = (Bool)alg.apply(alg.preferOver(f1, f2), alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());

        b = (Bool)alg.apply(alg.preferOver(f2, f1), alg.lit(1)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());
    }

    @Test
    public void testMatchFailure() throws Exception {
        MatchFailureException e = (MatchFailureException)alg.matchFailure().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(e);
    }
}