package com.cr;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * Dubbo SPI可以使用键值对的方式获取实例
 */
public class GetImplByKey {

    public static void main(String[] args) {
        ExtensionLoader<Music> loader = ExtensionLoader.getExtensionLoader(Music.class);
        Music queen = loader.getExtension("queen");
        queen.singing();
    }

}
