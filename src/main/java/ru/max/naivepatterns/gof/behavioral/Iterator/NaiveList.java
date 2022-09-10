package ru.max.naivepatterns.gof.behavioral.Iterator;


public interface NaiveList<E>
{
    NaiveIterator<E> iterator();
}