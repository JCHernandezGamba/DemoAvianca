package com.avianca.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionVueloUI {

    public static final Target BOTON_VUELO_HOY_VALOR = Target.the("Boton vuelo dia actual")
            .locatedBy("//div[@id='dates-container']/button[1]/div[3]");

}
