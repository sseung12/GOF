package com.design.gof.decorator;

/*


 */
public class Application {

    public static void main(String[] args) {

        boolean isUpper = true;
        boolean isHttps = true;

        CommentService commentService = new CommentDefaultDecorator();
        if(isUpper){
            commentService = new CommentUpperDecorator(commentService);
        }
        if(isHttps){
            commentService = new CommentHttpsDecorator(commentService);
        }

        Client client = new Client(commentService);

        client.writeMessage("abc1234g");
        client.writeMessage("https://localhost");
    }
}
