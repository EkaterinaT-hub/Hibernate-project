package org.example.CountryCache.redis;

import lombok.Data;
import org.example.CountryCache.domain.Continent;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class CityCountry {
    private Integer id;
    private String name;
    private Integer population;
    private String district;

    private String countryCode;
    private String alternativeCountryCode;
    private String countryName;
    private Integer countryPopulation;
    private String countryRegion;
    private BigDecimal countrySurfaceArea;
    private Continent continent;

    private Set<Language> languages;
}