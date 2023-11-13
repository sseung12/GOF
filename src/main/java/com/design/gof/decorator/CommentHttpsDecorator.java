package com.design.gof.decorator;

public class CommentHttpsDecorator extends CommentDecorator{
    public CommentHttpsDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void writeMessage(String message) {
        if(!isHttps(message)){
            super.writeMessage("error");
        }else {
            super.writeMessage(message);
        }
    }

    public boolean isHttps(String message){
        return message.contains("https");
    }
}
