package com.avrm.turism.domain;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

@Convert()
public class RegionConverter implements AttributeConverter<Region, String> {
    @Override
    public String convertToDatabaseColumn(Region region) {
        return region.getLabel();
    }

    @Override
    public Region convertToEntityAttribute(String s) {
        return Region.findByLabel(s);
    }
}
