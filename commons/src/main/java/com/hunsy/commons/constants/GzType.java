package com.hunsy.commons.constants;

import java.util.Arrays;

/**
 * @author hunsy
 * @date 2018/2/23
 */
public enum GzType {
    JS("圈舍", 1),
    SB("设备", 2);

    private String name;
    private int type;

    GzType(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    /**
     * 根据类型值获取类型枚举
     *
     * @param type
     * @return
     */
    public static GzType findByType(int type) {

        return Arrays.stream(GzType.values()).filter(t -> t.type == type).findFirst().get();
    }

}
