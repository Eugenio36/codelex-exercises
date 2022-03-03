package io.codelex.CurrencyConverter;

import java.math.BigDecimal;

public class CurrencyRate {

    private String code;
    private BigDecimal rate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public CurrencyRate(String code, BigDecimal rate) {
        this.code = code;
        this.rate = rate;
    }
}
