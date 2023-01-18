package com.msb.composite;

/**
 * 树形结构测试类
 *
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/18 13:18
 */
public class Main {

    public static void main(String[] args) {
        // 创建根节点
        Directory rootDir = new Directory("root");

        // 创建树枝节点
        Directory binDir = new Directory("bin");
        // 向bin目录添加叶子节点
        binDir.add(new File("vi", 10000))
                .add(new File("test", 20000));

        Directory tmpDir = new Directory("tmp");

        Directory usrDir = new Directory("usr");
        Directory mysqlDir = new Directory("mysql");
        mysqlDir.add(new File("my.cnf", 30))
                .add(new File("test.db", 25000));
        usrDir.add(mysqlDir);

        //将所有子文件夹封装到根节点
        rootDir.add(binDir).add(tmpDir).add(usrDir);

        rootDir.printList("");
    }
}
