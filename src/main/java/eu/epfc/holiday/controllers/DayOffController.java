package eu.epfc.holiday.controllers;

import eu.epfc.holiday.entities.DayOff;
import eu.epfc.holiday.repositories.DayOffRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DayOffController {
    private DayOffRepository repository;

    public DayOffController(DayOffRepository repository) {
        this.repository = repository;
    }

    @GetMapping("consult")
    public String consult(Model model) {
        List<DayOff> dayOffs = repository.findAll();
        model.addAttribute("dayOffs", dayOffs);
        System.out.println("DayOffController.consult invoqué");
        return "consult";
    }
}
