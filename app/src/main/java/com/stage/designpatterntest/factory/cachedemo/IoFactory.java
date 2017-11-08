package com.stage.designpatterntest.factory.cachedemo;

/**
 * @author Djk
 * @Title: 工厂设计模式
 * @Time: 2017/11/8.
 * @Version:1.0.0
 */
public class IoFactory {
    private static volatile IoFactory mInstance;

    private IoFactory() {
    }

    public static IoFactory getInstace() {
        if (mInstance == null) {
            synchronized (IoFactory.class) {
                if (mInstance == null) {
                    mInstance = new IoFactory();
                }
            }
        }
        return mInstance;
    }

    private IoHandler getIoFactory(Class<? extends IoHandler> handlerClass) {
        try {
            return handlerClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private IoHandler mDiskIoHandler;

    public IoHandler getDiskIoHandler() {
        if (mDiskIoHandler != null) {
            return mDiskIoHandler;
        }
        mDiskIoHandler = getIoFactory(DiskIoHandler.class);
        return mDiskIoHandler;
    }

    private IoHandler mMemoryIoHandler;

    public IoHandler getMemoryIoHandler() {
        if (mMemoryIoHandler != null) {
            return mMemoryIoHandler;
        }
        mMemoryIoHandler = getIoFactory(MemoryIoHandler.class);
        return mMemoryIoHandler;
    }

}
