package com.avianca.qa.tasks;

import com.avianca.qa.models.ReservaModel;
import com.avianca.qa.utils.Fechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.avianca.qa.userinterfaces.ReservaUI.*;

public class Reservar implements Task {
    private ReservaModel datosReserva;

    public Reservar(ReservaModel datosReserva) {
        this.datosReserva = datosReserva;
    }

    @Override
    @Step("{0} registra los datos para realizar reserva")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(MENU_SOLO_IDA),
                Enter.theValue(datosReserva.getDesde()).into(CAMPO_DESDE),
                Click.on(SELECCIONAR_DESDE_LISTA),
                Enter.theValue(datosReserva.getHacia()).into(CAMPO_HACIA),
                Click.on(SELECCIONAR_HACIA_LISTA),

                Click.on(CAMPO_FECHA_IDA),
                Click.on(SELECCION_FECHA_IDA.of(Fechas.fechaDiaActual().toString())),

                Click.on(CAMPO_AGREGAR_PASAJEROS),
                Agregar.pasajero(BOTON_AGREGAR_ADULTO,Integer.parseInt(datosReserva.getAdultos())-1),
                Agregar.pasajero(BOTON_AGREGAR_NINIO,Integer.parseInt(datosReserva.getNinios())),
                Agregar.pasajero(BOTON_AGREGAR_BEBE,Integer.parseInt(datosReserva.getBebes())),
                Click.on(BOTON_CONTINUAR_PASAJERO),
                Click.on(BOTON_BUSCAR_VUELO)
        );

    }

    public static Performable soloIda(ReservaModel datosReserva){
        return Tasks.instrumented(Reservar.class,datosReserva);
    }

}
