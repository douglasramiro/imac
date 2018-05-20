package br.com.douglasramiro.imac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Figure {
    private byte[] image;
    private String description;
    private Byte kFactor;
}
