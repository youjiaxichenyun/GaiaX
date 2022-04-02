package com.alibaba.gaiax.analyze

abstract class GXValue {

    fun <T : GXValue?> cast(clazz: Class<T>): T {
        return if (clazz.isInstance(this)) {
            this as T
        } else {
            throw RuntimeException("expected: " + clazz.getSimpleName() + ", actual: " + javaClass.getSimpleName());
        }
    }

    abstract fun getValue(): Any?
}