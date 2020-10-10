package com.example.demo.mapper;

import com.example.demo.domain.Video;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class VideoMapper {
    private static Map<Integer, Video> videoMap = new HashMap<>();
    private static Map<Integer, User> userMap = new HashMap<>();


    static{
        videoMap.put(1,new Video(1,"testVideo1"));
        videoMap.put(2,new Video(2,"testVideo2"));
        videoMap.put(3,new Video(3,"testVideo3"));
        videoMap.put(4,new Video(4,"testVideo4"));
        videoMap.put(5,new Video(5,"testVideo5"));
    }

    public List<Video> listVideo(){
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }
}
