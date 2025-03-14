package com.example.depd.injec.DependencyInjection.service.Impl;

import com.example.depd.injec.DependencyInjection.service.YellowPrinter;

public class EngYellowPrinter implements YellowPrinter {
    @Override
    public String print() {
        return "Yellow";
    }
}
