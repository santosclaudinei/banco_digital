package com.digitalinnovation;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {

    public String nomeBanco;
    protected List<Conta> contas;

}
