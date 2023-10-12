package com.example.singleton;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Data //cria getters setters toString automatico

//@Scope("request") o escop singleton é padrão
//@Scope("singleton")
public class Config {
    private String formatoRelatorio = "html";
    private String formatoGraficos = "barras";
    private static final Config instance = new Config();

    public static final Config getInstance(){
        return instance;
    }

    /*public String getFormatoRelatoris() {
        return formatoRelatorio;
    }

    public void setFormatoRelatoris(String formatoRelatoris) {this.formatoRelatorio = formatoRelatoris;    }

    public String getFormatoGraficos() {
        return formatoGraficos;
    }
    public void setFormatoGraficos(String formatoGraficos) {
        this.formatoGraficos = formatoGraficos;
    }*/
}
