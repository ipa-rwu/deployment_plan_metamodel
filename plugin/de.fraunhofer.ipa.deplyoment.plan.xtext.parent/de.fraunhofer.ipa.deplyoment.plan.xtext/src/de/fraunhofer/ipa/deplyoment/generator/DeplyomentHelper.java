package de.fraunhofer.ipa.deplyoment.generator;


public class DeplyomentHelper {

    @FunctionalInterface
    public interface TripleFunction<T, U, V> {
        public void accept(T t, U u, V v);
    }


}
