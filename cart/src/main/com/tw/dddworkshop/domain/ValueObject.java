package com.tw.dddworkshop.domain;

import java.io.Serializable;

//A value object, as described in the DDD book.

public interface ValueObject<T> {

    // Value objects compare by the values of their attributes, they don't have an identity.
    boolean sameValueAs(T other);

}