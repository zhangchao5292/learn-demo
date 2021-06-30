package com.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-21 08:27
 **/
public class WSChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    //保存所有的客户端链接
    private ChannelGroup client=new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        //接收数据后自动调用


    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        // 新的通道添加到client
        client.add(ctx.channel());
    }
}
