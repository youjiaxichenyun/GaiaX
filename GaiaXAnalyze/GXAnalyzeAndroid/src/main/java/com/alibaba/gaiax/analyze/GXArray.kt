package com.alibaba.gaiax.analyze

public final class GXArray() : GXValue() {
    private var value: Any? = null

    constructor(value: Any?) : this() {
        this.value = value
    }

    override fun getValue(): Any? {
        return value;
    }
}