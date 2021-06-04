package chapter01;

import java.util.HashMap;

/**
 * @Author: xiexinming
 * @Description: 从远程拉取副本
 * @Date: 2021/5/29 9:25 上午
 */
public class ReplicaFetcher {
    /**
     * 从远程加载副本
     */
    public void loadReplicaFromRemote(){
        System.out.println("从本地加载副本");
        ReplicaManager.replicas = new HashMap<String, Replica>();
    }
}
