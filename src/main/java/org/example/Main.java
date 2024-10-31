package org.example;

import org.example.configuration.ProjectConfiguration;
import org.example.model.Comment;
import org.example.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("First comment");
        comment.setAuthor("Никита");
        String value = service.publishComment(comment);
    }
}