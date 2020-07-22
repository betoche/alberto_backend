package com.alberto.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.alberto.backend")
@EnableJpaRepositories("com.alberto.backend.repositories")
@EntityScan("com.alberto.backend.entities")
public class DemoApplication {
   
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
        /**
         * Marca            Cacique             Lala
         * Producto         Jamon, Chorizo      Leche, Helado, Paleta, Yogurt
         * Tipo             
         * Presentacion     120Gr, 200Gr        
         */

/**
 *     POJO                          Entity    Repository   Service   Controller
       AdministrativeDemarcationBase               ✓           
  01 - AdministrativeDemarcation        ✓          ✓          ✓
  02 - BaseUnit                         ✓          ✓          ✓          ✓
  03 - Brand                            ✓          ✓          ✓          ✓
  04 - Budget                           ✓          ✓
  05 - BudgetClassification             ✓          ✓          ✓
  06 - BudgetClassificationDetail       ✓          ✓
  07 - BudgetConsumptionDetail          ✓          ✓
  08 - Company                          ✓          ✓
  09 - Consumption                      ✓
  10 - ConversionRate                   ✓          ✓          ✓          ✓
  11 - Country                          ✓          ✓          ✓          ✓
  12 - Currency                         ✓          ✓          ✓          ✓
  13 - Department                       ✓          ✓          ✓          ✓
        HOME                                                              ✓
  14 - MeasurementUnit                  ✓          ✓          ✓          ✓
  15 - Person                           ✓          ✓
  16 - Product
  17 - ProductType                      ✓          ✓          ✓          ✓
  18 - ProductDetail
  19 - Province
  20 - Region
  21 - Service
  22 - Service Detail
  23 - State
       UserBase                                    ✓
  24 - User                             ✓          ✓

*/
	}

}
