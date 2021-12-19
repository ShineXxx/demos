package com.shine.localcache;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@EnableCaching
@CacheConfig(cacheNames = "item")
public class CacheService {

    @Cacheable
    public String getString() {
        return "Integer.toString(new Random().nextInt(100));";
    }

    @CachePut
    public String updateString() {
        return Integer.toString(new Random().nextInt(100));
    }
}
