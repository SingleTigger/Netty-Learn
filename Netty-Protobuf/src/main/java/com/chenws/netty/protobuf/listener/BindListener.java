package com.chenws.netty.protobuf.listener;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

/**
 * @author chenws
 * @date 2020/03/17 15:58:10
 */
public class BindListener implements GenericFutureListener<Future<? super Void>>  {

    @Override
    public void operationComplete(Future future) throws Exception {
        if(future.isSuccess()){
            System.out.println("绑定成功");
        }else{
            //打印错误信息，也可自定义处理
            future.cause().printStackTrace();
        }
    }
}
