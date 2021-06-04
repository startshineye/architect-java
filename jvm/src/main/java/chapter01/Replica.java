package chapter01;

import java.io.Serializable;

/**
 * @Author: yexinming
 * @Description: 副本
 * @Date: 2021/5/29 9:33 上午
 */
public class Replica implements Serializable {
    private String replicaName;
    private String hostname;
    private int port;
}
