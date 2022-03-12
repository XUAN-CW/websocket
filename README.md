---
title: websocket
tags: 
date: 2022-03-12 19:39:16
id: 1647085156829705500
---
# 摘要

主要参考了 [springboot-websocket-vue](https://github.com/wuhengc/springboot-websocket-vue)

# 后台实现

##  [pom.xml](websocket-springboot\pom.xml) 

```

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-websocket</artifactId>
        </dependency>
```

##  [WebsocketSpringbootApplication.java](websocket-springboot\src\main\java\com\example\websocketspringboot\WebsocketSpringbootApplication.java) 

```
@EnableScheduling
```

##  [CorsConfig.java](websocket-springboot\src\main\java\com\example\websocketspringboot\conf\CorsConfig.java) 

##  [WebSocketConfig.java](websocket-springboot\src\main\java\com\example\websocketspringboot\conf\WebSocketConfig.java) 

##  [WsController.java](websocket-springboot\src\main\java\com\example\websocketspringboot\controller\WsController.java) 



# 前端实现

## 创建项目

```
vue create websocket-vue2
```

## 安装

```
npm i sockjs-client@1.4.0
npm i stompjs@2.3.3
```

##  [App.vue](websocket-vue2\src\App.vue) 

# 参考

主要参考了 [springboot-websocket-vue](https://github.com/wuhengc/springboot-websocket-vue)







