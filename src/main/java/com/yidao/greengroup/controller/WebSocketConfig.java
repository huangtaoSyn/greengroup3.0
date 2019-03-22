package com.yidao.greengroup.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author: huangtao
 * @description:
 * @date: 2019-03-13 6:49
 * @version: $version$
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig  implements WebSocketMessageBrokerConfigurer {


	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		// 订阅Broker名称
		config.enableSimpleBroker("/topic");
		// 全局使用的消息前缀（客户端订阅路径上会体现出来）
		/*   例如客户端发送消息的目的地为/app/sendTest，则对应控制层@MessageMapping(“/sendTest”)
		      客户端订阅主题的目的地为/app/subscribeTest，则对应控制层@SubscribeMapping(“/subscribeTest”)
		 * */
		config.setApplicationDestinationPrefixes("/app");//这配置以app开头的websocket请求url
	}
	/**
	 * 注册stomp的端点
	 */
	// 允许使用socketJs方式访问，访问点为webSocketServer，允许跨域
	// 在网页上我们就可以通过这个链接
	// http://localhost:8080/webSocketServer
	// 来和服务器的WebSocket连接
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/my-websocket").withSockJS();//“my-websocket”的endpoint(端点)
	}
}
