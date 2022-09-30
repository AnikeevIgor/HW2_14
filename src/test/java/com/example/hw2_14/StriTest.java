package com.example.hw2_14;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StriTest {



    @Test
    void add() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        stringList.add("test 3");
        assertThat(stringList.add("23")).isEqualTo("23");
        assertThat(stringList.add("233")).isEqualTo("233");
        assertThat(stringList.get(1)).isEqualTo("test 2");
    }

    @Test
    void Add() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        stringList.add("test 3");
        assertThat(stringList.add(1,"23")).isEqualTo("23");
        assertThat(stringList.add(2,"233")).isEqualTo("233");
        assertThat(stringList.get(1)).isEqualTo("23");
    }

    @Test
    void set() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        stringList.add("test 3");
        assertThat(stringList.set(1,"23")).isEqualTo("23");
        assertThat(stringList.set(1,"233")).isEqualTo("233");
        assertThat(stringList.get(1)).isEqualTo("233");
    }

    @Test
    void remove() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        stringList.add("test 3");
        assertThat(stringList.remove(1)).isEqualTo("test 2");
        assertThat(stringList.remove(1)).isEqualTo("test 3");
    }

    @Test
    void testRemove() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        stringList.add("test 3");
        assertThat(stringList.remove(1)).isEqualTo("test 2");
        assertThat(stringList.remove(1)).isEqualTo("test 3");
    }

    @Test
    void contains() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        assertThat(stringList.contains("t5")).isEqualTo(false);
        assertThat(stringList.contains("test 1")).isEqualTo(true);
    }

    @Test
    void indexOf() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        assertThat(stringList.indexOf("t5")).isEqualTo(-1);
        assertThat(stringList.indexOf("test 1")).isEqualTo(0);
    }

    @Test
    void lastIndexOf() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        assertThat(stringList.lastIndexOf("t5")).isEqualTo(-1);
        assertThat(stringList.lastIndexOf("test 1")).isEqualTo(0);
    }

    @Test
    void get() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        assertThat(stringList.get(1)).isEqualTo("test 2");
    }

    @Test
    void equals() {
        StringList stringList = new Stri();
       stringList.add("5");
        StringList stringList1 = new Stri();
        stringList1.add("5");

        assertThat(stringList.equals(stringList1)).isEqualTo(true);
    }

    @Test
    void size() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        stringList.add("test 3");
        stringList.add("test 4");
        assertThat(stringList.size()).isEqualTo(4);
    }

    @Test
    void isEmpty() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        stringList.add("test 3");
        stringList.add("test 4");
        assertThat(stringList.isEmpty()).isEqualTo(false);
        stringList.clear();
        assertThat(stringList.isEmpty()).isEqualTo(true);
    }

    @Test
    void clear() {
        StringList stringList = new Stri();
        stringList.add("test 1");
        stringList.add("test 2");
        stringList.add("test 3");
        stringList.add("test 4");
        assertThat(stringList.size()).isEqualTo(4);
       stringList.clear();
       assertThat(stringList.isEmpty()).isTrue();
       assertThat(stringList.toArray()).hasSize(0);

       assertThatExceptionOfType(IllegalArgumentException.class)
               .isThrownBy(()-> stringList.get(1));
    }

    @Test
    void toArray() {
    }
}

