package com.PanditGeneralStore.Accessories;

import jakarta.persistence.AttributeConverter;

public class statusConverter implements AttributeConverter<String,Boolean> {
    @Override
    public Boolean convertToDatabaseColumn(String attribute) {
        if(attribute ==  null){
            return null;
        }
        return attribute.equals("InStock");
    }

    @Override
    public String convertToEntityAttribute(Boolean dbData) {
        if(dbData ==null){
            return null;
        }
        return dbData ? "In stock":"Out of Stock";
    }
}
