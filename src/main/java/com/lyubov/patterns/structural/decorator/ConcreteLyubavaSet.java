package com.lyubov.patterns.structural.decorator;

import java.util.Collection;
import java.util.Set;

public class ConcreteLyubavaSet<T> extends LyubavaSet<T> {
    private int addCount = 0;

    public ConcreteLyubavaSet(Set<T> s) {
        super(s);
    }

    @Override
    public boolean add(T e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}