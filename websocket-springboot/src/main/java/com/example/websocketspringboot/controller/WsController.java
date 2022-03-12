package com.example.websocketspringboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wh
 * @date: 2019/10/17
 */
@RestController
public class WsController {

    @Autowired
    private SimpMessagingTemplate messageTemplate;


    /**
     * 点对点通信
     * @param message
     */
//    @MessageMapping(value = "/points")
    // http://localhost:8080/test
    @GetMapping("test")
    public void point(Map message) {
        System.out.println("point");
        //发送消息给指定用户, 最后接受消息的路径会变成 /user/admin/queue/points
        messageTemplate.convertAndSendToUser("admin11", "", message+"1111");
    }
}