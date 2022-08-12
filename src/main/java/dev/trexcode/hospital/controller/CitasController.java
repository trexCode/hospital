package dev.trexcode.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CitasController {

    @GetMapping(value = "citas")
    private String citas(Model model) {
        return "citas";
    }

    @GetMapping(value = "citas/modal")
    private String modalCitas(Model model) {
        return "modal";
    }
}
