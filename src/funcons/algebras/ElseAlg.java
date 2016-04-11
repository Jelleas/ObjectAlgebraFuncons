package funcons.algebras;

public interface ElseAlg<E> extends ExceptionAlg<E> {
    E equal(E x1, E x2);
    E only(E v);
    E any();
    E match(E exp, E pat);
    E pattAbs(E pat, E x);
}