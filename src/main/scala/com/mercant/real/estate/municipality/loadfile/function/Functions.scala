package com.mercant.real.estate.municipality.loadfile.function

import com.mercant.real.estate.municipality.loadfile.model.{OmiValue, OmiValueSmell, OmiZone, OmiZoneSmell}

import java.time.LocalDateTime

object Functions {
  val convertToOmiValue : OmiValueSmell => OmiValue = omiValueSmell => {
    OmiValue(areaTerritoriale = omiValueSmell.Area_territoriale, regione = omiValueSmell.Regione,
      prov = omiValueSmell.Prov, comuneISTAT = omiValueSmell.Comune_ISTAT,
      comuneCat = omiValueSmell.Comune_cat, sez = omiValueSmell.Sez,
      comuneAmm = omiValueSmell.Comune_amm, comuneDescrizione = omiValueSmell.Comune_descrizione,
      fascia = omiValueSmell.Fascia, zona = omiValueSmell.Zona, linkZona = omiValueSmell.LinkZona,
      codTip = omiValueSmell.Cod_Tip, descrTipologia = omiValueSmell.Descr_Tipologia,
      stato = omiValueSmell.Stato, statoPrev = omiValueSmell.Stato_prev, comprMin = omiValueSmell.Compr_min,
      comprMax = omiValueSmell.Compr_max, supNLCompr = omiValueSmell.Sup_NL_compr, locMin = omiValueSmell.Loc_min,
      locMax = omiValueSmell.Loc_max, supNLLoc = omiValueSmell.Sup_NL_loc,
      localDateTime = LocalDateTime.now() // Assuming current time; adjust as needed
     )
  }

  val convertToOmiZone : OmiZoneSmell => OmiZone = omiZoneSmell => {
    OmiZone(areaTerritoriale = omiZoneSmell.Area_territoriale, regione = omiZoneSmell.Regione,
      prov = omiZoneSmell.Prov, comuneISTAT = omiZoneSmell.Comune_ISTAT,
      comuneCat = omiZoneSmell.Comune_cat, sez = omiZoneSmell.Sez,
      comuneAmm = omiZoneSmell.Comune_amm, comuneDescrizione = omiZoneSmell.Comune_descrizione,
      fascia = omiZoneSmell.Fascia, zona = omiZoneSmell.Zona, linkZona = omiZoneSmell.LinkZona,
      zonaDescr = omiZoneSmell.Zona_Descr, codTipPrev = omiZoneSmell.Cod_tip_prev, descrTipPrev = omiZoneSmell.Descr_tip_prev,
      statoPrev = omiZoneSmell.Stato_prev, microzona = omiZoneSmell.Microzona)
  }
}
