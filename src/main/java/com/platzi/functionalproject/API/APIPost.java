package com.platzi.functionalproject.API;

import com.platzi.functionalproject.Post;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface APIPost {

    @RequestLine("GET /data/v1/post")
    List<Post> post(@QueryMap Map<String, Object> queryMap);


}
