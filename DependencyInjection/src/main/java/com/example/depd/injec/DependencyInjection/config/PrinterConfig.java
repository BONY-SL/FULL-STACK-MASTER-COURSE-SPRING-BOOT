package com.example.depd.injec.DependencyInjection.config;

import com.example.depd.injec.DependencyInjection.service.BluePrinter;
import com.example.depd.injec.DependencyInjection.service.GreenPrinter;
import com.example.depd.injec.DependencyInjection.service.Impl.ColorPrinterImpl;
import com.example.depd.injec.DependencyInjection.service.Impl.EngBluePrinter;
import com.example.depd.injec.DependencyInjection.service.Impl.EngGreenPrinter;
import com.example.depd.injec.DependencyInjection.service.Impl.EngYellowPrinter;
import com.example.depd.injec.DependencyInjection.service.YellowPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){
        return new EngBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EngGreenPrinter();
    }

    @Bean
    public YellowPrinter yellowPrinter(){
        return new EngYellowPrinter();
    }

    @Bean
    public ColorPrinterImpl colorPrinter(BluePrinter bluePrinter,
                                         GreenPrinter greenPrinter,
                                         YellowPrinter yellowPrinter){

        return new ColorPrinterImpl(bluePrinter,greenPrinter,yellowPrinter);
    }

}
