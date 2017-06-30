package com.luxoft.jva030;

import io.vavr.control.Either;

/**
 * Hello world!
 */
public class App {
        public static void main(String[] args) {
            Either.left(new Throwable());
            Either.right("");

            Either<Throwable, String> e = Either.right("");


        }
}
