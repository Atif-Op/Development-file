package com.springreactivetest.demo;


import org.testng.annotations.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoTest {
    //mono take zero or 1 argument
    //use then to add error
    @Test
    public void monoTest() {
        Mono<String> mono = Mono.just("hello").log();
        mono.subscribe(System.out::println);
    }

    //flux take 0 or n nunber or arguyment
    //use concatwith to add error
    @Test
    public void fluxTest() {
        Flux<String> flux = Flux.just("atif", "vishal", "aniket").concatWith(Flux.error(new RuntimeException("Error"))).log();

        flux.subscribe(System.out::println);

    }
}
