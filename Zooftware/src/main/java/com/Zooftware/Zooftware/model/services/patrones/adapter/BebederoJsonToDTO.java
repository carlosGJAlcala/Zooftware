package com.Zooftware.Zooftware.model.services.patrones.adapter;

import com.Zooftware.Zooftware.model.dto.comida.BebederoEntityDto;

public class BebederoJsonToDTO extends BebederoEntityDto {

    private int id_habita;

    public BebederoJsonToDTO(BebederoJson bebederoJson) {
        super(bebederoJson.getId(), bebederoJson.getCantidad());
        id_habita=bebederoJson.getHabita_id();
    }

    public int getId_habita() {
        return id_habita;
    }
}
