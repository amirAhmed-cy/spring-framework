package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("Email")
public class CommentEmailNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending Email notification for comment: " + comment.getText());
    }

}
