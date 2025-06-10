package com.mercant.real.estate.municipality.loadfile.core

import com.mercant.real.estate.municipality.loadfile.configuration.SparkConfiguration.spark
import org.apache.spark.sql.Dataset

import scala.reflect.runtime.universe.TypeTag

object ConvertCaseClass {
  def convertToSpecificCaseClass[I,O <:Product : TypeTag](datasetI: Dataset[I], function: I=>O):Dataset[O]={
    import spark.implicits._
    datasetI.map(element=>function.apply(element)).as[O]
  }
}
