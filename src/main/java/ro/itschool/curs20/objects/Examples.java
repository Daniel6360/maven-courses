package ro.itschool.curs20.objects;

import ro.itschool.curs18.Palindrom;
import ro.itschool.curs6.CalculatorTDD;

import javax.swing.*;

public class Examples {
    public static void main(String[] args) {
        final Box<Carte> cutie = new Box<>(new Carte());
        final Box<Cd> cutieCuCd = new Box<>(new Cd());

        // new Dog(new Dog());

        Carte content = cutie.getContent();

        Pair<String, Dog> dg = new Pair<>("carte", new Dog());

        Pair<Dog, Cd> dogCd = new Pair<>(new Dog(), new Cd());
    }

}

interface Boxable {
    String boxMe();
}

class Dog {

}

class Cd implements Boxable {
    public String name;

    @Override
    public String boxMe() {
        return null;
    }
}

interface Dusty {

}

class Carte implements Boxable, Dusty {
    public String name;

    @Override
    public String boxMe() {
        return null;
    }
}

class Box<T extends Boxable> {
    private final T content;

    public Box(T content) {
        this.content = content;
    }

    public String box() {
        return content.boxMe();
    }

    public T getContent() {
        return content;
    }

}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

