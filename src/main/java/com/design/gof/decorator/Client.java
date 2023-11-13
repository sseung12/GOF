package com.design.gof.decorator;

public class Client {

    private final CommentService commentService;


    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeMessage(String message){
        commentService.writeMessage(message);
    }
}
