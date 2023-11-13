package com.design.gof.decorator;

public class CommentDecorator implements CommentService{

    private final CommentService commentService;

    public CommentDecorator(CommentService commentService){
        this.commentService = commentService;
    }

    @Override
    public void writeMessage(String message) {
        commentService.writeMessage(message);
    }
}
