package agh.wggios.analizadanych.datareader
import org.apache.spark.sql.{DataFrame, SparkSession}
import agh.wggios.analizadanych.{LoggingUtils, SparkSessionProvider}


object DataReader extends SparkSessionProvider {
  def readCsv(spark: SparkSession,path: String): DataFrame = {
    logInfo("Czytanie pliku")
    spark.read.format("csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(path)
  }
}
