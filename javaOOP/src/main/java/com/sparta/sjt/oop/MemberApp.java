package com.sparta.sjt.oop;

public class MemberApp {
    public static void main(String[] args) {
        Member m1 = new Member("Arz", "Arcanum", 1980, 12, 13);

        BaseballMember bm1 = new BaseballMember("Babe", "Ruth", 1, 2, 1993, "Pitcher");

        bm1.getPosition();

    }
}
