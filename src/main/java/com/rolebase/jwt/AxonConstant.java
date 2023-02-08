package com.rolebase.jwt;

public enum AxonConstant {
    SSL_KEY_PASS("ssl.key.password"),
    SSL_KEYSTORE_PASS("ssl.keystore.password"),
    SSL_TRUSTSTORE_PASS("ssl.truststore.password");

    private final String value;

    AxonConstant(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
