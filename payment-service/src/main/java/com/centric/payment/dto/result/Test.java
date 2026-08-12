package com.centric.payment.dto.result;

public class Test {

    public Result<String> getResult() {
        Result<String> result = new Success<>("Operation successful");
        return result;
    }

    public Result<String> getResultFailure() {
        Result<String> result = new Failure<>("Operation failed");
        return result;
    }

    public static void main(String[] args) {

        Result<String> result = new Test().getResult();
        switch (result) {
            case Success<String> success -> System.out.println("Success: " + success.value());
            case Failure<String> failure -> System.out.println("Failure: " + failure.value());
        }

        Result<String> resultFailure = new Test().getResultFailure();
        switch (resultFailure) {
            case Success<String> success -> System.out.println("Success: " + success.value());
            case Failure<String> failure -> System.out.println("Failure: " + failure.value());
        }
    }
}
