package chapter01;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @Author: yexinming
 * @Description: HDFS类
 * @Date: 2021/5/29 9:10 上午
 */
public class HDFS {
    private static ReplicaFetcher fetcher = new ReplicaFetcher();

    private static WeakReference

    public static void main(String[] args) {
          loadReplicasFromDisk();
          fetcher.loadReplicaFromRemote();
    }

    public static void loadReplicasFromDisk(){
        ReplicaManager manager = new ReplicaManager();
        manager.load();
    }
}
