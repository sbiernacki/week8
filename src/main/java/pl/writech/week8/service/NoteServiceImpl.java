package pl.writech.week8.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.writech.week8.domain.Note;
import pl.writech.week8.model.NoteRequest;
import pl.writech.week8.model.UpdateNoteRequest;
import pl.writech.week8.repository.NoteRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final NoteRepository noteRepository;

    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow(() -> new RuntimeException("Note doesn't exists!"));
    }

    @Override
    public void saveNote(NoteRequest noteRequest) {
        Note note = new Note();

        BeanUtils.copyProperties(noteRequest, note);
        note.setCreated(LocalDateTime.now());

        noteRepository.save(note);
        logger.info("Zapisano notatkę: " + note);
    }

    @Override
    public void updateNote(UpdateNoteRequest updateNoteRequest) {
        noteRepository.update(updateNoteRequest.getId(), updateNoteRequest.getTitle(), updateNoteRequest.getDescription(), updateNoteRequest.getContent(), LocalDateTime.now());
    }
}
