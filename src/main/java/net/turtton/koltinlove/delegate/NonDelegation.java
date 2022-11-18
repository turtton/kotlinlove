package net.turtton.koltinlove.delegate;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class NonDelegation {
    static class CustomList<T> implements List<T> {
        List<T> list;

        public CustomList(List<T> list) {
            this.list = list;
        }

        @Override
        public T get(int index) {
            var result = list.get(index);
            System.out.println(result);
            return result;
        }

        @Override
        public int size() {
            return list.size();
        }

        @Override
        public boolean isEmpty() {
            return list.isEmpty();
        }

        @Override
        public boolean contains(Object o) {
            return list.contains(o);
        }

        @NotNull
        @Override
        public Iterator<T> iterator() {
            return list.iterator();
        }

        @NotNull
        @Override
        public Object[] toArray() {
            return list.toArray();
        }

        @NotNull
        @Override
        public <T1> T1[] toArray(@NotNull T1[] a) {
            return list.toArray(a);
        }

        @Override
        public boolean add(T t) {
            return list.add(t);
        }

        @Override
        public boolean remove(Object o) {
            return list.remove(o);
        }

        @Override
        public boolean containsAll(@NotNull Collection<?> c) {
            return list.contains(c);
        }

        @Override
        public boolean addAll(@NotNull Collection<? extends T> c) {
            return list.addAll(c);
        }

        @Override
        public boolean addAll(int index, @NotNull Collection<? extends T> c) {
            return list.addAll(index, c);
        }

        @Override
        public boolean removeAll(@NotNull Collection<?> c) {
            return list.removeAll(c);
        }

        @Override
        public boolean retainAll(@NotNull Collection<?> c) {
            return list.retainAll(c);
        }

        @Override
        public void clear() {
            list.clear();
        }

        @Override
        public T set(int index, T element) {
            return list.set(index, element);
        }

        @Override
        public void add(int index, T element) {
            list.add(index, element);
        }

        @Override
        public T remove(int index) {
            return list.remove(index);
        }

        @Override
        public int indexOf(Object o) {
            return list.indexOf(o);
        }

        @Override
        public int lastIndexOf(Object o) {
            return list.lastIndexOf(o);
        }

        @NotNull
        @Override
        public ListIterator<T> listIterator() {
            return list.listIterator();
        }

        @NotNull
        @Override
        public ListIterator<T> listIterator(int index) {
            return list.listIterator(index);
        }

        @NotNull
        @Override
        public List<T> subList(int fromIndex, int toIndex) {
            return list.subList(fromIndex, toIndex);
        }
    }
}
