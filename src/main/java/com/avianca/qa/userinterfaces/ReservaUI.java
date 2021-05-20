package com.avianca.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReservaUI {

    public static final Target MENU_SOLO_IDA = Target.the("Menu solo ida")
            .locatedBy("//a[contains(text(),'Solo ida')]");

    public static final Target CAMPO_DESDE = Target.the("Campo de texto: Desde")
            .locatedBy("(//input[contains(@id,'pbOrigen_') and contains(@data-msg,'Selecciona un origen')])[2]");

    public static final Target SELECCIONAR_DESDE_LISTA = Target.the("Selecciona desde el listado - Desde")
            .locatedBy("(//div[contains(@class,'bs-list-countries')]/ul/li)[1]");

    public static final Target CAMPO_HACIA = Target.the("Campo de texto: Hacia")
            .locatedBy("(//input[contains(@id,'bDestino_') and contains(@data-msg,'Selecciona un destino')])[2]");

    public static final Target SELECCIONAR_HACIA_LISTA = Target.the("Selecciona desde el listado - Hacia")
            .locatedBy("(//div[contains(@class,'bs-list-countries')]/ul/li)[3]");

    public static final Target CAMPO_FECHA_IDA = Target.the("Campo de seleccion de fecha - ida")
            .locatedBy("(//input[@name='pbFechaIda'])[2]");

    public static final Target SELECCION_FECHA_IDA = Target.the("Seleccion de fecha - ida")
            .locatedBy("(//td[contains(@data-date,'{0}')])[3]");

    public static final Target CAMPO_AGREGAR_PASAJEROS = Target.the("Campo agregar pasajeros")
            .locatedBy("(//i[contains(text(),'person_add')])[2]");

    public static final Target BOTON_AGREGAR_ADULTO = Target.the("Boton agregar adulto")
            .locatedBy("(//div[@class='plus control']/i)[7]");

    public static final Target BOTON_AGREGAR_NINIO = Target.the("Boton agregar niño")
            .locatedBy("(//div[@class='plus control']/i)[8]");

    public static final Target BOTON_AGREGAR_BEBE = Target.the("Boton agregar bebe")
            .locatedBy("(//div[@class='plus control']/i)[9]");

    public static final Target BOTON_CONTINUAR_PASAJERO = Target.the("Boton continuar reserva")
            .locatedBy("(//button[contains(@class,'btn btn-secondary secondary close-me')])[2]");

     public static final Target BOTON_BUSCAR_VUELO = Target.the("Boton buscar vuelos")
            .locatedBy("(//button[@title='Buscar vuelos'])[4]");





}
