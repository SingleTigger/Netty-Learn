package com.chenws.netty.udp.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/**
 * Created by chenws on 2020/3/24.
 */
public class UdpNettyHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket msg) throws Exception {
        //获取消息内容
        ByteBuf content = msg.content();
        //写到bytes中
        int length = content.readableBytes();
        byte[] bytes = new byte[length];
        content.readBytes(bytes);

        //根据数据类型处理，以下当作十六进制处理
        ByteArrayInputStream bs = new ByteArrayInputStream(bytes);
        DataInputStream in = new DataInputStream(bs);
        byte b1 = in.readByte();
        byte b2 = in.readByte();
        int i1 = in.readInt();
        int i2 = in.readInt();

        System.out.println(b1 + "_" + b2 + "_" + i1 + "_" + i2);

    }

}
