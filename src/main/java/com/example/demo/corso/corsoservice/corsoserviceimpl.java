package com.example.demo.corso.corsoservice;

import com.example.demo.corso.corso;
import com.example.demo.corso.corsorepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class corsoserviceimpl implements corsoservice{

    private final corsoserviceimpl corsoserviceimpl;
    private final com.example.demo.corso.corsorepository corsorepository;

    public corsoserviceimpl(com.example.demo.corso.corsoservice.corsoserviceimpl corsoserviceimpl, corsorepository corsorepository) {
        this.corsoserviceimpl = corsoserviceimpl;
        this.corsorepository = corsorepository;
    }

    @Override
    public corso createcorso(corso corso) {
        return corsorepository.save(corso);
    }

    @Override
    public void deletecorso(Long id) {
        corsorepository.deleteById(id);

    }

    @Override
    public List<corso> getAllcorso() {
        return corsorepository.findAll();
    }

    @Override
    public corso getcorso(Long id) {
        return corsorepository.findById(id).orElseThrow();
    }
}
