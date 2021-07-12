package com.dio.controller;

import com.dio.model.WorkingDay;
import com.dio.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class WorkingDayController {

    @Autowired
    WorkingDayService WorkingDayService;

    @PostMapping
    public WorkingDay createJornada(@RequestBody WorkingDay workingDay) {
        return WorkingDayService.saveJornada(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getJornadaList() {
        return WorkingDayService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<WorkingDay> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(WorkingDayService.getById(idJornada).orElseThrow(() -> new Exception("Working day not found.")));
    }

    @PutMapping
    public WorkingDay updateJornada(@RequestBody WorkingDay workingDay) {
        return WorkingDayService.updateJornada(workingDay);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<WorkingDay> deleteById(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            WorkingDayService.deleteJornada(idJornada);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkingDay>) ResponseEntity.ok();
    }
}