package pl.writech.week8.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteRequest {

    private String title;
    private String description;
    private String content;
    private String author;
}
