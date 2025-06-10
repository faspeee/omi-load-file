package com.mercant.real.estate.municipality.loadfile.model

import org.apache.spark.sql.Encoders

case class OmiValueSmell(Area_territoriale: String,
                          Regione: String,
                          Prov: String,
                          Comune_ISTAT: String,
                          Comune_cat: String,
                          Sez: String,
                          Comune_amm: String,
                          Comune_descrizione: String,
                          Fascia: String,
                          Zona: String,
                          LinkZona: String,
                          Cod_Tip: String,
                          Descr_Tipologia: String,
                          Stato: String,
                          Stato_prev: String,
                          Compr_min: String,
                          Compr_max: String,
                          Sup_NL_compr: String,
                          Loc_min: String,
                          Loc_max: String,
                          Sup_NL_loc: String,
                          _c21: String
                        )
object OmiValueSmell {
  implicit def barEncoder: org.apache.spark.sql.Encoder[OmiValueSmell] = Encoders.kryo[OmiValueSmell]
}