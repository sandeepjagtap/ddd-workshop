package com.tw.dddworkshop.domain;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Objects;

public class Price {
    private BigDecimal value;
    private Currency currency;

    public Price(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(value, price.value) &&
                Objects.equals(currency, price.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }
}


