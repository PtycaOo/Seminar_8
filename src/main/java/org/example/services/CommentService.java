package org.example.services;

import org.example.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment){
        System.out.println("Опубликован " + comment.getText());
        return "SUCCESS";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
