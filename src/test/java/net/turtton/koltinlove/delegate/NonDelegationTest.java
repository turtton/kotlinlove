package net.turtton.koltinlove.delegate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NonDelegationTest {
    static List<String> internalList = new ArrayList<>();

    NonDelegation.CustomList<String> customList = new NonDelegation.CustomList<>(internalList);

    @BeforeAll
    public static void before() {
        internalList.add("a");
        internalList.add("b");
        internalList.add("c");
    }

    @Test
    void get() {
        var a = customList.get(0);
        assert a.equals("a");
        var b = customList.get(1);
        assert b.equals("b");
        var c = customList.get(2);
        assert c.equals("c");
    }

}