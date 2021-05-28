package pl.writech.week8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.writech.week8.domain.Note;
import pl.writech.week8.model.NoteRequest;
import pl.writech.week8.model.UpdateNoteRequest;
import pl.writech.week8.service.NoteService;

import java.util.List;

@RestController
@RequestMapping("/api/note")
public class NotebookApi {

    private final NoteService noteService;

    @Autowired
    public NotebookApi(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Note>> getNotes() {
        List<Note> notes = noteService.getNotes();
        if (notes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(notes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Note> getNoteById(@PathVariable Long id) {
        Note note = noteService.getNoteById(id);
        return new ResponseEntity<>(note, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody NoteRequest noteRequest) {
        noteService.saveNote(noteRequest);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody UpdateNoteRequest updateNoteRequest) {
        noteService.updateNote(updateNoteRequest);
        return new ResponseEntity(HttpStatus.OK);
    }
}
