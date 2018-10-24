package com.lyubov.patterns.structural.decorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class MySet<T> implements Set<T> {
    private Set<T> set;

    public MySet(Set<T> s) {
        this.set = s;
    }

    public boolean add(T t) {
        System.out.println("add " + t);
        return set.add(t);
    }

    public int size() {
        return set.size();
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean contains(Object o) {
        return set.contains(o);
    }

    public Iterator<T> iterator() {
        System.out.println("iterator");
        return set.iterator();
    }

    public Object[] toArray() {
        System.out.println("toArray");
        return set.toArray();
    }

    public <T1> T1[] toArray(T1[] a) {
        System.out.println("toArray");
        return set.toArray(a);
    }

    public boolean remove(Object o) {
        System.out.println("remove");
        return set.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        System.out.println("containsAll");
        return set.containsAll(c);
    }

    public boolean addAll(Collection<? extends T> c) {
        System.out.println("addAll");
        return set.addAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return set.retainAll(c);
    }

    public void clear() {
        set.clear();
    }
}
