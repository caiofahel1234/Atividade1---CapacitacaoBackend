package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class MensagemController {

    @GetMapping("/mensagem")
    public Map<String, String> getMensagem() {
        return Map.of("mensagem", "Bem-vindo à trilha Backend!");
    }
}