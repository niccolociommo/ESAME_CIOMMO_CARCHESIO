package com.example.demo.docente.docenteservice;

import com.example.demo.docente.docente;
import com.example.demo.docente.docenterepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class docenteserviceimpl implements docenteservice{

    private final docenterepository docenterepository;

    public docenteserviceimpl(docenterepository docenterepository) {
        this.docenterepository = docenterepository;
    }
    @Override
    public docente createdocente(docente docente) {
        return docenterepository.save(docente);
    }

    @Override
    public docente updatedocente(docente docente) {
        return docenterepository.save(docente);
    }

    @Override
    public void deletedocente(Long id) {
        docenterepository.deleteById(id);

    }

    @Override
    public List<docente> getalldocente() {
        return docenterepository.findAll()
    }

    @Override
    public docente getdocente(Long id) {
        return docenterepository.findById(id).orElseThrow();
    }
}
