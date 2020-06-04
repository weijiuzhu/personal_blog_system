package com.mangguo.service;

import com.mangguo.handle.MessageHandle;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * netty服务端
 * Created by weijiuzhu on 2020/6/3.
 */
@Component
public class NettyService {

    @Resource
    private MessageHandle messageHandle;


    private NioEventLoopGroup workGroup;
    private NioEventLoopGroup subGroup;
    private ServerBootstrap serverBootstrap;


    public void startNetty(){
        try {
            workGroup = new NioEventLoopGroup();
            subGroup = new NioEventLoopGroup();
            serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(workGroup, subGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(messageHandle)
                    .localAddress(9999);
            System.out.println("Netty客户端启动完毕。。。");
            ChannelFuture sync = serverBootstrap.bind().sync();
            sync.channel().closeFuture().sync();
        } catch (Exception e){
            e.fillInStackTrace();
        }

    }
}
