package pl.writech.week8.service;

import pl.writech.week8.domain.Note;
import pl.writech.week8.model.NoteRequest;
import pl.writech.week8.model.UpdateNoteRequest;

import java.util.List;

public interface NoteService {

    List<Note> getNotes();
    Note getNoteById(Long id);
    void saveNote(NoteRequest noteRequest);
    void updateNote(UpdateNoteRequest updateNoteRequest);

}
