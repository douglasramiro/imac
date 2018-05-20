package br.com.douglasramiro.imac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Address  implements Serializable {

    private String streetName;
    private String streetNumber;
    private String city;
    private String state;
    private String country;
}
