package br.com.douglasramiro.imac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Contest {
    private Address address;
    private Date startDate;
    private Date endDate;
}
