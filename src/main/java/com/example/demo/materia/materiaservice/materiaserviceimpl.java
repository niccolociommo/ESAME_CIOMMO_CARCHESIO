package com.example.demo.materia.materiaservice;

import com.example.demo.materia.materia;
import com.example.demo.materia.materiarepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class materiaserviceimpl implements materiaservice{

    private final materiarepository materiarepository;

    public materiaserviceimpl(materiarepository materiarepository) {
        this.materiarepository = materiarepository;
    }
    @Override
    public materia createmateria(materia materia) {
        return materiarepository.save(materia);
    }

    @Override
    public materia updatemateria(materia materia) {
        return materiarepository.save(materia);
    }

    @Override
    public void deletemateria(Long id) {
        materiarepository.deleteById(id);

    }

    @Override
    public List<materia> getallmateria() {
        return materiarepository.findAll();
    }

    @Override
    public materia getmateria(Long id) {
        return materiarepository.findById(id).orElseThrow();
    }
}
