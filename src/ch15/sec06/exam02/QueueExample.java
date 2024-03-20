package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue 컬렉션 생성
        Queue<Message> messageQueue = new LinkedList<>();

        // 메세지 넣기
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "냥냥냥"));
        messageQueue.offer(new Message("sendKakaotalk", "멍멍멍"));

        while (!messageQueue.isEmpty()) { // 비어있지 않은 동안
            Message message = messageQueue.poll(); // 얘를 꺼내겠다

            switch (message.command){
                case "sendMail" -> System.out.println(message.to+ "님에게 메일을 보냅니다.");
                case "sendSMS" -> System.out.println(message.to);
                case "sendKakaotalk" -> System.out.println(message.to);


            }

        }

    }
}
