package chapter01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yexinming
 * @Description: 副本管理器
 * @Date: 2021/5/29 9:24 上午
 */
public class ReplicaManager extends AbstractReplicaManager{

    public static int flushInterval = Configuration.getInt("replica.flush.interval");

    public static Map<String,Replica> replicas;

    private Integer count;

    private int cnt;

    public ReplicaManager(){
        super(4);
        System.out.println("==ReplicaManager constructor 对象成员变量:count 之前=="+this.count);
        System.out.println("==ReplicaManager constructor 对象成员变量:cnt 之前=="+this.cnt);
        System.out.println("==ReplicaManager constructor 构造器方法执行==");
        this.count = 5;
        System.out.println("==ReplicaManager constructor 对象成员变量:count 之后=="+this.count);
    }

    static {
        System.out.println("==ReplicaManager static  类成员变量:flushInterval=="+ReplicaManager.flushInterval);
        System.out.println("==ReplicaManager static  成员变量:replicas=="+ReplicaManager.replicas);

        System.out.println("==ReplicaManager static 静态代码块执行==");
        loadReplicaFromDisk();
    }

    public static void loadReplicaFromDisk(){
        System.out.println("==ReplicaManager loadReplicaFromDisk =从本地加载副本");
        ReplicaManager.replicas = new HashMap<String, Replica>();
    }

    public void load(){
        System.out.println("==ReplicaManager load =ReplicaManager加载");
    }

    public static void main(String[] args) {
        ReplicaManager manager = new ReplicaManager();
        manager.load();
    }
}
