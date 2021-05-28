package pl.writech.week8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.writech.week8.domain.Note;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {


    @Transactional
    @Modifying
    @Query(value = "UPDATE Note n set n.title = :title, n.description = :description, n.content = :content, n.updated = :updated where n.id = :id")
    void update(@Param("id") Long id, @Param("title") String title, @Param("description") String description, @Param("content") String content, @Param("updated") LocalDateTime updated);
}
