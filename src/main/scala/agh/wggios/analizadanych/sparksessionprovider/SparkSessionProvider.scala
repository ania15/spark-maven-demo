package agh.wggios.analizadanych.sparksessionprovider

import org.apache.spark.sql.SparkSession

object SparkSessionProvider {
  def createSparkSession(appName: String, master: String): SparkSession = {
    SparkSession.builder().appName(appName).master(master).getOrCreate()
  }
}
