package test;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: Seldom
 * @time: 2020/3/13 11:55
 */
@Slf4j(topic = "c.Test1")
public class Test {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                log.debug("running");
            }
        };

         t.setName("t1");
         t.start();

         log.debug("run");
    }
}
