package com.example.depd.injec.DependencyInjection.service.Impl;

import com.example.depd.injec.DependencyInjection.service.BluePrinter;
import com.example.depd.injec.DependencyInjection.service.ColorPrinter;
import com.example.depd.injec.DependencyInjection.service.GreenPrinter;
import com.example.depd.injec.DependencyInjection.service.YellowPrinter;

public class ColorPrinterImpl implements ColorPrinter {

    private final BluePrinter bluePrinter;
    private final GreenPrinter greenPrinter;
    private final YellowPrinter yellowPrinter;


    public ColorPrinterImpl(BluePrinter bluePrinter, GreenPrinter greenPrinter, YellowPrinter yellowPrinter) {

        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.yellowPrinter = yellowPrinter;

    }

    @Override
    public String print() {
        return String.join(",", bluePrinter.print(),greenPrinter.print(), yellowPrinter.print());
    }
}
