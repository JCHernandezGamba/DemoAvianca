package com.avianca.qa.questions;

import com.avianca.qa.userinterfaces.SeleccionVueloUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class InformacionVuelo implements Question<Boolean> {
    @Override
    @Step("{0} valida el valor de la tarifa en el menu superior")
    public Boolean answeredBy(Actor actor) {
        return SeleccionVueloUI.BOTON_VUELO_HOY_VALOR.resolveFor(actor).getText().contains("$");
    }
    public static InformacionVuelo menuSuperior(){
        return new InformacionVuelo();
    }
}
