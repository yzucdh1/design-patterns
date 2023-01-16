package com.msb.builder.product;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/1/16 13:52
 */
public class RabbitMQClient {

    private RabbitMQClient() {
    }

    private String host = "127.0.0.1";

    private int port = 5672;

    private int mode;

    private String exchange;

    private String queue;

    private boolean isDurable = true;

    private int connectionTimeout = 1000;

    /**
     * 内部类的builder
     */
    public static class RabbitMQClientBuilder {

        private RabbitMQClient rabbitMQClient;

        public RabbitMQClientBuilder() {
            rabbitMQClient = new RabbitMQClient();
        }

        public RabbitMQClientBuilder host(String host) {
            rabbitMQClient.host = host;
            return this;
        }

        public RabbitMQClientBuilder port(int port) {
            rabbitMQClient.port = port;
            return this;
        }

        public RabbitMQClientBuilder mode(int mode) {
            rabbitMQClient.mode = mode;
            return this;
        }

        public RabbitMQClientBuilder exchange(String exchange) {
            rabbitMQClient.exchange = exchange;
            return this;
        }

        public RabbitMQClientBuilder queue(String queue) {
            rabbitMQClient.queue = queue;
            return this;
        }

        public RabbitMQClientBuilder isDurable(boolean isDurable) {
            rabbitMQClient.isDurable = isDurable;
            return this;
        }

        public RabbitMQClientBuilder connectionTimeout(int connectionTimeout) {
            rabbitMQClient.connectionTimeout = connectionTimeout;
            return this;
        }

        public RabbitMQClient build() {
            if (rabbitMQClient.mode == 1) {
                // 工作队列模式不需要设计交换机,但是队列名称一定要有
                if (rabbitMQClient.exchange != null) {
                    throw new RuntimeException("工作队列模式无需设计交换机");
                }
                if (rabbitMQClient.queue == null || rabbitMQClient.queue.trim().equals("")) {
                    throw new RuntimeException("工作队列模式名称不能为空");
                }
                if (!rabbitMQClient.isDurable) {
                    throw new RuntimeException("工作队列模式必须开启持久化");
                }
            } else if (rabbitMQClient.mode == 2) {
                // 路由模式必须设计交换机,但是不能设计队列
                if (rabbitMQClient.exchange == null) {
                    throw new RuntimeException("路由模式下必须设置交换机");
                }
                if (rabbitMQClient.queue != null) {
                    throw new RuntimeException("路由模式无须设计队列名称");
                }
            }
            return rabbitMQClient;
        }
    }

    public void sendMessage(String message) {
        System.out.println("发送MQ消息,host:" + host + ",port:" + port + ",message:" + message);
    }
}
