package uk.tw.energy.domain;



import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record MeterReadings(

        @NotNull
        String smartMeterId,

        @NotEmpty
        List<ElectricityReading> electricityReadings
) {}
