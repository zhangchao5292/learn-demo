package com.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
*
* @description:
*
* @author: chao.zhang
*
* @create: 2021-06-21 08:05
**/
public class WSNetty {

    public static void main(String[] args) {

            //主从线程池
            NioEventLoopGroup mainGroup = new NioEventLoopGroup();
            NioEventLoopGroup subGroup = new NioEventLoopGroup();
            //Netty服务器启动对象
        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap.group(mainGroup, subGroup)
                    .channel(NioServerSocketChannel.class)//通道接收消息
                    .childHandler(new WSChannelInitialization());//指定通道如何处理消息
            // 绑定端口，以同步的方式启动服务
            ChannelFuture future = bootstrap.bind(9090).sync();
            //等待服务关闭
            future.channel().closeFuture().await();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            mainGroup.shutdownGracefully();
            subGroup.shutdownGracefully();
        }
    }

}
