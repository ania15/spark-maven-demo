package agh.wggios.analizadanych.datatransform
import agh.wggios.analizadanych.{LoggingUtils, SparkSessionProvider}
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.sql.functions.col

object DataTransform extends SparkSessionProvider {
  def multiplyColumn(df: DataFrame, column: String, scalar: Double): DataFrame = {
    logWarning("Transformacja")
    df.withColumn(column, col(column) * scalar)
  }
}
