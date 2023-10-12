package com.example.singleton;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/relatorio")
@AllArgsConstructor
public class RelatorioController {
    /* public ConfigController(Config config) {
        this.config = config;
    }*/

    private Config config;

    @GetMapping()
    public Config getConfig(){return config;}

    @GetMapping("/update")
    public Config updateConfig(){
        config.setFormatoGraficos("Pizza");
        return config;
    }
}
