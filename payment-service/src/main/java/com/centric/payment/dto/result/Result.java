package com.centric.payment.dto.result;

sealed public interface Result<T> permits Success, Failure {
}
