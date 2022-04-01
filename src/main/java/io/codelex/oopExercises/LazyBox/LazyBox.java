package io.codelex.oopExercises.LazyBox;

import java.util.function.Function;
import java.util.function.Supplier;

public class LazyBox<T> {

    private T lazyObject;
    private Supplier<T> supplier;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (lazyObject == null) {
            lazyObject = supplier.get();
        }
        return lazyObject;
    }

    // var atgriezt cita veida kasti
    public <U> LazyBox<U> map(Function<T, U> mapper) {
        return new LazyBox<>(() -> mapper.apply(get()));
    }

}
