package com.lyubov.patterns.structural.decorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class LyubavaSet<T> implements Set<T> {
    private Set<T> set;

    public LyubavaSet(Set<T> s) {
        this.set = s;
    }

    @Override
    public boolean add(T t) {
        System.out.println("add " + t);
        return set.add(t);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        System.out.println("iterator");
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        System.out.println("toArray");
        return set.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        System.out.println("toArray");
        return set.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("remove");
        return set.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        System.out.println("containsAll");
        return set.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        System.out.println("addAll");
        return set.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public void clear() {
        set.clear();
    }
}
