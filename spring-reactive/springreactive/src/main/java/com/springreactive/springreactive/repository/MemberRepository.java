package com.springreactive.springreactive.repository;

import com.springreactive.springreactive.model.Member;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface MemberRepository extends R2dbcRepository<Member, Long> {
    Mono<Member> findByName(String name);
}
