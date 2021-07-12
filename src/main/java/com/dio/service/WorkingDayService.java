package com.dio.service;

import com.dio.model.WorkingDay;
import com.dio.repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingDayService {


    WorkingDayRepository workingDayRepository;

    @Autowired
    public WorkingDayService(WorkingDayRepository workingDayRepository) {
        this.workingDayRepository = workingDayRepository;
    }
    public WorkingDay saveJornada(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    public List<WorkingDay> findAll() {
       return workingDayRepository.findAll();
    }

    public Optional<WorkingDay> getById(Long idJornada) {
        return workingDayRepository.findById(idJornada);
    }

    public WorkingDay updateJornada(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    public void deleteJornada(Long idJornada) { workingDayRepository.deleteById(idJornada); }
}
