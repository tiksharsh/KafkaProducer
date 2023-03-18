package com.example.kafka;

public class ConstantConfigurations {

    final static String appID = "producer-id1";
    final static String bootStrapServer ="localhost:9092, localhost:9093";
    final static String topicName = "all_orders";

    final static String[] serverData = {
            "10/28/22 13:15:02, 10.128.2.1, masternode, GET /css/main.css HTTP/1.1, 200",
            "10/28/22 13:15:05, 10.128.2.1, masternode, GET /css/main.css HTTP/1.2, 404",
            "10/28/22 13:15:08, 10.128.2.2, masternode, GET /css/main.css HTTP/1.2, 202",
            "10/28/22 13:15:33, 10.128.2.4, masternode, GET /css/main.css HTTP/1.2, 500",
            "10/28/22 13:16:05, 10.128.2.4, masternode, GET /css/main.css HTTP/1.1, 200",
            "10/28/22 13:16:09, 10.128.2.4, masternode, GET /css/main.css HTTP/1.1, 401",
            "10/28/22 13:18:18, 10.128.2.2, masternode, GET /css/main.css HTTP/1.1, 200",
            "10/28/22 13:18:31, 10.128.2.2, masternode, GET /css/main.css HTTP/1.2, 500",
            "10/28/22 13:18:35, 10.128.2.1, masternode, GET /css/main.css HTTP/1.2, 404",
            "10/28/22 13:20:48, 10.128.2.1, masternode, GET /css/main.css HTTP/1.2, 200",
            "10/28/22 13:20:51, 10.128.2.1, masternode, GET /css/main.css HTTP/1.2, 500",
            "10/28/22 13:22:01, 10.128.2.1, masternode, GET /css/main.css HTTP/1.1, 200",
            "10/28/22 13:22:01, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 200",
            "10/28/22 13:22:06, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 404",
            "10/28/22 13:22:08, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 202",
            "10/28/22 13:24:16, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 500",
            "10/28/22 13:24:24, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 200",
            "10/28/22 13:28:44, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 401",
            "10/28/22 13:29:04, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 200",
            "10/28/22 13:29:32, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 500",
            "10/28/22 13:29:58, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 404",
            "10/28/22 13:29:59, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 200",
            "10/28/22 13:30:00, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 500",
            "10/28/22 13:30:00, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 200",
            "10/28/22 13:15:02, 10.128.2.1, masternode, GET /css/main.css HTTP/1.1, 200",
            "10/28/22 13:15:05, 10.128.2.1, masternode, GET /css/main.css HTTP/1.2, 404",
            "10/28/22 13:15:08, 10.128.2.2, masternode, GET /css/main.css HTTP/1.2, 202",
            "10/28/22 13:15:33, 10.128.2.4, masternode, GET /css/main.css HTTP/1.2, 500",
            "10/28/22 13:16:05, 10.128.2.4, masternode, GET /css/main.css HTTP/1.1, 200",
            "10/28/22 13:16:09, 10.128.2.4, masternode, GET /css/main.css HTTP/1.1, 401",
            "10/28/22 13:18:18, 10.128.2.2, masternode, GET /css/main.css HTTP/1.1, 200",
            "10/28/22 13:18:31, 10.128.2.2, masternode, GET /css/main.css HTTP/1.2, 500",
            "10/28/22 13:18:35, 10.128.2.1, masternode, GET /css/main.css HTTP/1.2, 404",
            "10/28/22 13:20:48, 10.128.2.1, masternode, GET /css/main.css HTTP/1.2, 200",
            "10/28/22 13:20:51, 10.128.2.1, masternode, GET /css/main.css HTTP/1.2, 500",
            "10/28/22 13:22:01, 10.128.2.1, masternode, GET /css/main.css HTTP/1.1, 200",
            "10/28/22 13:22:01, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 200",
            "10/28/22 13:22:06, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 404",
            "10/28/22 13:22:08, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 202",
            "10/28/22 13:24:16, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 500",
            "10/28/22 13:24:24, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 200",
            "10/28/22 13:28:44, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 401",
            "10/28/22 13:29:04, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 200",
            "10/28/22 13:29:32, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 500",
            "10/28/22 13:29:58, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 404",
            "10/28/22 13:29:59, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 200",
            "10/28/22 13:30:00, 10.128.2.2, masternode, POST /css/main.css HTTP/1.1, 500",
            "10/28/22 13:30:00, 10.128.2.1, masternode, POST /css/main.css HTTP/1.1, 200"

    };

}
