package funcons.tests;

import funcons.Store;
import funcons.algebras.BindAlg;
import funcons.interpreter.BindFactory;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Int;
import funcons.types.Null;
import funcons.types.Id;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BindFactoryTest {

    private BindAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new BindFactory() {};
    }

    @Test
    public void testId() throws Exception {
        Id v = (Id)alg.id("foo").eval(new Environment(), new Store(), alg.given(new Null()));
        assertEquals(v.stringValue(), "foo");
    }

    @Test
    public void testBindValue() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.bindValue(alg.id("foo"), alg.lit(3)).eval(new Environment(), store, alg.given(new Null()));
        Id v = (Id)alg.id("foo").eval(new Environment(), store, alg.given(new Null()));
        assertEquals(((Int)env.val(v)).intValue(), new Integer(3));
    }

    @Test
    public void testBoundValue() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.bindValue(alg.id("foo"), alg.lit(3)).eval(new Environment(), store, alg.given(new Null()));
        Int i = (Int)alg.boundValue(alg.id("foo")).eval(env, store, alg.given(new Null()));
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testScope() throws Exception {
        IEval env1 = alg.bindValue(alg.id("foo"), alg.lit(3));
        IEval env2 = alg.bindValue(alg.id("foo"), alg.lit(2));

        Int i = (Int)alg.scope(env1, alg.scope(env2, alg.boundValue(alg.id("foo")))).eval(new Environment(), new Store(), alg.given(new Null()));

        assertEquals(i.intValue(), new Integer(2));
    }

    @Test
    public void testGiven() throws Exception {
        Int i = (Int)alg.given(new Int(0)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testSupply() throws Exception {
        IEval getZero = alg.supply(alg.lit(0), (env, store, given) -> given.eval(env, store, given));
        Int i = (Int)getZero.eval(new Environment(), new Store(), alg.given(new Null()));
        assertEquals(i.intValue(), new Integer(0));
    }
}