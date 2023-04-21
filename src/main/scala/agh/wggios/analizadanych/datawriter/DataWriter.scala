package agh.wggios.analizadanych.datawriter

import org.apache.spark.sql.{DataFrame, SparkSession}

object DataWriter {
  def writeCsv(spark: SparkSession,df: DataFrame, path: String): Unit = {
    df.write.option("header", true).format("csv").save(path)
  }
}
