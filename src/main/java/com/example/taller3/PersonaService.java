
package com.example.taller3;

import java.util.List;

public interface PersonaService {
    
    List<persona>listar();
    persona listarId(int id);
    persona add(persona p);
    persona edit(persona p);
    persona eliminar(int id);
    
    
}
