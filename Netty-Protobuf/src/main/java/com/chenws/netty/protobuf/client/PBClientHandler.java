package com.chenws.netty.protobuf.client;

import com.chenws.netty.protobuf.proto.NettyProtobuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by chenws on 2020/3/22.
 */
public class PBClientHandler extends SimpleChannelInboundHandler<NettyProtobuf.People> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, NettyProtobuf.People msg) throws Exception {
        System.out.println("客户端收到信息：" + msg.getAddress());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        NettyProtobuf.People build = NettyProtobuf.People.newBuilder().setAddress("广州市").setAge(24).setGender("男").setName("小白").build();
        ctx.writeAndFlush(build);
    }
}
