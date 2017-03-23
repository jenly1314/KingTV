package com.king.tv.thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/13
 */

public class ThreadPoolManager {

    private static ThreadPoolProxy mInstance;

    public static ThreadPoolProxy getInstance(){
        if(mInstance == null){
            synchronized (ThreadPoolManager.class){
                if(mInstance == null){
                    mInstance = new ThreadPoolProxy(2,5);
                }
            }
        }

        return mInstance;
    }


    /**
     * 线程池代理
     */
    public static class ThreadPoolProxy{

        private ThreadPoolExecutor mThreadPoolExecutor;


        public ThreadPoolProxy(int corePoolSize, int maximumPoolSize){
            initThreadPoolExecutor(corePoolSize,maximumPoolSize);
        }

        private void initThreadPoolExecutor(int corePoolSize, int maximumPoolSize){

            if(mThreadPoolExecutor == null){
//                ExecutorService executorService = Executors.newFixedThreadPool(3);
                //阻塞缓冲队列
                BlockingDeque<Runnable> workQueue = new LinkedBlockingDeque<>();

                //线程工厂
                ThreadFactory threadFactory = Executors.defaultThreadFactory();
                //拒绝任务处理策略（抛弃旧的任务）
                RejectedExecutionHandler handler = new ThreadPoolExecutor.DiscardPolicy();

                mThreadPoolExecutor = new ThreadPoolExecutor(corePoolSize,maximumPoolSize,0, TimeUnit.MICROSECONDS,workQueue,threadFactory,handler);
            }
        }

        public void submit(Runnable task){
            if(mThreadPoolExecutor!=null){
                mThreadPoolExecutor.submit(task);
            }
        }

        public void execute(Runnable task){
            if(mThreadPoolExecutor!=null){
                mThreadPoolExecutor.execute(task);
            }
        }

        public void remove(Runnable task){
            if(mThreadPoolExecutor!=null){
                mThreadPoolExecutor.remove(task);
            }
        }

    }

}
