
package com.example.taller3;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonaRepositorio extends Repository<persona, Integer> {
    List<persona>findAll();
    persona findOne(int id);
    persona save(persona p);
    void delete(persona p);
}
