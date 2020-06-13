package com.chenws.netty.tcp.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by chenws on 2020/3/24.
 */
@ChannelHandler.Sharable
public class TcpNettyHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println(msg);
        //把消息写到缓冲区
        ctx.write("I get the message " + msg);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        //刷新缓冲区，把消息发出去
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //异常处理，如果该handler不处理，将会传递到下一个handler
        cause.printStackTrace();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush("connect success!");
    }
}
