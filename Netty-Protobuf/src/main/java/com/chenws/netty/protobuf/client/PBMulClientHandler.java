package com.chenws.netty.protobuf.client;

import com.chenws.netty.protobuf.proto.NettyMulProtobuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by chenws on 2020/3/22.
 */
public class PBMulClientHandler extends SimpleChannelInboundHandler<NettyMulProtobuf.MultipleMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, NettyMulProtobuf.MultipleMessage msg) throws Exception {
//        System.out.println("客户端收到信息：" + msg.getStudent().getAddress());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        NettyMulProtobuf.MultipleMessage build = NettyMulProtobuf.MultipleMessage.newBuilder()
//                .setDataType(NettyMulProtobuf.MultipleMessage.DataType.StudentType).setStudent(NettyMulProtobuf.Student.newBuilder().setAddress("student address")
//                        .setAge(10).setName("student name").build()).build();
        NettyMulProtobuf.MultipleMessage build = NettyMulProtobuf.MultipleMessage.newBuilder()
                .setDataType(NettyMulProtobuf.MultipleMessage.DataType.SchoolType).setSchool(
                        NettyMulProtobuf.School.newBuilder().setSchoolName("school name")
                        .setSchoolAddress("school address")
                        .build()
                ).build();
        ctx.writeAndFlush(build);
    }
}
