package com.chenws.netty.protobuf.listener;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

/**
 * @author chenws
 * @date 2020/03/17 16:01:15
 */
public class CloseListener implements GenericFutureListener<Future<? super Void>>  {
    @Override
    public void operationComplete(Future future) throws Exception {
        if(future.isSuccess()){
            System.out.println("关闭成功");
        }else{
            future.cause().printStackTrace();
        }
    }
}
