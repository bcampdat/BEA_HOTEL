package com.ipartek.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Habitacion {

    private int id;
    private int num_hab;
    private int m_cuadrados;
    private double precio;
    private int num_camas;
    private boolean exterior;

}