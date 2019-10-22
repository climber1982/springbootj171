package com.lovo.boot.util;

import redis.clients.jedis.Jedis;

public class JedisDB {

    public static Jedis createJedis(){
        return  new Jedis("127.0.0.1",8001);
    }
}
