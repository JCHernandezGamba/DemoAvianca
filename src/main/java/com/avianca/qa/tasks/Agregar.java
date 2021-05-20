package com.avianca.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;


public class Agregar implements Task {

    private Target botonAgregar;
    private int cantidadPasajeros;


    public Agregar(Target botonAgregar, int cantidad) {
        this.botonAgregar = botonAgregar;
        this.cantidadPasajeros = cantidad;
    }

    @Override
    @Step("{0} agrega pasajeros a la reserva")
    public <T extends Actor> void performAs(T actor) {
        for(int contador = 1;contador<= cantidadPasajeros;contador++){
            actor.attemptsTo(Click.on(botonAgregar));
        }
    }

    public static Performable pasajero(Target botonAgregar,int cantidad){
        return Tasks.instrumented(Agregar.class,botonAgregar,cantidad);
    }
}
