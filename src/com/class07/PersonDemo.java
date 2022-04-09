package com.class07;

public class PersonDemo {
    public static void main(String[] args) {
        PingPongPlayer pingpongPlayer = new PingPongPlayer();
        pingpongPlayer.setName("王浩");
        pingpongPlayer.setAge(30);
        System.out.println(pingpongPlayer.getName()+","+pingpongPlayer.getAge());
        pingpongPlayer.eat();
        pingpongPlayer.study();
        pingpongPlayer.speak();
    }
}
