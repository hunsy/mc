package com.hunsy.commons.constants;

import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.DateTime;

/**
 * 生成id
 *
 * @author hunsy
 * @date 2018/2/23
 */
public class GenerateId {


    /**
     * 生成id
     *
     * @return
     */
    public static String getId() {

        return DateTime.now().getMillis() + RandomStringUtils.randomAlphanumeric(16);
    }

}
