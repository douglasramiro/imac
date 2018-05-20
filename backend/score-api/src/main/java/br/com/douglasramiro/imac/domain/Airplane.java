package br.com.douglasramiro.imac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Airplane implements Serializable {
    private String model;
    private String manufacturer;
    private Engine engine;
    private String frequency;
}
