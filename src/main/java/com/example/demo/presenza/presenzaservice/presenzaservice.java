package com.example.demo.presenza.presenzaservice;

import com.example.demo.presenza.presenza;

import java.util.List;

public interface presenzaservice {

    presenza createpresenza(presenza presenza);

    presenza updatepresenza(presenza presenza);

    void deletepresenza(Long id);

    List<presenza> getallpresenza();

    presenza getpresenza(Long id);
}
