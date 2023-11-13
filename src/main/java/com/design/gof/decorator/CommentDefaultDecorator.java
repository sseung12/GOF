package com.design.gof.decorator;

public class CommentDefaultDecorator implements CommentService{
    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}
