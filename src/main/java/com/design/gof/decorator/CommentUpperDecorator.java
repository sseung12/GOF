package com.design.gof.decorator;

public class CommentUpperDecorator extends CommentDecorator{
    public CommentUpperDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void writeMessage(String message) {
        super.writeMessage(message.toUpperCase());
    }

}
