package com.chenws.netty.tcp.server;

import com.chenws.netty.tcp.handler.TcpNettyHandler;
import com.chenws.netty.tcp.listener.BindListener;
import com.chenws.netty.tcp.listener.CloseListener;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author chenws
 * @date 2020/03/17 15:45:35
 */
public class TcpNettyServer {

    public static void main(String[] args) {
        startTcpServer();
    }

    private static void startTcpServer(){
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup(6);
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup,workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 1024)
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            //添加自定义处理器
                            socketChannel.pipeline()
                                    .addLast(new StringEncoder())
                                    .addLast(new StringDecoder())
                                    .addLast(new TcpNettyHandler());
                        }
                    });
            int port = 8080;
            //监听器，当服务绑定成功后执行
            ChannelFuture channelFuture = serverBootstrap.bind(port).sync().addListener(new BindListener());
            //监听器，当停止服务后执行。
            channelFuture.channel().closeFuture().sync().addListener(new CloseListener());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

}
