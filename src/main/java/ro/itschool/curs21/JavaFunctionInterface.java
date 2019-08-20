package ro.itschool.curs21;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaFunctionInterface {
    public static void main(String[] args) {
        useFunction(input->"p"+input);
        usePredicate(input->input.length()==3);
        useSupplier(()->"ceva bun");
        useConsummer(input-> System.out.println(input));
    }

    private static void useConsummer(Consumer<String> consumer) {
        consumer.accept("ceva");
    }

    private static void useSupplier(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    private static void usePredicate(Predicate<String> predicate) {
        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("abcd"));
    }

    private static void useFunction(Function<String,String> function) {
        System.out.println(function.apply("ceva"));
    }
}
