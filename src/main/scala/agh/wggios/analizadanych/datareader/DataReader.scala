package agh.wggios.analizadanych.datareader
import org.apache.spark.sql.{DataFrame, SparkSession}


object DataReader {
  def readCsv(spark: SparkSession,path: String): DataFrame = {
    spark.read.format("csv")
      .option("header", "true")
      .option("inferSchema", "true")
      .load(path)
  }
}
