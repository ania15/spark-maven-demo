package agh.wggios.analizadanych

import agh.wggios.analizadanych.datareader.DataReader
import agh.wggios.analizadanych.datawriter.DataWriter
import org.apache.spark.sql.SparkSession

object Main {

  def main(args: Array[String]): Unit = {
    val sparksession = SparkSession.builder().appName("apka").master("local[*]").getOrCreate()
    val data = DataReader.readCsv(sparksession, "C:/Users/Lenovo/Desktop/Infrastruktura Big Data/BigData/lab7/spark-maven-demo/src/main/resources/datasets/Product.csv")
    DataWriter.writeCsv(sparksession, data, "C:/Users/Lenovo/Desktop/Infrastruktura Big Data/BigData/lab7/spark-maven-demo/src/main/resources/target")
  }
}
