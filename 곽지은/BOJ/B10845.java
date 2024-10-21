//문제링크 https://www.acmicpc.net/problem/10845
//시간 296ms
//메모리 20432KB


import java.io.*;

class MyQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int maxSize;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void push(int X) {
        if (size == maxSize) {
            System.out.println("공간 초과");
        } else {
            rear++;
            queue[rear] = X;
            size++;
        }
    }

    public int pop() {
        if (size == 0) {
            return -1;
        } else {
            int item = queue[front];
            front++;
            size--;
            return item;
        }
    }

    public int size() {
        return size;
    }

    public int empty() {
        return size == 0 ? 1 : 0;
    }

    public int front() {
        if (size == 0) {
            return -1;
        } else {
            return queue[front];
        }
    }

    public int back() {
        if (size == 0) {
            return -1;
        } else {
            return queue[rear];
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        MyQueue queue = new MyQueue(n); 
        
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            
            switch (command[0]) {
                case "push":
                    int X = Integer.parseInt(command[1]);
                    queue.push(X);
                    break;

                case "pop":
                    System.out.println(queue.pop());
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    System.out.println(queue.empty());
                    break;

                case "front":
                    System.out.println(queue.front());
                    break;

                case "back":
                    System.out.println(queue.back());
                    break;
            }
        }
    }
}
