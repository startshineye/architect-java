package chapter01;

/**
 * @Author: yexinming
 * @Description: 抽象父类
 * @Date: 2021/5/29 10:54 下午
 */
public class AbstractReplicaManager {

    private int size;

    static {
        System.out.println("==AbstractReplicaManager static== ");
    }

    public AbstractReplicaManager(int size){
        System.out.println("==AbstractReplicaManager constructor before== size"+this.size);
        System.out.println("==AbstractReplicaManager constructor excuting== ");
        this.size = size;
        System.out.println("==AbstractReplicaManager constructor after==AbstractReplicaManager size"+this.size);
    }
}
