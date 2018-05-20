package br.com.douglasramiro.imac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Pilot  implements Serializable {

    private Name name;
    private License license;
    private Address address;
    private Airplane airplane;
    private Class aClass;

}
