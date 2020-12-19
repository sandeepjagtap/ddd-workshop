package com.tw.dddworkshop.domain;

public interface Entity<T> {

    // Entities compare by identity, not by attributes.
    boolean sameIdentityAs(T other);
}
