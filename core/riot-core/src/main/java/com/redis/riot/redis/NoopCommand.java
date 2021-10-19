package com.redis.riot.redis;

import java.util.Map;

import com.redis.spring.batch.support.operation.Noop;

import picocli.CommandLine.Command;

@Command(name = "noop", description = "No operation: accepts input and does nothing")
public class NoopCommand extends AbstractRedisCommand<Map<String, Object>> {

    @Override
    public Noop<String, String, Map<String, Object>> operation() {
        return new Noop<>();
    }

}
