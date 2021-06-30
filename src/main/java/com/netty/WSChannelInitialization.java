package com.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * @description: 通道初始化奇，用来加载ChannelHandler
 * @author: chao.zhang
 * @create: 2021-06-21 08:12
 **/
public class WSChannelInitialization extends ChannelInitializer<SocketChannel> {


    //初始化通道，接受消息后做的事情
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        //获取管道,添加channel到管道
        ChannelPipeline pipeline = ch.pipeline();
        //添加http编解码器
        pipeline.addLast(new HttpServerCodec());
        //添加支持大数据流的
        pipeline.addLast(new ChunkedWriteHandler());
        //http请求聚合成response
        pipeline.addLast(new HttpObjectAggregator(1024*64));
        //指定接受请求的路由
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));

        //添加自定义的handler
        pipeline.addLast(new WSChatHandler());

    }
}
