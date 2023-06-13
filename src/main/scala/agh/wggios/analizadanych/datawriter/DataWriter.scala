package agh.wggios.analizadanych.datawriter

import agh.wggios.analizadanych.{LoggingUtils, SparkSessionProvider}
import org.apache.spark.sql.{DataFrame, SparkSession}

object DataWriter extends SparkSessionProvider {
  def writeCsv(spark: SparkSession,df: DataFrame, path: String): Unit = {
    logError("Nie mogę zapisać bo testuję Error loga")
    df.write.option("header", true).format("csv").save(path)

  }
}
