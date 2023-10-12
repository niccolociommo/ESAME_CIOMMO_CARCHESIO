package com.example.demo.presenza.presenzaservice;

import com.example.demo.presenza.presenzarepository;
import com.example.demo.presenza.presenza;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class presenzaserviceimpl implements presenzaservice{

    private final presenzarepository presenzarepository;

    public presenzaserviceimpl(com.example.demo.presenza.presenzarepository presenzarepository) {
        this.presenzarepository = presenzarepository;
    }


    @Override
    public presenza createpresenza(presenza presenza) {
        return presenzarepository.save(presenza);
    }

    @Override
    public presenza updatepresenza(presenza presenza) {
        return presenzarepository.save(presenza);
    }

    @Override
    public void deletepresenza(Long id) {
        return presenzarepository.deleteById(id);

    }

    @Override
    public List<presenza> getallpresenza() {
        return presenzarepository.findAll();
    }

    @Override
    public presenza getpresenza(Long id) {
        return presenzarepository.findById(id).orElseThrow()
    }
}
