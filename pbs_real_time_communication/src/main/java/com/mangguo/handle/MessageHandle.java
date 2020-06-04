package com.mangguo.handle;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.springframework.stereotype.Component;

/**
 * Created by weijiuzhu on 2020/6/3.
 */
@Component
public class MessageHandle extends SimpleChannelInboundHandler<TextWebSocketFrame> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {

        System.out.println("收到消息解析之前：" + msg);
        String text = msg.text();
        System.out.println("收到消息解析之后：" + text);

    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        System.out.println("收到消息之前执行。。。。。。");
        System.out.println(ctx.toString());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        System.out.println("收到消息之后执行。。。。。。");
        System.out.println(ctx.toString());
    }
}
