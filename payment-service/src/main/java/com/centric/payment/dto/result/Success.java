package com.centric.payment.dto.result;

public record Success<T>(T value) implements Result<T> {

}
