package com.dm.build.pack;

import com.dm.build.base.Packing;

/**
 * @author Administrator
 * @version V1.0
 * @ClassName:Wrapper
 * @Description: 实现包装类接口-》纸盒包装
 * @date 2019/12/3
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
