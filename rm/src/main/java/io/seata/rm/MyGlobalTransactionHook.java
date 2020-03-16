package io.seata.rm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 一个自用的Hook类.
 *
 * @author tan liansheng on 2019-10-11 9:23
 */

public class MyGlobalTransactionHook implements GlobalTransactionHook {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyGlobalTransactionHook.class);

    private Class aClass;

    private String id;

    private String data;

    public MyGlobalTransactionHook(String id, String data) {
        this.id = id;
        this.data = data;
    }
    public MyGlobalTransactionHook(String id, String data, Class aClass) {
        this.id = id;
        this.data = data;
        this.aClass = aClass;
    }



    @Override
    public void afterCommit() {
        LOGGER.error("MyGlobalTransactionHook afterCommit__" + id + "__" + data);

    }


    @Override
    public void afterRollback() {
        LOGGER.error("MyGlobalTransactionHook afterRollback__" + id + "__" + data);

    }

}
