package com.mercant.real.estate.municipality.loadfile.core

import com.mercant.real.estate.municipality.loadfile.core.ConvertCaseClass.convertToSpecificCaseClass
import com.mercant.real.estate.municipality.loadfile.core.Document.readDocumentFromPath
import com.mercant.real.estate.municipality.loadfile.function.Functions
import com.mercant.real.estate.municipality.loadfile.model.{OmiValueSmell, OmiZoneSmell}

object ProcessFile{
  def loadFile(): Unit = {
    val omiValueSmell = readDocumentFromPath[OmiValueSmell]("/Users/fabianaspeeencina/Code/omi-load-file/src/main/resources/QI_1027287_1_20051_VALORI.csv")
    val omiValue = convertToSpecificCaseClass(omiValueSmell,Functions.convertToOmiValue)
    print(omiValue.columns.mkString("Array(", ", ", ")"))
    omiValue.show()

    val omiZoneSmell = readDocumentFromPath[OmiZoneSmell]("/Users/fabianaspeeencina/Code/omi-load-file/src/main/resources/QI_1027287_1_20051_ZONE.csv")
    val omiZone = convertToSpecificCaseClass(omiZoneSmell,Functions.convertToOmiZone)
    print(omiZone.columns.mkString("Array(", ", ", ")"))

    omiZone.show()

  }
}
