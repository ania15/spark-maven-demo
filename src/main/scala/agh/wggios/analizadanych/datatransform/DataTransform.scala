package agh.wggios.analizadanych.datatransform

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.sql.functions.col

object DataTransform {
  def multiplyColumn(df: DataFrame, column: String, scalar: Double): DataFrame = {
    df.withColumn(column, col(column) * scalar)
  }
}
