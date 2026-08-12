package com.centric.payment.dto.result;

public record Failure<T>(T value) implements Result<T> {

}
